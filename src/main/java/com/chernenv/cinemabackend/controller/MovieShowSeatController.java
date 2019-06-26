package com.chernenv.cinemabackend.controller;

import com.chernenv.cinemabackend.repository.MovieShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieShowSeatController {

    @Autowired
    private MovieShowSeatRepository movieShowSeatRepository;

    @GetMapping("/movieshowseat")
    public ResponseEntity getAllByMovieShow(@RequestParam long movieShowId){
        return new ResponseEntity(movieShowSeatRepository.getAllByMovieShowId(movieShowId), HttpStatus.OK);
    }

}
