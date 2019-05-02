package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.MovieShowSeat;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieShowSeatRecord;

public class MovieShowSeatRecordMapper {

    public MovieShowSeatRecord map(MovieShowSeat movieShowSeat){
        String status;
        if(movieShowSeat.getSeatStatus() == 1){
            status = "1";
        }else status = "0";
        return new MovieShowSeatRecord(movieShowSeat.getId(),movieShowSeat.getMovieShow().getId(),
                movieShowSeat.getSeat().getId(),new Byte(status));
    }
}
