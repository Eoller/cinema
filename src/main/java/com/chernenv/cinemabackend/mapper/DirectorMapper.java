package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.DirectorRecord;
import com.chernenv.cinemabackend.domain.Director;

public class DirectorMapper {

    public Director map(DirectorRecord directorRecord) {
        return new Director(directorRecord.getId(), directorRecord.getFullName());
    }


}
