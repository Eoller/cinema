package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Reservation;
import com.eoller.cinemadb.cinemadb.generated.tables.records.ReservationRecord;

public class ReservationRecordMapper {

    public ReservationRecord map(Reservation reservation){
        return new ReservationRecord(reservation.getId(),
                reservation.isPayed(),reservation.getUser().getId(),reservation.getMovieShowSeat().getId());
    }

}
