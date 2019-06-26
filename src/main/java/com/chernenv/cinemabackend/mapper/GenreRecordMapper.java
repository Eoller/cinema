package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.GenreRecord;
import com.chernenv.cinemabackend.domain.Genre;

public class GenreRecordMapper {

    public GenreRecord map(Genre genre){
        return new GenreRecord(genre.getId(),genre.getName());
    }

}
