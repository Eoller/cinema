package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.MovieTrailerRecord;
import com.chernenv.cinemabackend.domain.MovieTrailer;

public class MovieTrailerRecordMapper {

    public MovieTrailerRecord map(MovieTrailer movieTrailer){
        return new MovieTrailerRecord(movieTrailer.getId(),movieTrailer.getCinema().getId(), movieTrailer.getTrailerUrl());
    }

}
