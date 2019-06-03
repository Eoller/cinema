package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.MovieShowSeat;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieShowSeatRecord;

public class MovieShowSeatRecordMapper {

    public MovieShowSeatRecord map(MovieShowSeat movieShowSeat){
        return new MovieShowSeatRecord(movieShowSeat.getId(),movieShowSeat.getMovieShow().getId(),
                movieShowSeat.getSeat().getId(),movieShowSeat.isSeatStatus());
    }
}
