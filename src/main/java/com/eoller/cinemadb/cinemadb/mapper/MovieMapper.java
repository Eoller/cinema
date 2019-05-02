package com.eoller.cinemadb.cinemadb.mapper;

import com.eoller.cinemadb.cinemadb.domain.Country;
import com.eoller.cinemadb.cinemadb.domain.Director;
import com.eoller.cinemadb.cinemadb.domain.Movie;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieRecord;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieMapper {


    private Map<Long, Country> countryMap;
    private Map<Long, Director> directorMap;

    public MovieMapper(List<Country> countryList, List<Director> directorList){
        this.countryMap = countryList.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
        this.directorMap = directorList.stream().collect(Collectors.toMap(o -> o.getId(), o -> o));
    }

    public Movie map(MovieRecord movieRecord) {
        Movie movie = new Movie();
        movie.setId(movieRecord.getId());
        movie.setTitlePl(movieRecord.getTitlePl());
        movie.setTitleOriginal(movieRecord.getTitleOriginal());
        movie.setDuration(movieRecord.getDuration());
        movie.setPosterImgSmall(movieRecord.getPosterImgSmall());
        movie.setPosterImgBig(movieRecord.getPosterImgBig());
        movie.setDescription(movieRecord.getDescription());
        movie.setDescriptionShort(movieRecord.getDescriptionShort());
        movie.setReleaseDate(movieRecord.getReleaseDate());
        movie.setReleaseDatePl(movieRecord.getReleaseDatePl());
        movie.setCountry(countryMap.get(movieRecord.getCountryId()));
        movie.setDirector(directorMap.get(movieRecord.getDirectorId()));
        return movie;
    }

}