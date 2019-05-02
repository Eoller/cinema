package com.eoller.cinemadb.cinemadb.service;

import com.eoller.cinemadb.cinemadb.domain.CinemaHall;
import com.eoller.cinemadb.cinemadb.domain.Movie;
import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import com.eoller.cinemadb.cinemadb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private DirectorRepository directorRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CinemaHallRepository cinemaHallRepository;

    @Autowired
    private MovieShowRepository movieShowRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.getAll();
    }

    public List<Movie> getMoviesByCinemaId(long cinemaId){
        List<CinemaHall> cinemaHallsByCinemaId = cinemaHallRepository.getCinemaHallsByCinemaId(cinemaId);
        List<MovieShow> movieShowsInTheseCinemaHalls = movieShowRepository
                .getByCinemaHallIds(cinemaHallsByCinemaId.stream().map(CinemaHall::getId).collect(Collectors.toList()));
        Set<Long> movieIds = movieShowsInTheseCinemaHalls.stream()
                .map(movieShow -> movieShow.getMovie().getId()).collect(Collectors.toSet());
        return movieRepository.getByIds(movieIds);
    }


}
