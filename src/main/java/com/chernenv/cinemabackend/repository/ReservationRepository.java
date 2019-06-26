package com.chernenv.cinemabackend.repository;

import com.chernenv.cinemabackend.domain.Reservation;
import com.chernenv.cinemabackend.generated.tables.records.ReservationRecord;
import com.chernenv.cinemabackend.mapper.ReservationMapper;
import com.chernenv.cinemabackend.mapper.ReservationRecordMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static com.chernenv.cinemabackend.generated.tables.Reservation.RESERVATION;

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

    public Optional<Reservation> getById(long reservationId) {
        ReservationMapper mapper = new ReservationMapper(userRepository.getAll(),movieShowSeatRepository.getAll());
        return dslContext.selectFrom(RESERVATION).where(RESERVATION.ID.eq(reservationId)).fetchOptional(mapper::map);
    }
}
