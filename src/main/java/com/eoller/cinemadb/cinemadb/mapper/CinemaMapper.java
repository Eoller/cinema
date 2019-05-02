package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Cinema;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CinemaRecord;

public class CinemaMapper {

    public Cinema map(CinemaRecord cinemaRecord) {
        return new Cinema(cinemaRecord.getId(), cinemaRecord.getName(), cinemaRecord.getCity());
    }


}
