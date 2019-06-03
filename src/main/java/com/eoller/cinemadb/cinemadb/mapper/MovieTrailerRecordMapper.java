package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.MovieTrailer;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieTrailerRecord;

public class MovieTrailerRecordMapper {

    public MovieTrailerRecord map(MovieTrailer movieTrailer){
        return new MovieTrailerRecord(movieTrailer.getId(),movieTrailer.getCinema().getId(), movieTrailer.getTrailerUrl());
    }

}
