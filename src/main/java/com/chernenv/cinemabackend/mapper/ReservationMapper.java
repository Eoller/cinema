package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.ReservationRecord;
import com.chernenv.cinemabackend.domain.MovieShowSeat;
import com.chernenv.cinemabackend.domain.Reservation;
import com.chernenv.cinemabackend.domain.security.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReservationMapper {

    private Map<Long, User> userMap;
    private Map<Long, MovieShowSeat> movieShowSeatMap;

    public ReservationMapper(List<User> userList, List<MovieShowSeat> movieShowSeatList) {
        this.userMap = userList.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
        this.movieShowSeatMap = movieShowSeatList.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
    }

    public Reservation map(ReservationRecord record) {
        return new Reservation(record.getId(), record.getPayed(), userMap.get(record.getUserId()),
                movieShowSeatMap.get(record.getMovieShwSeatId()));

    }
}
