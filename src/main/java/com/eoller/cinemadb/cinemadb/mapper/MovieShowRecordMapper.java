package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieShowRecord;

import java.sql.Date;

public class MovieShowRecordMapper {


    public MovieShowRecord map(MovieShow movieShow){
        return new MovieShowRecord(movieShow.getId(),new Date(movieShow.getShowDate().getTime()),
                movieShow.getShowTime(),movieShow.getCinemaHall().getId(),movieShow.getMovie().getId());
    }

}
