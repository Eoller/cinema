package com.eoller.cinemadb.cinemadb.repository;

import com.eoller.cinemadb.cinemadb.domain.Country;
import com.eoller.cinemadb.cinemadb.domain.Director;
import com.eoller.cinemadb.cinemadb.domain.Movie;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CountryRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.DirectorRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieRecord;
import com.eoller.cinemadb.cinemadb.mapper.Mappers;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import static com.eoller.cinemadb.cinemadb.generated.tables.Movie.MOVIE;
import static com.eoller.cinemadb.cinemadb.generated.tables.Country.COUNTRY;
import static com.eoller.cinemadb.cinemadb.generated.tables.Director.DIRECTOR;
import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class MovieRepository {

    @Autowired
    private DSLContext dslContext;

    public List<MovieRecord> getAll(){
        return dslContext.selectFrom(MOVIE).fetch();
    }

}
