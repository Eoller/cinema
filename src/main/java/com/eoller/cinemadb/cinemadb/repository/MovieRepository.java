package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.Movie;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieRecord;
import com.eoller.cinemadb.cinemadb.mapper.MovieMapper;
import com.eoller.cinemadb.cinemadb.mapper.MovieRecordMapper;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

import static com.eoller.cinemadb.cinemadb.generated.tables.Movie.MOVIE;

@Repository
@Transactional
public class MovieRepository {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private DirectorRepository directorRepository;

    @Autowired
    private GenreRepository genreRepository;

    public List<Movie> getAll(){
        MovieMapper movieMapper = new MovieMapper(countryRepository.getAll(),directorRepository.getAll(),genreRepository.getAll());
        return dslContext.selectFrom(MOVIE).fetch(movieMapper::map);
    }

    public Movie getById(long movieId) {
        MovieMapper movieMapper = new MovieMapper(countryRepository.getAll(),directorRepository.getAll(),genreRepository.getAll());
        return dslContext.selectFrom(MOVIE).where(MOVIE.ID.eq(movieId)).fetchOne(movieMapper::map);
    }

    public List<Movie> getByIds(Set<Long> movieIds) {
        MovieMapper movieMapper = new MovieMapper(countryRepository.getAll(),directorRepository.getAll(),genreRepository.getAll());
        return dslContext.selectFrom(MOVIE).where(MOVIE.ID.in(movieIds)).fetch(movieMapper::map);
    }

    public Movie insert(Movie movie) {
        MovieRecordMapper mapper = new MovieRecordMapper();
        MovieRecord maped = mapper.map(movie);
        MovieRecord saved = dslContext.insertInto(MOVIE).set(maped).returning().fetchOne();
        movie.setId(saved.getId());
        return movie;
    }

    public Movie update(Movie movie) {
        MovieRecordMapper mapper = new MovieRecordMapper();
        MovieMapper movieMapper = new MovieMapper(countryRepository.getAll(),directorRepository.getAll(),genreRepository.getAll());
        dslContext.update(MOVIE).set(mapper.map(movie)).where(MOVIE.ID.eq(movie.getId())).execute();
        return this.getById(movie.getId());
    }

    public void remove(Long movieId) {
        dslContext.deleteFrom(MOVIE).where(MOVIE.ID.eq(movieId)).execute();
    }
}
