package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.MovieShowRecord;
import com.chernenv.cinemabackend.domain.MovieShow;

import java.sql.Date;

public class MovieShowRecordMapper {


    public MovieShowRecord map(MovieShow movieShow){
        return new MovieShowRecord(movieShow.getId(),new Date(movieShow.getShowDate().getTime()),
                movieShow.getShowTime(),movieShow.getCinemaHall().getId(),movieShow.getMovie().getId(),movieShow.getPrice());
    }

}
