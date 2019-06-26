package com.chernenv.cinemabackend.repository;

import com.chernenv.cinemabackend.domain.CinemaHall;
import com.chernenv.cinemabackend.mapper.CinemaHallMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.chernenv.cinemabackend.generated.tables.CinemaHall.CINEMA_HALL;

@Repository
@Transactional
public class CinemaHallRepository {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private CinemaRepository cinemaRepository;

    public List<CinemaHall> getCinemaHallsByCinemaId(long cinemaId){
        CinemaHallMapper cinemaHallMapper = new CinemaHallMapper(cinemaRepository.getAll());
        return dslContext.selectFrom(CINEMA_HALL).where(CINEMA_HALL.CINEMA_ID.eq(cinemaId)).fetch(cinemaHallMapper::map);
    }

    public List<CinemaHall> getAll() {
        CinemaHallMapper cinemaHallMapper = new CinemaHallMapper(cinemaRepository.getAll());
        return dslContext.selectFrom(CINEMA_HALL).fetch(cinemaHallMapper::map);
    }
}
