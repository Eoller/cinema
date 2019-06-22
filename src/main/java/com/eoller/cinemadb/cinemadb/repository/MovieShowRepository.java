package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.CinemaHall;
import com.eoller.cinemadb.cinemadb.domain.MovieShow;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieShowRecord;
import com.eoller.cinemadb.cinemadb.mapper.MovieShowMapper;
import com.eoller.cinemadb.cinemadb.mapper.MovieShowRecordMapper;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.eoller.cinemadb.cinemadb.generated.tables.MovieShow.MOVIE_SHOW;
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


    public List<MovieShow> getByCinemaHallIds(List<Long> cinemaHallIds){
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        return dslContext.selectFrom(MOVIE_SHOW)
                .where(MOVIE_SHOW.CINEMA_HALL_ID.in(cinemaHallIds)).fetch(movieShowMapper::map);
    }

    public List<MovieShow> getAll() {
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        Result<MovieShowRecord> movieShowRecords = dslContext.selectFrom(MOVIE_SHOW).fetch();
        return movieShowRecords.stream().map(movieShowMapper::map).collect(toList());
    }

    public MovieShow getById(long id){
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        return dslContext.selectFrom(MOVIE_SHOW).where(MOVIE_SHOW.ID.eq(id)).fetchOne(movieShowMapper::map);
    }

    public List<MovieShow> getByCinemaHallIdsAndDate(List<Long> cinemaHallIds, java.util.Date date) {
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        return dslContext.selectFrom(MOVIE_SHOW).where(MOVIE_SHOW.CINEMA_HALL_ID.in(cinemaHallIds)
                .and(MOVIE_SHOW.SHOW_DATE.contains(new Date(date.getTime())))).fetch(movieShowMapper::map);
    }

    public List<MovieShow> getAllByMovieId(long movieId) {
        MovieShowMapper movieShowMapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        return dslContext.selectFrom(MOVIE_SHOW).where(MOVIE_SHOW.MOVIE_ID.eq(movieId)).fetch(movieShowMapper::map);
    }

    public void removeById(long movieshowId) {
        dslContext.deleteFrom(MOVIE_SHOW).where(MOVIE_SHOW.ID.eq(movieshowId)).execute();
    }

    public MovieShow insert(MovieShow movieShow) {
        MovieShowRecordMapper movieShowMapper = new MovieShowRecordMapper();
        MovieShowRecord saved = dslContext.insertInto(MOVIE_SHOW).set(movieShowMapper.map(movieShow))
        .returning().fetchOne();
        movieShow.setId(saved.getId());
        return movieShow;
    }

    public List<MovieShow> getByCinemaId(long cinemaId) {
        MovieShowMapper mapper = new MovieShowMapper(cinemaHallRepository.getAll(),movieRepository.getAll());
        List<Long> cinameHallsIds = cinemaHallRepository.getCinemaHallsByCinemaId(cinemaId)
                .stream().map(CinemaHall::getId).collect(toList());
        return dslContext.selectFrom(MOVIE_SHOW).where(MOVIE_SHOW.CINEMA_HALL_ID.in(cinameHallsIds)).fetch(mapper::map);
    }

    public void removeByMovieId(Long movieId) {
        dslContext.deleteFrom(MOVIE_SHOW).where(MOVIE_SHOW.MOVIE_ID.eq(movieId)).execute();
    }
}
