package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.CinemaHall;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CinemaHallRecord;
import com.eoller.cinemadb.cinemadb.mapper.CinemaHallMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.eoller.cinemadb.cinemadb.generated.tables.CinemaHall.CINEMA_HALL;

@Repository
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
