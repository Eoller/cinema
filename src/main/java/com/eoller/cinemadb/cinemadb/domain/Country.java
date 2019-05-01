package com.eoller.cinemadb.cinemadb.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country {

    private Long id;

    private String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public Country(Long id) {
        this.id = id;
    }


}
