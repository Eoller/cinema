package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.CinemaHallRecord;
import com.chernenv.cinemabackend.domain.Cinema;
import com.chernenv.cinemabackend.domain.CinemaHall;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CinemaHallMapper {

    private Map<Long, Cinema> cinemaMap;

    public CinemaHallMapper(List<Cinema> cinemas){
        this.cinemaMap = cinemas.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
    }


    public CinemaHall map(CinemaHallRecord cinemaHallRecord) {
        return new CinemaHall(cinemaHallRecord.getId(), cinemaHallRecord.getHallNumber(), cinemaMap.get(cinemaHallRecord.getCinemaId()));
    }

}
