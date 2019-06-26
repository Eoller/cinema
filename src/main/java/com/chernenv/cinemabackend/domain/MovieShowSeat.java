package com.chernenv.cinemabackend.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieShowSeat {

    private Long id;
    private Seat seat;
    private MovieShow movieShow;
    private boolean seatStatus;

}
