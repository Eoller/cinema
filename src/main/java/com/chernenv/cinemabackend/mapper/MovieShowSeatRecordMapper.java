package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.MovieShowSeatRecord;
import com.chernenv.cinemabackend.domain.MovieShowSeat;

public class MovieShowSeatRecordMapper {

    public MovieShowSeatRecord map(MovieShowSeat movieShowSeat){
        return new MovieShowSeatRecord(movieShowSeat.getId(),movieShowSeat.getMovieShow().getId(),
                movieShowSeat.getSeat().getId(),movieShowSeat.isSeatStatus());
    }
}
