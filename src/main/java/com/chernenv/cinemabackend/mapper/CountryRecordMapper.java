package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.CountryRecord;
import com.chernenv.cinemabackend.domain.Country;

public class CountryRecordMapper {

    public CountryRecord map(Country country) {
        return new CountryRecord(country.getId(), country.getCountryName());
    }

}
