package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.MovieTrailerRecord;
import com.chernenv.cinemabackend.domain.Movie;
import com.chernenv.cinemabackend.domain.MovieTrailer;

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
