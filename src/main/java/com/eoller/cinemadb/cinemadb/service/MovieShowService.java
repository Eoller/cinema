package com.eoller.cinemadb.cinemadb.service;

import com.eoller.cinemadb.cinemadb.domain.CinemaHall;
import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import com.eoller.cinemadb.cinemadb.repository.CinemaHallRepository;
import com.eoller.cinemadb.cinemadb.repository.MovieRepository;
import com.eoller.cinemadb.cinemadb.repository.MovieShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MovieShowService {

    @Autowired
    private CinemaHallRepository cinemaHallRepository;

    @Autowired
    private MovieShowRepository movieShowRepository;

    @Autowired
    private MovieRepository movieRepository;


    public List<MovieShow> getAllByMovieIdAndCinemaId(Long movieId, Long cinemaId) {
        List<CinemaHall> cinemaHallsByCinemaId = cinemaHallRepository.getCinemaHallsByCinemaId(cinemaId);
        List<MovieShow> movieShows = movieShowRepository
                .getByCinemaHallIds(cinemaHallsByCinemaId.stream().map(CinemaHall::getId).collect(Collectors.toList()));
        return movieShows.stream().filter(movieShow -> movieShow.getMovie().getId() == movieId).collect(Collectors.toList());
    }

    public List<MovieShow> getAllByCinemaIdAndDate(Long cinemaId, Date date){
        List<Long> cinemaHallIds = cinemaHallRepository.getCinemaHallsByCinemaId(cinemaId)
                .stream().map(CinemaHall::getId).collect(Collectors.toList());
        return movieShowRepository.getByCinemaHallIdsAndDate(cinemaHallIds, date);
    }
}
