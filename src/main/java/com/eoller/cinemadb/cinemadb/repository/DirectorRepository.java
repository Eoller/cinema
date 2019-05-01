package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.Director;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CountryRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.DirectorRecord;
import com.eoller.cinemadb.cinemadb.mapper.Mappers;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.eoller.cinemadb.cinemadb.generated.tables.Country.COUNTRY;
import static com.eoller.cinemadb.cinemadb.generated.tables.Director.DIRECTOR;

@Repository
public class DirectorRepository {

    @Autowired
    private DSLContext dslContext;

    public List<DirectorRecord> getAll(){
        return dslContext.selectFrom(DIRECTOR).fetch();
    }

}
