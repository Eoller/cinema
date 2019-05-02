package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Director;
import com.eoller.cinemadb.cinemadb.generated.tables.records.DirectorRecord;

public class DirectorRecordMapper {

    public DirectorRecord map(Director director) {
        return new DirectorRecord(director.getId(), director.getFullName());
    }


}
