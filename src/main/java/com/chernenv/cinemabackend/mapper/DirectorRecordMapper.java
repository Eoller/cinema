package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.DirectorRecord;
import com.chernenv.cinemabackend.domain.Director;

public class DirectorRecordMapper {

    public DirectorRecord map(Director director) {
        return new DirectorRecord(director.getId(), director.getFullName());
    }


}
