package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.Director;
import com.eoller.cinemadb.cinemadb.generated.tables.records.DirectorRecord;
import com.eoller.cinemadb.cinemadb.mapper.DirectorMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.eoller.cinemadb.cinemadb.generated.tables.Director.DIRECTOR;

@Repository
public class DirectorRepository {

    @Autowired
    private DSLContext dslContext;

    public List<Director> getAll(){
        DirectorMapper directorMapper = new DirectorMapper();
        return dslContext.selectFrom(DIRECTOR).fetch(directorMapper::map);
    }

}
