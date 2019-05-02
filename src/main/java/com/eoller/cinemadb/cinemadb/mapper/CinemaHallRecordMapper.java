package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.CinemaHall;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CinemaHallRecord;

public class CinemaHallRecordMapper {

    public CinemaHallRecord map(CinemaHall cinemaHall) {
        return new CinemaHallRecord(cinemaHall.getId(), cinemaHall.getHallNumber(), cinemaHall.getCinema().getId());
    }
}
