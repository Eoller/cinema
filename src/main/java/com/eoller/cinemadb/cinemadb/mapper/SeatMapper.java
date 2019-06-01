package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Cinema;
import com.eoller.cinemadb.cinemadb.domain.CinemaHall;
import com.eoller.cinemadb.cinemadb.domain.Seat;
import com.eoller.cinemadb.cinemadb.generated.tables.records.SeatRecord;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeatMapper {

    private Map<Long, CinemaHall> cinemaHallMap;

    public SeatMapper(List<CinemaHall> cinemaHalls){
        this.cinemaHallMap = cinemaHalls.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
    }

    public Seat map(SeatRecord seatRecord){
        return new Seat(seatRecord.getId(),seatRecord.getNumber(),seatRecord.getIsVip(), cinemaHallMap.get(seatRecord.getCinemaHallId()));
    }
}
