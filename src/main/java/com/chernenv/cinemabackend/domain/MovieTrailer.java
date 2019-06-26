package com.chernenv.cinemabackend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieTrailer {

    private long id;
    private Movie cinema;
    private String trailerUrl;

}
