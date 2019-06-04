package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Movie;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieRecord;

import java.sql.Date;

public class MovieRecordMapper {
    
    public MovieRecord map(Movie movie) {
        MovieRecord movieRecord = new MovieRecord();
        movieRecord.setId(movie.getId());
        movieRecord.setTitlePl(movie.getTitlePl());
        movieRecord.setTitleOriginal(movie.getTitleOriginal());
        movieRecord.setDuration(movie.getDuration());
        movieRecord.setDescription(movie.getDescription());
        movieRecord.setDescriptionShort(movie.getDescriptionShort());
        movieRecord.setReleaseDate(new Date(movie.getReleaseDate().getTime()));
        movieRecord.setReleaseDatePl(new Date(movie.getReleaseDatePl().getTime()));
        movieRecord.setCountryId(movie.getCountry().getId());
        movieRecord.setDirectorId(movie.getDirector().getId());
        movieRecord.setGenreId(movie.getGenre().getId());
        return movieRecord;
    }
}
