package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import com.eoller.cinemadb.cinemadb.domain.Seat;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieShowRecord;
import com.eoller.cinemadb.cinemadb.mapper.MovieShowMapper;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.eoller.cinemadb.cinemadb.generated.tables.MovieShow.MOVIE_SHOW;

@Repository
public class MovieShowRepository {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private CinemaHallRepository cinemaHallRepository;

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieShow> getByCinemaHallIds(List<Long> cinemaHallIds){
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        return dslContext.selectFrom(MOVIE_SHOW)
                .where(MOVIE_SHOW.CINEMA_HALL_ID.in(cinemaHallIds)).fetch(movieShowMapper::map);
    }

    public List<MovieShow> getAll() {
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        Result<MovieShowRecord> movieShowRecords = dslContext.selectFrom(MOVIE_SHOW).fetch();
        return movieShowRecords.stream().map(movieShowMapper::map).collect(Collectors.toList());
    }

    public MovieShow getById(long id){
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        return dslContext.selectFrom(MOVIE_SHOW).where(MOVIE_SHOW.ID.eq(id)).fetchOne(movieShowMapper::map);
    }

    public List<MovieShow> getByCinemaHallIdsAndDate(List<Long> cinemaHallIds, Date date) {
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        return dslContext.selectFrom(MOVIE_SHOW).where(MOVIE_SHOW.CINEMA_HALL_ID.in(cinemaHallIds)
                .and(MOVIE_SHOW.SHOW_DATE.eq(new java.sql.Date(date.getTime())))).fetch(movieShowMapper::map);
    }
}
