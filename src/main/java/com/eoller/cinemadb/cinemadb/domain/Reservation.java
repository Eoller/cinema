package com.eoller.cinemadb.cinemadb.domain;

import com.eoller.cinemadb.cinemadb.domain.security.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    private long id;
    private int payed;
    private User user;
    private MovieShowSeat movieShowSeat;

}
