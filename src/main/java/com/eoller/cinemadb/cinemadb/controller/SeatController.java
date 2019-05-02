package com.eoller.cinemadb.cinemadb.controller;

import com.eoller.cinemadb.cinemadb.domain.MovieShowSeat;
import com.eoller.cinemadb.cinemadb.domain.Seat;
import com.eoller.cinemadb.cinemadb.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeatController {

    @Autowired
    private SeatService seatService;

    @GetMapping("/seats/{movieShowId}")
    public List<MovieShowSeat> getAllByMovieShowId(@PathVariable Long movieShowId){
        return seatService.getAllSeatsByMovieShowId(movieShowId);
    }

}
