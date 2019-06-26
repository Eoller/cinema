package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.SeatRecord;
import com.chernenv.cinemabackend.domain.CinemaHall;
import com.chernenv.cinemabackend.domain.Seat;

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
