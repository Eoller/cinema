package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.CinemaHallRecord;
import com.chernenv.cinemabackend.domain.CinemaHall;

public class CinemaHallRecordMapper {

    public CinemaHallRecord map(CinemaHall cinemaHall) {
        return new CinemaHallRecord(cinemaHall.getId(), cinemaHall.getHallNumber(), cinemaHall.getCinema().getId());
    }
}
