package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Cinema;
import com.eoller.cinemadb.cinemadb.domain.Movie;
import com.eoller.cinemadb.cinemadb.domain.MovieTrailer;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CinemaRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieTrailerRecord;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieTrailerMapper {

    private Map<Long, Movie> cinemaMap;

    public MovieTrailerMapper(List<Movie> cinemas){
        this.cinemaMap = cinemas.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
    }

    public MovieTrailer map(MovieTrailerRecord record){
        return new MovieTrailer(record.getId(),cinemaMap.get(record.getMovieId()),record.getTrailerUrl());
    }

}
