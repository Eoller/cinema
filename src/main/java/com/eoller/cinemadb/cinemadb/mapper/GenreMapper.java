package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Genre;
import com.eoller.cinemadb.cinemadb.generated.tables.records.GenreRecord;

public class GenreMapper {

    public Genre map(GenreRecord genreRecord){
        return new Genre(genreRecord.getId(),genreRecord.getGenreName());
    }

}
