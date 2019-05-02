package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Country;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CountryRecord;

public class CountryMapper {

    public Country map(CountryRecord countryRecord) {
        return new Country(countryRecord.getId(), countryRecord.getCountryName());
    }

}
