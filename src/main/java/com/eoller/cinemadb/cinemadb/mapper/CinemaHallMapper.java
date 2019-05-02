package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Cinema;
import com.eoller.cinemadb.cinemadb.domain.CinemaHall;
import com.eoller.cinemadb.cinemadb.domain.Country;
import com.eoller.cinemadb.cinemadb.domain.Director;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CinemaHallRecord;

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
