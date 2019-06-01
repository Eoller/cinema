package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.*;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieHasGenreRecord;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieHasGenreMapper {

    private Map<Long, Genre> genreMap;
    private Map<Long, Movie> movieMap;

    public MovieHasGenreMapper(List<Genre> genreList, List<Movie> movieList){
        this.genreMap = genreList.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
        this.movieMap = movieList.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
    }

    public MovieHasGenre map(MovieHasGenreRecord record){
        return new MovieHasGenre(record.getId(),genreMap.get(record.getGenreId()), movieMap.get(record.getMovieId()));
    }
}
