package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.Movie;
import com.eoller.cinemadb.cinemadb.mapper.MovieMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

import static com.eoller.cinemadb.cinemadb.generated.tables.Movie.MOVIE;

@Repository
public class MovieRepository {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private DirectorRepository directorRepository;

    public List<Movie> getAll(){
        MovieMapper movieMapper = new MovieMapper(countryRepository.getAll(),directorRepository.getAll());
        return dslContext.selectFrom(MOVIE).fetch(movieMapper::map);
    }

    public Movie getById(long movieId) {
        MovieMapper movieMapper = new MovieMapper(countryRepository.getAll(),directorRepository.getAll());
        return dslContext.selectFrom(MOVIE).where(MOVIE.ID.eq(movieId)).fetchOne(movieMapper::map);
    }

    public List<Movie> getByIds(Set<Long> movieIds) {
        MovieMapper movieMapper = new MovieMapper(countryRepository.getAll(),directorRepository.getAll());
        return dslContext.selectFrom(MOVIE).where(MOVIE.ID.in(movieIds)).fetch(movieMapper::map);
    }
}
