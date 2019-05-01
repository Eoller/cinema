package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.Country;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CountryRecord;
import com.eoller.cinemadb.cinemadb.mapper.Mappers;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.eoller.cinemadb.cinemadb.generated.tables.Country.COUNTRY;

@Repository
public class CountryRepository {

    @Autowired
    private DSLContext dslContext;

    public List<CountryRecord> getAll(){
        return dslContext.selectFrom(COUNTRY).fetch();
    }

}
