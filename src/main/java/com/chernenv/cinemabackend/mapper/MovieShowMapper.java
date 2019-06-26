package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.domain.CinemaHall;
import com.chernenv.cinemabackend.domain.Movie;
import com.chernenv.cinemabackend.domain.MovieShow;
import com.chernenv.cinemabackend.generated.tables.records.MovieShowRecord;
import com.chernenv.cinemabackend.domain.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieShowMapper {


    private Map<Long, CinemaHall> cinemaHallMap;
    private Map<Long, Movie> movieMap;

    public MovieShowMapper(List<CinemaHall> cinemaHalls, List<Movie> movies){
        this.cinemaHallMap = cinemaHalls.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
        this.movieMap = movies.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
    }

    public MovieShow map(MovieShowRecord movieShowRecord) {
        return new MovieShow(movieShowRecord.getId(),movieShowRecord.getShowDate(),movieShowRecord.getShowTime(),
                movieMap.get(movieShowRecord.getMovieId()),cinemaHallMap.get(movieShowRecord.getCinemaHallId()),movieShowRecord.getPrice());
    }

}
