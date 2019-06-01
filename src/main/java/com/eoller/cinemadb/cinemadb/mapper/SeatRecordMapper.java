package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Seat;
import com.eoller.cinemadb.cinemadb.generated.tables.records.SeatRecord;

public class SeatRecordMapper {

    public SeatRecord map(Seat seat){
        return new SeatRecord(seat.getId(),seat.isVip(),seat.getNumber(),seat.getCinemaHall().getId());
    }

}
