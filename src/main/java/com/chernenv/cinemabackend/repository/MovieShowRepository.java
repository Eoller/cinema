package com.chernenv.cinemabackend.repository;

import com.chernenv.cinemabackend.generated.tables.MovieShow;
import com.chernenv.cinemabackend.generated.tables.records.MovieShowRecord;
import com.chernenv.cinemabackend.mapper.MovieShowMapper;
import com.chernenv.cinemabackend.mapper.MovieShowRecordMapper;
import com.chernenv.cinemabackend.domain.CinemaHall;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Repository
@Transactional
public class MovieShowRepository {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private CinemaHallRepository cinemaHallRepository;

    @Autowired
    private MovieRepository movieRepository;


    public List<com.chernenv.cinemabackend.domain.MovieShow> getByCinemaHallIds(List<Long> cinemaHallIds){
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        return dslContext.selectFrom(MovieShow.MOVIE_SHOW)
                .where(MovieShow.MOVIE_SHOW.CINEMA_HALL_ID.in(cinemaHallIds)).fetch(movieShowMapper::map);
    }

    public List<com.chernenv.cinemabackend.domain.MovieShow> getAll() {
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        Result<MovieShowRecord> movieShowRecords = dslContext.selectFrom(MovieShow.MOVIE_SHOW).fetch();
        return movieShowRecords.stream().map(movieShowMapper::map).collect(toList());
    }

    public com.chernenv.cinemabackend.domain.MovieShow getById(long id){
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        return dslContext.selectFrom(MovieShow.MOVIE_SHOW).where(MovieShow.MOVIE_SHOW.ID.eq(id)).fetchOne(movieShowMapper::map);
    }

    public List<com.chernenv.cinemabackend.domain.MovieShow> getByCinemaHallIdsAndDate(List<Long> cinemaHallIds, java.util.Date date) {
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        return dslContext.selectFrom(MovieShow.MOVIE_SHOW).where(MovieShow.MOVIE_SHOW.CINEMA_HALL_ID.in(cinemaHallIds)
                .and(MovieShow.MOVIE_SHOW.SHOW_DATE.contains(new Date(date.getTime())))).fetch(movieShowMapper::map);
    }

    public List<com.chernenv.cinemabackend.domain.MovieShow> getAllByMovieId(long movieId) {
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        return dslContext.selectFrom(MovieShow.MOVIE_SHOW).where(MovieShow.MOVIE_SHOW.MOVIE_ID.eq(movieId)).fetch(movieShowMapper::map);
    }

    public void removeById(long movieshowId) {
        dslContext.deleteFrom(MovieShow.MOVIE_SHOW).where(MovieShow.MOVIE_SHOW.ID.eq(movieshowId)).execute();
    }

    public com.chernenv.cinemabackend.domain.MovieShow insert(com.chernenv.cinemabackend.domain.MovieShow movieShow) {
        MovieShowRecordMapper movieShowMapper = new MovieShowRecordMapper();
        MovieShowRecord saved = dslContext.insertInto(MovieShow.MOVIE_SHOW).set(movieShowMapper.map(movieShow))
        .returning().fetchOne();
        movieShow.setId(saved.getId());
        return movieShow;
    }

    public List<com.chernenv.cinemabackend.domain.MovieShow> getByCinemaId(long cinemaId) {
        MovieShowMapper mapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        List<Long> cinameHallsIds = cinemaHallRepository.getCinemaHallsByCinemaId(cinemaId)
                .stream().map(CinemaHall::getId).collect(toList());
        return dslContext.selectFrom(MovieShow.MOVIE_SHOW).where(MovieShow.MOVIE_SHOW.CINEMA_HALL_ID.in(cinameHallsIds)).fetch(mapper::map);
    }

    public void removeByMovieId(Long movieId) {
        dslContext.deleteFrom(MovieShow.MOVIE_SHOW).where(MovieShow.MOVIE_SHOW.MOVIE_ID.eq(movieId)).execute();
    }
}
