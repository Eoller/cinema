package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.SeatRecord;
import com.chernenv.cinemabackend.domain.Seat;

public class SeatRecordMapper {

    public SeatRecord map(Seat seat){
        return new SeatRecord(seat.getId(),seat.isVip(),seat.getNumber(),seat.getCinemaHall().getId());
    }

}
