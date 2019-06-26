package com.chernenv.cinemabackend.controller;

import com.chernenv.cinemabackend.repository.MovieRepository;
import com.chernenv.cinemabackend.repository.ReservationRepository;
import com.chernenv.cinemabackend.domain.Movie;
import com.chernenv.cinemabackend.domain.MovieShow;
import com.chernenv.cinemabackend.domain.MovieShowSeat;
import com.chernenv.cinemabackend.repository.MovieShowRepository;
import com.chernenv.cinemabackend.repository.MovieShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private MovieShowRepository movieShowRepository;
    @Autowired
    private MovieShowSeatRepository movieShowSeatRepository;
    @Autowired
    private ReservationRepository reservationRepository;


    @GetMapping("/movie")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<>(movieRepository.getAll(), HttpStatus.OK);
    }

    @GetMapping("/movie/{movieId}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long movieId){
        return new ResponseEntity<>(movieRepository.getById(movieId), HttpStatus.OK);
    }

    @PostMapping("/movie")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(movieRepository.insert(movie), HttpStatus.OK);
    }

    @PutMapping("/movie")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(movieRepository.update(movie), HttpStatus.OK);
    }

    @DeleteMapping("/movie/{movieId}")
    public ResponseEntity deleteMovieById(@PathVariable Long movieId){
        Set<Long> movieShowIds = movieShowRepository.getAllByMovieId(movieId).stream().map(MovieShow::getId).collect(Collectors.toSet());
        Set<Long> movieShowSeatIds = movieShowSeatRepository.getAllByMovieShowIds(movieShowIds).stream().map(MovieShowSeat::getId).collect(Collectors.toSet());
        reservationRepository.removeByMovieShowSeatsIds(movieShowSeatIds);
        movieShowSeatRepository.removeByMovieShowIds(movieShowIds);
        movieShowRepository.removeByMovieId(movieId);
        movieRepository.remove(movieId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/movies")
    public ResponseEntity getByCinema(@RequestParam long cinemaId){
        List<MovieShow> movieShows = movieShowRepository.getByCinemaId(cinemaId);
        Set<Movie> movies = movieShows.stream().map(MovieShow::getMovie).collect(Collectors.toSet());
        return new ResponseEntity(movies, HttpStatus.OK);
    }
}
