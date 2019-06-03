package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.Cinema;
import com.eoller.cinemadb.cinemadb.mapper.CinemaMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static com.eoller.cinemadb.cinemadb.generated.tables.Cinema.CINEMA;

@Repository
@Transactional
public class CinemaRepository {

    @Autowired
    private DSLContext dslContext;

    public List<Cinema> getAll(){
        CinemaMapper cinemaMapper = new CinemaMapper();
        return dslContext.selectFrom(CINEMA).fetch(cinemaMapper::map);
    }

    public Optional<Cinema> getById(long cinemaId) {
        CinemaMapper cinemaMapper = new CinemaMapper();
        return dslContext.selectFrom(CINEMA).where(CINEMA.ID.eq(cinemaId)).fetchOptional(cinemaMapper::map);
    }
}
