package com.chernenv.cinemabackend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieHasGenre {

    private long id;
    private Genre genre;
    private Movie movie;

}
