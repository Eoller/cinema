package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.domain.MovieShow;
import com.chernenv.cinemabackend.domain.MovieShowSeat;
import com.chernenv.cinemabackend.domain.Seat;
import com.chernenv.cinemabackend.generated.tables.records.MovieShowSeatRecord;
import com.chernenv.cinemabackend.domain.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieShowSeatMapper {



    private Map<Long, Seat> seatMap;
    private Map<Long, MovieShow> movieShowMap;

    public MovieShowSeatMapper(List<Seat> seats, List<MovieShow> movieShows){
        this.seatMap = seats.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
        this.movieShowMap = movieShows.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
    }


    public MovieShowSeat map(MovieShowSeatRecord movieShowSeatRecord) {
        return new MovieShowSeat(movieShowSeatRecord.getId(),seatMap.get(movieShowSeatRecord.getSeatId()),
                movieShowMap.get(movieShowSeatRecord.getMovieShowId()),movieShowSeatRecord.getSeatStatus());
    }


}
