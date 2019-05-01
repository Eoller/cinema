package com.eoller.cinemadb.cinemadb.domain;

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

    private byte[] posterImgSmall;

    private byte[] posterImgBig;

    private String description;

    private String descriptionShort;

    private Date releaseDate;

    private Date releaseDatePl;

    private Director director;

    private Country country;

    public Movie(Long id) {
        this.id = id;
    }

    public Movie(String titlePl, String titleOriginal, Integer duration, byte[] posterImgSmall, byte[] posterImgBig, String description, String descriptionShort, Date releaseDate, Date releaseDatePl, Director director, Country country) {
        this.titlePl = titlePl;
        this.titleOriginal = titleOriginal;
        this.duration = duration;
        this.posterImgSmall = posterImgSmall;
        this.posterImgBig = posterImgBig;
        this.description = description;
        this.descriptionShort = descriptionShort;
        this.releaseDate = releaseDate;
        this.releaseDatePl = releaseDatePl;
        this.director = director;
        this.country = country;
    }

    public Movie(String titlePl, String titleOriginal, Integer duration, byte[] posterImgSmall, byte[] posterImgBig, String description, String descriptionShort, Date releaseDate, Date releaseDatePl, Long directorId, Long countryId) {
        this.titlePl = titlePl;
        this.titleOriginal = titleOriginal;
        this.duration = duration;
        this.posterImgSmall = posterImgSmall;
        this.posterImgBig = posterImgBig;
        this.description = description;
        this.descriptionShort = descriptionShort;
        this.releaseDate = releaseDate;
        this.releaseDatePl = releaseDatePl;
        this.country = new Country(countryId);
        this.director = new Director(directorId);
    }
}
