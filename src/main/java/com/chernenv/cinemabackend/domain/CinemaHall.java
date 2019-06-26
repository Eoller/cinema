package com.chernenv.cinemabackend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CinemaHall {

    private Long id;
    private Integer hallNumber;
    private Cinema cinema;

    public CinemaHall(Integer hallNumber, Cinema cinema) {
        this.hallNumber = hallNumber;
        this.cinema = cinema;
    }

    public CinemaHall(Integer hallNumber, Long cinemaId) {
        this.hallNumber = hallNumber;
        this.cinema = new Cinema(cinemaId);
    }

    public CinemaHall(Long id) {
        this.id = id;
    }
}
