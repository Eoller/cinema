package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.*;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CinemaHallRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieShowSeatRecord;

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
