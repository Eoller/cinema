package com.chernenv.cinemabackend.mapper;

import com.chernenv.cinemabackend.generated.tables.records.MovieRecord;
import com.chernenv.cinemabackend.domain.Country;
import com.chernenv.cinemabackend.domain.Director;
import com.chernenv.cinemabackend.domain.Genre;
import com.chernenv.cinemabackend.domain.Movie;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieMapper {


    private Map<Long, Country> countryMap;
    private Map<Long, Director> directorMap;
    private Map<Long, Genre> genreMap;

    public MovieMapper(List<Country> countryList, List<Director> directorList, List<Genre> genreList){
        this.countryMap = countryList.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
        this.directorMap = directorList.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
        this.genreMap = genreList.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
    }

    public Movie map(MovieRecord movieRecord) {
        Movie movie = new Movie();
        movie.setId(movieRecord.getId());
        movie.setTitlePl(movieRecord.getTitlePl());
        movie.setTitleOriginal(movieRecord.getTitleOriginal());
        movie.setDuration(movieRecord.getDuration());
        movie.setDescription(movieRecord.getDescription());
        movie.setDescriptionShort(movieRecord.getDescriptionShort());
        movie.setReleaseDate(movieRecord.getReleaseDate());
        movie.setReleaseDatePl(movieRecord.getReleaseDatePl());
        movie.setCountry(countryMap.get(movieRecord.getCountryId()));
        movie.setDirector(directorMap.get(movieRecord.getDirectorId()));
        movie.setGenre(genreMap.get(movieRecord.getGenreId()));
        return movie;
    }

}
