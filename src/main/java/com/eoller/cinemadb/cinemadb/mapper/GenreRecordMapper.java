package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Genre;
import com.eoller.cinemadb.cinemadb.generated.tables.records.GenreRecord;

public class GenreRecordMapper {

    public GenreRecord map(Genre genre){
        return new GenreRecord(genre.getId(),genre.getName());
    }

}
