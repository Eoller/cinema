package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.CinemaRecord;
import com.chernenv.cinemabackend.domain.Cinema;

public class CinemaMapper {

    public Cinema map(CinemaRecord cinemaRecord) {
        return new Cinema(cinemaRecord.getId(), cinemaRecord.getName(), cinemaRecord.getCity());
    }


}
