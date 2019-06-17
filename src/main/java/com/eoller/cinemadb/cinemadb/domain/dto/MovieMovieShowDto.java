package com.eoller.cinemadb.cinemadb.domain.dto;

import com.eoller.cinemadb.cinemadb.domain.Movie;
import com.eoller.cinemadb.cinemadb.domain.MovieShow;
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
