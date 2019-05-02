package com.eoller.cinemadb.cinemadb.service;

import com.eoller.cinemadb.cinemadb.domain.MovieShowSeat;
import com.eoller.cinemadb.cinemadb.domain.Seat;
import com.eoller.cinemadb.cinemadb.repository.MovieShowRepository;
import com.eoller.cinemadb.cinemadb.repository.MovieShowSeatRepository;
import com.eoller.cinemadb.cinemadb.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private MovieShowRepository movieShowRepository;

    @Autowired
    private MovieShowSeatRepository movieShowSeatRepository;


    public List<MovieShowSeat> getAllSeatsByMovieShowId(Long movieShowId) {
        return movieShowSeatRepository.getAllByMovieShowId(movieShowId);
    }
}
