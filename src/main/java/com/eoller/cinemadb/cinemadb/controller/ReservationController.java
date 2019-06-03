package com.eoller.cinemadb.cinemadb.controller;


import com.eoller.cinemadb.cinemadb.domain.MovieShowSeat;
import com.eoller.cinemadb.cinemadb.domain.Reservation;
import com.eoller.cinemadb.cinemadb.domain.security.User;
import com.eoller.cinemadb.cinemadb.repository.MovieShowSeatRepository;
import com.eoller.cinemadb.cinemadb.repository.ReservationRepository;
import com.eoller.cinemadb.cinemadb.repository.UserRepository;
import com.eoller.cinemadb.cinemadb.service.EmailSendService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private MovieShowSeatRepository movieShowSeatRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailSendService emailSendService;

    @GetMapping("/reservation")
    public ResponseEntity getAllUserReservation(Principal principal) {
        Optional<User> byUsername = userRepository.getByUsername(principal.getName());
        if (!byUsername.isPresent()) {
            return new ResponseEntity("Bad user id", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(reservationRepository.getByUserId(byUsername.get().getId()), HttpStatus.OK);
    }

    @PostMapping("/reservation")
    public ResponseEntity insert(@RequestBody Reservation reservation) {
        return new ResponseEntity(reservationRepository.insert(reservation), HttpStatus.OK);
    }

    @DeleteMapping("/reservation/{reservationId}")
    public void removeById(@PathVariable long reservationId) {
        reservationRepository.removeById(reservationId);
    }

    @PostMapping("/reservations")
    public void makeReservation(@RequestBody List<MovieShowSeat> movieShowSeatList, Principal principal) {
        movieShowSeatRepository.updateSeatStatus(movieShowSeatList);
        movieShowSeatList.forEach(movieShowSeat -> {
            Reservation reservation = new Reservation();
            reservation.setId(0);
            reservation.setMovieShowSeat(movieShowSeat);
            reservation.setPayed(true);
            Optional<User> byUsername = userRepository.getByUsername(principal.getName());
            reservation.setUser(byUsername.get());
            reservationRepository.insert(reservation);
            createAndSendEmail(movieShowSeat, reservation, byUsername.get());
        });
    }

    private void createAndSendEmail(MovieShowSeat movieShowSeat, Reservation reservation, User user) {
        StringBuilder builder = new StringBuilder();
        builder.append("Information about your reservation: ").append('\n')
                .append("Cinema: " + movieShowSeat.getSeat().getCinemaHall().getCinema().getName()).append('\n')
                .append("CinemaHall: " + movieShowSeat.getMovieShow().getCinemaHall().getHallNumber()).append('\n')
                .append("Seat: " + movieShowSeat.getSeat().getNumber()).append('\n')
                .append("Date: " + reservation.getMovieShowSeat().getMovieShow().getShowDate()).append('\n');
        emailSendService.sendEmail(user.getEmail(), "New reservation", builder.toString());
        System.out.println("Send reservation email to user: " + user.getUsername() + " " + user.getEmail());
    }
}