package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Cinema;
import com.eoller.cinemadb.cinemadb.domain.Country;
import com.eoller.cinemadb.cinemadb.domain.Director;
import com.eoller.cinemadb.cinemadb.domain.Movie;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CinemaRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CountryRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.DirectorRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieRecord;

import java.sql.Date;

public class Mappers {

    public static Country map(CountryRecord countryRecord){
        return new Country(countryRecord.getId(),countryRecord.getCountryName());
    }

    public static CountryRecord map(Country country){
        return new CountryRecord(country.getId(),country.getCountryName());
    }

    public static Director map(DirectorRecord directorRecord){
        return new Director(directorRecord.getId(),directorRecord.getFullName());
    }

    public static DirectorRecord map(Director director){
        return new DirectorRecord(director.getId(),director.getFullName());
    }

    public static Movie map(MovieRecord movieRecord, Country country, Director director){
        Movie movie = new Movie();
        movie.setId(movieRecord.getId());
        movie.setTitlePl(movieRecord.getTitlePl());
        movie.setTitleOriginal(movieRecord.getTitleOriginal());
        movie.setDuration(movieRecord.getDuration());
        movie.setPosterImgSmall(movieRecord.getPosterImgSmall());
        movie.setPosterImgBig(movieRecord.getPosterImgBig());
        movie.setDescription(movieRecord.getDescription());
        movie.setDescriptionShort(movieRecord.getDescriptionShort());
        movie.setReleaseDate(movieRecord.getReleaseDate());
        movie.setReleaseDatePl(movieRecord.getReleaseDatePl());
        movie.setCountry(country);
        movie.setDirector(director);
        return movie;
    }

    public static MovieRecord map(Movie movie){
        MovieRecord movieRecord = new MovieRecord();
        movieRecord.setId(movie.getId());
        movieRecord.setTitlePl(movie.getTitlePl());
        movieRecord.setTitleOriginal(movie.getTitleOriginal());
        movieRecord.setDuration(movie.getDuration());
        movieRecord.setPosterImgSmall(movie.getPosterImgSmall());
        movieRecord.setPosterImgBig(movie.getPosterImgBig());
        movieRecord.setDescription(movie.getDescription());
        movieRecord.setDescriptionShort(movie.getDescriptionShort());
        movieRecord.setReleaseDate(new Date(movie.getReleaseDate().getTime()));
        movieRecord.setReleaseDatePl(new Date(movie.getReleaseDatePl().getTime()));
        movieRecord.setCountryId(movie.getCountry().getId());
        movieRecord.setDirectorId(movie.getDirector().getId());
        return movieRecord;
    }

    public static Cinema map(CinemaRecord cinemaRecord){
        return new Cinema(cinemaRecord.getId(),cinemaRecord.getName(),cinemaRecord.getCity());
    }

    public static CinemaRecord map(Cinema cinema){
        return new CinemaRecord(cinema.getId(),cinema.getCity(),cinema.getName());
    }


}
