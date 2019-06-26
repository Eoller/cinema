package com.chernenv.cinemabackend.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Director {

    private long id;

    private String fullName;

    public Director(String fullName) {
        this.fullName = fullName;
    }

    public Director(Long id) {
        this.id = id;
    }
}
