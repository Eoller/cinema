package com.eoller.cinemadb.cinemadb.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cinema {

    private Long id;
    private String name;
    private String city;

    public Cinema(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Cinema(Long id){
        this.id = id;
    }
}
