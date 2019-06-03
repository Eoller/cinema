package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.Seat;
import com.eoller.cinemadb.cinemadb.mapper.SeatMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.eoller.cinemadb.cinemadb.generated.tables.Seat.SEAT;

@Repository
@Transactional
public class SeatRepository {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private CinemaHallRepository cinemaHallRepository;

    public List<Seat> getAllByCinemaHallId(long cinemaHallId){
        SeatMapper seatMapper = new SeatMapper(cinemaHallRepository.getAll());
        return dslContext.selectFrom(SEAT).where(SEAT.CINEMA_HALL_ID.eq(cinemaHallId)).fetch(seatMapper::map);
    }

    public List<Seat> getAll() {
        SeatMapper seatMapper = new SeatMapper(cinemaHallRepository.getAll());
        return dslContext.selectFrom(SEAT).fetch(seatMapper::map);
    }
}
