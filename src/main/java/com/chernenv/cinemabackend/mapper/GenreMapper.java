package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.GenreRecord;
import com.chernenv.cinemabackend.domain.Genre;

public class GenreMapper {

    public Genre map(GenreRecord genreRecord){
        return new Genre(genreRecord.getId(),genreRecord.getGenreName());
    }

}
