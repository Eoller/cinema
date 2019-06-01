package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.MovieHasGenre;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieHasGenreRecord;

public class MovieHasGenreRecordMapper {

    public MovieHasGenreRecord map(MovieHasGenre movieHasGenre){
        return new MovieHasGenreRecord(movieHasGenre.getId(),movieHasGenre.getGenre().getId(),movieHasGenre.getMovie().getId());
    }

}
