package com.eoller.cinemadb.cinemadb.service;

import com.eoller.cinemadb.cinemadb.domain.Country;
import com.eoller.cinemadb.cinemadb.domain.Director;
import com.eoller.cinemadb.cinemadb.domain.Movie;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CountryRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.DirectorRecord;
import com.eoller.cinemadb.cinemadb.mapper.Mappers;
import com.eoller.cinemadb.cinemadb.repository.CountryRepository;
import com.eoller.cinemadb.cinemadb.repository.DirectorRepository;
import com.eoller.cinemadb.cinemadb.repository.MovieRepository;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private DirectorRepository directorRepository;

    @Autowired
    private CountryRepository countryRepository;

    public List<Movie> getAllMovies(){
        Map<Long, Director> directors = directorRepository.getAll().stream()
                .collect(Collectors.toMap(DirectorRecord::getId, s -> Mappers.map(s)));
        Map<Long, Country> countries = countryRepository.getAll().stream()
                .collect(Collectors.toMap(CountryRecord::getId, s -> Mappers.map(s)));
        return movieRepository.getAll().stream().map(movieRecord -> Mappers
                .map(movieRecord,countries.get(movieRecord.getCountryId()),directors.get(movieRecord.getDirectorId())))
                .collect(Collectors.toList());
    }

}
