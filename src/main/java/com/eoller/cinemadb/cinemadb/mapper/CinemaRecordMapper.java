package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Cinema;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CinemaRecord;

public class CinemaRecordMapper {

    public CinemaRecord map(Cinema cinema) {
        return new CinemaRecord(cinema.getId(), cinema.getCity(), cinema.getName());
    }


}
