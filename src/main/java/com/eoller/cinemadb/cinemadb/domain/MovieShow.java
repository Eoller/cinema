package com.eoller.cinemadb.cinemadb.domain;

import lombok.*;

import java.sql.Time;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MovieShow {

    private Long id;
    private Date showDate;
    private Time showTime;
    private Movie movie;
    private CinemaHall cinemaHall;

    public MovieShow(Long id) {
        this.id = id;
    }

    public MovieShow(Date showDate, Time showTime, Movie movie) {
        this.showDate = showDate;
        this.showTime = showTime;
        this.movie = movie;
    }

    public MovieShow(Date showDate, Time showTime, Movie movie, CinemaHall cinemaHall) {
        this.showDate = showDate;
        this.showTime = showTime;
        this.movie = movie;
        this.cinemaHall = cinemaHall;
    }

    public MovieShow(Date showDate, Time showTime, Movie movie, Long cinemaHallId) {
        this.showDate = showDate;
        this.showTime = showTime;
        this.movie = movie;
        this.cinemaHall = new CinemaHall(cinemaHallId);
    }
}
