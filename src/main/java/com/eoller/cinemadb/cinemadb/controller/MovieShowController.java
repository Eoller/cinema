package com.eoller.cinemadb.cinemadb.controller;

import com.eoller.cinemadb.cinemadb.domain.Movie;
import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import com.eoller.cinemadb.cinemadb.domain.Reservation;
import com.eoller.cinemadb.cinemadb.domain.dto.MovieMovieShowDto;
import com.eoller.cinemadb.cinemadb.repository.MovieRepository;
import com.eoller.cinemadb.cinemadb.repository.MovieShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@RestController
public class MovieShowController {

    @Autowired
    private MovieShowRepository movieShowRepository;

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movieshow")
    public ResponseEntity getAllByMovieId(@RequestParam long movieId){
        return new ResponseEntity(movieShowRepository.getAllByMovieId(movieId), HttpStatus.OK);
    }

    @PostMapping("/movieshow")
    public ResponseEntity insert(@RequestBody MovieShow movieShow){
        return new ResponseEntity(movieShowRepository.insert(movieShow), HttpStatus.OK);
    }

    @GetMapping("/movieshow/{id}")
    public ResponseEntity getById(@PathVariable long id){
        return new ResponseEntity(movieShowRepository.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/movieshow/{movieshowId}")
    public void removeById(@PathVariable long movieshowId){
        movieShowRepository.removeById(movieshowId);
    }

    @GetMapping("/movieshows")
    public ResponseEntity getByMovieIdAndCinemaId(@RequestParam(value = "cinemaId",required = true) Long cinemaId, @RequestParam(required = false,name = "movieId") Long movieId){
        List<MovieShow> showsByCinemaId = movieShowRepository.getByCinemaId(cinemaId);
        Set<Movie> movies = showsByCinemaId.stream().map(MovieShow::getMovie).collect(Collectors.toSet());
        List<MovieMovieShowDto> movieMovieShows = new ArrayList<>();
        movies.forEach(movie -> {
            List<MovieShow> movieShowList = showsByCinemaId.stream().filter(movie1 -> movie1.getMovie().getId() == movie.getId()).collect(toList());
            MovieMovieShowDto dto = new MovieMovieShowDto(movie, movieShowList);
            movieMovieShows.add(dto);
        });
        if(movieId != null){
            return new ResponseEntity(movieMovieShows.stream().filter(movieMovieShowDto ->
                    movieMovieShowDto.getMovie().getId() == movieId).collect(toList()), HttpStatus.OK);
        }
        return new ResponseEntity(movieMovieShows, HttpStatus.OK);
    }


}
