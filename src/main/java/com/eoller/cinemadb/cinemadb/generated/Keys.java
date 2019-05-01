/*
 * This file is generated by jOOQ.
 */
package com.eoller.cinemadb.cinemadb.generated;


import com.eoller.cinemadb.cinemadb.generated.tables.Cinema;
import com.eoller.cinemadb.cinemadb.generated.tables.CinemaHall;
import com.eoller.cinemadb.cinemadb.generated.tables.Country;
import com.eoller.cinemadb.cinemadb.generated.tables.Director;
import com.eoller.cinemadb.cinemadb.generated.tables.Genre;
import com.eoller.cinemadb.cinemadb.generated.tables.Movie;
import com.eoller.cinemadb.cinemadb.generated.tables.MovieHasGenre;
import com.eoller.cinemadb.cinemadb.generated.tables.MovieShow;
import com.eoller.cinemadb.cinemadb.generated.tables.Reservation;
import com.eoller.cinemadb.cinemadb.generated.tables.Role;
import com.eoller.cinemadb.cinemadb.generated.tables.Seat;
import com.eoller.cinemadb.cinemadb.generated.tables.User;
import com.eoller.cinemadb.cinemadb.generated.tables.UserRole;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CinemaHallRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CinemaRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.CountryRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.DirectorRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.GenreRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieHasGenreRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieShowRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.ReservationRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.RoleRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.SeatRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.UserRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.UserRoleRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>cinemaDBtest</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CinemaRecord> KEY_CINEMA_PRIMARY = UniqueKeys0.KEY_CINEMA_PRIMARY;
    public static final UniqueKey<CinemaHallRecord> KEY_CINEMA_HALL_PRIMARY = UniqueKeys0.KEY_CINEMA_HALL_PRIMARY;
    public static final UniqueKey<CountryRecord> KEY_COUNTRY_PRIMARY = UniqueKeys0.KEY_COUNTRY_PRIMARY;
    public static final UniqueKey<DirectorRecord> KEY_DIRECTOR_PRIMARY = UniqueKeys0.KEY_DIRECTOR_PRIMARY;
    public static final UniqueKey<GenreRecord> KEY_GENRE_PRIMARY = UniqueKeys0.KEY_GENRE_PRIMARY;
    public static final UniqueKey<MovieRecord> KEY_MOVIE_PRIMARY = UniqueKeys0.KEY_MOVIE_PRIMARY;
    public static final UniqueKey<MovieHasGenreRecord> KEY_MOVIE_HAS_GENRE_PRIMARY = UniqueKeys0.KEY_MOVIE_HAS_GENRE_PRIMARY;
    public static final UniqueKey<MovieShowRecord> KEY_MOVIE_SHOW_PRIMARY = UniqueKeys0.KEY_MOVIE_SHOW_PRIMARY;
    public static final UniqueKey<ReservationRecord> KEY_RESERVATION_PRIMARY = UniqueKeys0.KEY_RESERVATION_PRIMARY;
    public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = UniqueKeys0.KEY_ROLE_PRIMARY;
    public static final UniqueKey<SeatRecord> KEY_SEAT_PRIMARY = UniqueKeys0.KEY_SEAT_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_PRIMARY = UniqueKeys0.KEY_USER_ROLE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<CinemaRecord> KEY_CINEMA_PRIMARY = Internal.createUniqueKey(Cinema.CINEMA, "KEY_cinema_PRIMARY", Cinema.CINEMA.ID);
        public static final UniqueKey<CinemaHallRecord> KEY_CINEMA_HALL_PRIMARY = Internal.createUniqueKey(CinemaHall.CINEMA_HALL, "KEY_cinema_hall_PRIMARY", CinemaHall.CINEMA_HALL.ID);
        public static final UniqueKey<CountryRecord> KEY_COUNTRY_PRIMARY = Internal.createUniqueKey(Country.COUNTRY, "KEY_country_PRIMARY", Country.COUNTRY.ID);
        public static final UniqueKey<DirectorRecord> KEY_DIRECTOR_PRIMARY = Internal.createUniqueKey(Director.DIRECTOR, "KEY_director_PRIMARY", Director.DIRECTOR.ID);
        public static final UniqueKey<GenreRecord> KEY_GENRE_PRIMARY = Internal.createUniqueKey(Genre.GENRE, "KEY_genre_PRIMARY", Genre.GENRE.ID);
        public static final UniqueKey<MovieRecord> KEY_MOVIE_PRIMARY = Internal.createUniqueKey(Movie.MOVIE, "KEY_movie_PRIMARY", Movie.MOVIE.ID);
        public static final UniqueKey<MovieHasGenreRecord> KEY_MOVIE_HAS_GENRE_PRIMARY = Internal.createUniqueKey(MovieHasGenre.MOVIE_HAS_GENRE, "KEY_movie_has_genre_PRIMARY", MovieHasGenre.MOVIE_HAS_GENRE.ID);
        public static final UniqueKey<MovieShowRecord> KEY_MOVIE_SHOW_PRIMARY = Internal.createUniqueKey(MovieShow.MOVIE_SHOW, "KEY_movie_show_PRIMARY", MovieShow.MOVIE_SHOW.ID);
        public static final UniqueKey<ReservationRecord> KEY_RESERVATION_PRIMARY = Internal.createUniqueKey(Reservation.RESERVATION, "KEY_reservation_PRIMARY", Reservation.RESERVATION.ID);
        public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = Internal.createUniqueKey(Role.ROLE, "KEY_role_PRIMARY", Role.ROLE.ID);
        public static final UniqueKey<SeatRecord> KEY_SEAT_PRIMARY = Internal.createUniqueKey(Seat.SEAT, "KEY_seat_PRIMARY", Seat.SEAT.ID);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
        public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_PRIMARY = Internal.createUniqueKey(UserRole.USER_ROLE, "KEY_user_role_PRIMARY", UserRole.USER_ROLE.ID);
    }
}