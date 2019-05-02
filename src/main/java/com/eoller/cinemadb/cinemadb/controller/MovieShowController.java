package com.eoller.cinemadb.cinemadb.controller;

import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import com.eoller.cinemadb.cinemadb.service.MovieShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieShowController {

    @Autowired
    private MovieShowService movieShowService;

    @GetMapping("/movieshow/{cinemaId}/{movieId}")
    public List<MovieShow> getMovieShowsByCinemaIdAndMovieId(@PathVariable Long cinemaId, @PathVariable Long movieId){
        return movieShowService.getAllByMovieIdAndCinemaId(movieId,cinemaId);
    }


}
