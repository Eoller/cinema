package com.eoller.cinemadb.cinemadb.controller;

import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import com.eoller.cinemadb.cinemadb.service.MovieShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class MovieShowController {

    @Autowired
    private MovieShowService movieShowService;

    @GetMapping("/movieshow/{cinemaId}/{movieId}")
    public List<MovieShow> getMovieShowsByCinemaIdAndMovieId(@PathVariable Long cinemaId, @PathVariable Long movieId){
        return movieShowService.getAllByMovieIdAndCinemaId(movieId,cinemaId);
    }

    @GetMapping("/movieshow/{cinemaId}")
    public List<MovieShow> getMovieShowsByCinemaIdAndDate(@PathVariable Long cinemaId, @RequestParam String date){
        SimpleDateFormat df = new SimpleDateFormat("MMddyyyy");
        Date dateToSearch;
        try {
            dateToSearch = df.parse(date);
        } catch (ParseException e) {
            dateToSearch = new Date();
            e.printStackTrace();
        }
        return movieShowService.getAllByCinemaIdAndDate(cinemaId,dateToSearch);
    }


}
