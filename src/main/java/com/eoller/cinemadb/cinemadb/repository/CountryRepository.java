package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.Country;
import com.eoller.cinemadb.cinemadb.mapper.CountryMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.eoller.cinemadb.cinemadb.generated.tables.Country.COUNTRY;

@Repository
@Transactional
public class CountryRepository {

    @Autowired
    private DSLContext dslContext;

    public List<Country> getAll(){
        CountryMapper countryMapper = new CountryMapper();
        return dslContext.selectFrom(COUNTRY).fetch(countryMapper::map);
    }

}
