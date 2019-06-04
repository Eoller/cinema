package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.Genre;
import com.eoller.cinemadb.cinemadb.mapper.GenreMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.eoller.cinemadb.cinemadb.generated.tables.Genre.GENRE;

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
