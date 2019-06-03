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
    private Integer price;

}
