package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.Reservation;
import com.eoller.cinemadb.cinemadb.generated.tables.records.ReservationRecord;
import com.eoller.cinemadb.cinemadb.mapper.ReservationMapper;
import com.eoller.cinemadb.cinemadb.mapper.ReservationRecordMapper;
import com.sun.org.apache.regexp.internal.RE;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

import static com.eoller.cinemadb.cinemadb.generated.tables.Reservation.RESERVATION;

@Repository
@Transactional
public class ReservationRepository {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MovieShowSeatRepository movieShowSeatRepository;

    public List<Reservation> getByUserId(long userId){
        ReservationMapper mapper = new ReservationMapper(userRepository.getAll(),movieShowSeatRepository.getAll());
        return dslContext.selectFrom(RESERVATION).where(RESERVATION.USER_ID.eq(userId)).fetch(mapper::map);
    }

    public Reservation insert(Reservation reservation){
        ReservationRecordMapper mapper = new ReservationRecordMapper();
        ReservationRecord saved = dslContext.insertInto(RESERVATION).set(mapper.map(reservation)).returning().fetchOne();
        reservation.setId(saved.getId());
        return reservation;
    }

    public void removeById(long reservationId) {
        dslContext.deleteFrom(RESERVATION).where(RESERVATION.ID.eq(reservationId)).execute();
    }

    public List<Reservation> getAll() {
        ReservationMapper mapper = new ReservationMapper(userRepository.getAll(),movieShowSeatRepository.getAll());
        return dslContext.selectFrom(RESERVATION).fetch(mapper::map);
    }

    public void removeByMovieShowSeatsIds(Set<Long> movieShowSeatIds) {
        dslContext.deleteFrom(RESERVATION).where(RESERVATION.MOVIE_SHW_SEAT_ID.in(movieShowSeatIds)).execute();
    }
}
