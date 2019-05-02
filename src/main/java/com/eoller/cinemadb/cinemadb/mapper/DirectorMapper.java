package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Director;
import com.eoller.cinemadb.cinemadb.generated.tables.records.DirectorRecord;

public class DirectorMapper {

    public Director map(DirectorRecord directorRecord) {
        return new Director(directorRecord.getId(), directorRecord.getFullName());
    }


}
