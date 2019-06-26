package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.ReservationRecord;
import com.chernenv.cinemabackend.domain.Reservation;

public class ReservationRecordMapper {

    public ReservationRecord map(Reservation reservation){
        return new ReservationRecord(reservation.getId(),
                reservation.isPayed(),reservation.getUser().getId(),reservation.getMovieShowSeat().getId());
    }

}
