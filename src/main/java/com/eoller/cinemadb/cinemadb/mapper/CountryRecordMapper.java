package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Country;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CountryRecord;

public class CountryRecordMapper {

    public CountryRecord map(Country country) {
        return new CountryRecord(country.getId(), country.getCountryName());
    }

}
