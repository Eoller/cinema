package com.eoller.cinemadb.cinemadb.controller;

import com.eoller.cinemadb.cinemadb.domain.Movie;
import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import com.eoller.cinemadb.cinemadb.repository.MovieRepository;
import com.eoller.cinemadb.cinemadb.repository.MovieShowRepository;
import com.eoller.cinemadb.cinemadb.repository.MovieShowSeatRepository;
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
        movieShowSeatRepository.removeByMovieId(movieId);
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
