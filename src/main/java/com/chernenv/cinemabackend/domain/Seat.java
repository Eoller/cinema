package com.chernenv.cinemabackend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seat {

    private Long id;
    private Integer number;
    private boolean isVip;
    private CinemaHall cinemaHall;

}
