package com.chernenv.cinemabackend.repository;

import com.chernenv.cinemabackend.domain.MovieShow;
import com.chernenv.cinemabackend.domain.MovieShowSeat;
import com.chernenv.cinemabackend.mapper.MovieShowSeatMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
@Transactional
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

        return dslContext.selectFrom(com.chernenv.cinemabackend.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT)
                .where(com.chernenv.cinemabackend.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT.MOVIE_SHOW_ID.eq(movieShowId)).fetch(movieShowSeatMapper::map);
    }

    public List<MovieShowSeat> getAll() {
        MovieShowSeatMapper movieShowSeatMapper =
                new MovieShowSeatMapper(seatRepository.getAll(),movieShowRepository.getAll());
        return dslContext.selectFrom(com.chernenv.cinemabackend.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT).fetch(movieShowSeatMapper::map);
    }

    public void updateSeatStatus(List<MovieShowSeat> toUpdate, boolean status) {
        dslContext.update(com.chernenv.cinemabackend.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT).set(com.chernenv.cinemabackend.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT.SEAT_STATUS, status).where(com.chernenv.cinemabackend.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT.ID.in(
                toUpdate.stream().map(MovieShowSeat::getId).collect(Collectors.toSet())
        )).execute();
    }

    public void removeByMovieId(Long movieId) {
        Set<Long> ids = movieShowRepository.getAllByMovieId(movieId).stream().map(MovieShow::getId).collect(Collectors.toSet());
        dslContext.deleteFrom(com.chernenv.cinemabackend.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT).where(com.chernenv.cinemabackend.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT.ID.in(ids)).execute();
    }

    public List<MovieShowSeat> getAllByMovieShowIds(Set<Long> movieShowIds) {
        List<MovieShow> movieShows = movieShowRepository.getAll();
        MovieShowSeatMapper movieShowSeatMapper =
                new MovieShowSeatMapper(seatRepository.getAll(),movieShows);
        return dslContext.selectFrom(com.chernenv.cinemabackend.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT).where(com.chernenv.cinemabackend.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT.MOVIE_SHOW_ID.in(movieShowIds)).fetch(movieShowSeatMapper::map);
    }

    public void removeByMovieShowIds(Set<Long> movieShowIds) {
        dslContext.deleteFrom(com.chernenv.cinemabackend.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT).where(com.chernenv.cinemabackend.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT.MOVIE_SHOW_ID.in(movieShowIds)).execute();
    }
}
