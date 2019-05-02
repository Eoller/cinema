package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import com.eoller.cinemadb.cinemadb.domain.MovieShowSeat;
import com.eoller.cinemadb.cinemadb.mapper.MovieShowSeatMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.eoller.cinemadb.cinemadb.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT;

import java.util.List;

@Repository
public class MovieShowSeatRepository {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private MovieShowRepository movieShowRepository;

    public List<MovieShowSeat> getAllByMovieShowId(long movieShowId){
        List<MovieShow> movieShows = movieShowRepository.getAll();
        MovieShowSeatMapper movieShowSeatMapper =
                new MovieShowSeatMapper(seatRepository.getAll(),movieShows);

        return dslContext.selectFrom(MOVIE_SHOW_SEAT)
                .where(MOVIE_SHOW_SEAT.MOVIE_SHOW_ID.eq(movieShowId)).fetch(movieShowSeatMapper::map);
    }

}
