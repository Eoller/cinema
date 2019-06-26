package com.chernenv.cinemabackend.domain.dto;

import com.chernenv.cinemabackend.domain.Movie;
import com.chernenv.cinemabackend.domain.MovieShow;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieMovieShowDto {

    private Movie movie;
    private List<MovieShow> movieShows;

}
