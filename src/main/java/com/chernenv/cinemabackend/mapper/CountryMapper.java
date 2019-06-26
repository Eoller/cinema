package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.CountryRecord;
import com.chernenv.cinemabackend.domain.Country;

public class CountryMapper {

    public Country map(CountryRecord countryRecord) {
        return new Country(countryRecord.getId(), countryRecord.getCountryName());
    }

}
