package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.CinemaRecord;
import com.chernenv.cinemabackend.domain.Cinema;

public class CinemaRecordMapper {

    public CinemaRecord map(Cinema cinema) {
        return new CinemaRecord(cinema.getId(), cinema.getCity(), cinema.getName());
    }


}
