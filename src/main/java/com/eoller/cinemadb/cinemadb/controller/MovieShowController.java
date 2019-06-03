package com.eoller.cinemadb.cinemadb.controller;

import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import com.eoller.cinemadb.cinemadb.domain.Reservation;
import com.eoller.cinemadb.cinemadb.repository.MovieShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class MovieShowController {

    @Autowired
    private MovieShowRepository movieShowRepository;

    @GetMapping("/movieshow")
    public ResponseEntity getAllByMovieId(@RequestParam long movieId){
        return new ResponseEntity(movieShowRepository.getAllByMovieId(movieId), HttpStatus.OK);
    }

    @PostMapping("/movieshow")
    public ResponseEntity insert(@RequestBody MovieShow movieShow){
        return new ResponseEntity(movieShowRepository.insert(movieShow), HttpStatus.OK);
    }

    @DeleteMapping("/movieshow/{movieshowId}")
    public void removeById(@PathVariable long movieshowId){
        movieShowRepository.removeById(movieshowId);
    }

}
