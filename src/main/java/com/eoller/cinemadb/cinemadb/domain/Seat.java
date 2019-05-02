package com.eoller.cinemadb.cinemadb.domain;

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
    private Boolean isVip;
    private CinemaHall cinemaHall;

    public Seat(Integer number, Boolean isVip, Long cinemaHallId) {
        this.number = number;
        this.isVip = isVip;
        this.cinemaHall = new CinemaHall(cinemaHallId);
    }

    public Seat(Integer number, Boolean isVip) {
        this.number = number;
        this.isVip = isVip;
    }

    public Seat(Long id) {
        this.id = id;
    }
}
