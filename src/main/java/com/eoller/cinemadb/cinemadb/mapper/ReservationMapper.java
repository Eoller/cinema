package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.MovieShowSeat;
import com.eoller.cinemadb.cinemadb.domain.Reservation;
import com.eoller.cinemadb.cinemadb.domain.security.User;
import com.eoller.cinemadb.cinemadb.generated.tables.records.ReservationRecord;

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
