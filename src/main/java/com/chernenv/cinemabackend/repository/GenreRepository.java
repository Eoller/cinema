package com.chernenv.cinemabackend.repository;

import com.chernenv.cinemabackend.domain.Genre;
import com.chernenv.cinemabackend.mapper.GenreMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.chernenv.cinemabackend.generated.tables.Genre.GENRE;

@Repository
@Transactional
public class GenreRepository {

    @Autowired
    private DSLContext dslContext;

    public List<Genre> getAll(){
        GenreMapper mapper = new GenreMapper();
        return dslContext.selectFrom(GENRE).fetch(mapper::map);
    }


}
