package com.chernenv.cinemabackend.repository;

import com.chernenv.cinemabackend.domain.Director;
import com.chernenv.cinemabackend.mapper.DirectorMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.chernenv.cinemabackend.generated.tables.Director.DIRECTOR;

@Repository
@Transactional
public class DirectorRepository {

    @Autowired
    private DSLContext dslContext;

    public List<Director> getAll(){
        DirectorMapper directorMapper = new DirectorMapper();
        return dslContext.selectFrom(DIRECTOR).fetch(directorMapper::map);
    }

}
