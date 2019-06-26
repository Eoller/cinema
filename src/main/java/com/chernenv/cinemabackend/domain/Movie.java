package com.chernenv.cinemabackend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    private long id;
    private String titlePl;
    private String titleOriginal;
    private int duration;
    private String description;
    private String descriptionShort;
    private Date releaseDate;
    private Date releaseDatePl;
    private Director director;
    private Country country;
    private Genre genre;

}
