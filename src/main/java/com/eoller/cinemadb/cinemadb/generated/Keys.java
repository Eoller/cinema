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
import com.eoller.cinemadb.cinemadb.generated.tables.MovieShow;
import com.eoller.cinemadb.cinemadb.generated.tables.MovieShowSeat;
import com.eoller.cinemadb.cinemadb.generated.tables.MovieTrailer;
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
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieShowRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieShowSeatRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieTrailerRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.ReservationRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.RoleRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.SeatRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.UserRecord;
import com.eoller.cinemadb.cinemadb.generated.tables.records.UserRoleRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
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

    public static final Identity<CinemaRecord, Long> IDENTITY_CINEMA = Identities0.IDENTITY_CINEMA;
    public static final Identity<CinemaHallRecord, Long> IDENTITY_CINEMA_HALL = Identities0.IDENTITY_CINEMA_HALL;
    public static final Identity<CountryRecord, Long> IDENTITY_COUNTRY = Identities0.IDENTITY_COUNTRY;
    public static final Identity<DirectorRecord, Long> IDENTITY_DIRECTOR = Identities0.IDENTITY_DIRECTOR;
    public static final Identity<GenreRecord, Long> IDENTITY_GENRE = Identities0.IDENTITY_GENRE;
    public static final Identity<MovieRecord, Long> IDENTITY_MOVIE = Identities0.IDENTITY_MOVIE;
    public static final Identity<MovieShowRecord, Long> IDENTITY_MOVIE_SHOW = Identities0.IDENTITY_MOVIE_SHOW;
    public static final Identity<MovieShowSeatRecord, Long> IDENTITY_MOVIE_SHOW_SEAT = Identities0.IDENTITY_MOVIE_SHOW_SEAT;
    public static final Identity<MovieTrailerRecord, Long> IDENTITY_MOVIE_TRAILER = Identities0.IDENTITY_MOVIE_TRAILER;
    public static final Identity<ReservationRecord, Long> IDENTITY_RESERVATION = Identities0.IDENTITY_RESERVATION;
    public static final Identity<RoleRecord, Long> IDENTITY_ROLE = Identities0.IDENTITY_ROLE;
    public static final Identity<SeatRecord, Long> IDENTITY_SEAT = Identities0.IDENTITY_SEAT;
    public static final Identity<UserRecord, Long> IDENTITY_USER = Identities0.IDENTITY_USER;
    public static final Identity<UserRoleRecord, Long> IDENTITY_USER_ROLE = Identities0.IDENTITY_USER_ROLE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CinemaRecord> KEY_CINEMA_PRIMARY = UniqueKeys0.KEY_CINEMA_PRIMARY;
    public static final UniqueKey<CinemaHallRecord> KEY_CINEMA_HALL_PRIMARY = UniqueKeys0.KEY_CINEMA_HALL_PRIMARY;
    public static final UniqueKey<CountryRecord> KEY_COUNTRY_PRIMARY = UniqueKeys0.KEY_COUNTRY_PRIMARY;
    public static final UniqueKey<DirectorRecord> KEY_DIRECTOR_PRIMARY = UniqueKeys0.KEY_DIRECTOR_PRIMARY;
    public static final UniqueKey<GenreRecord> KEY_GENRE_PRIMARY = UniqueKeys0.KEY_GENRE_PRIMARY;
    public static final UniqueKey<MovieRecord> KEY_MOVIE_PRIMARY = UniqueKeys0.KEY_MOVIE_PRIMARY;
    public static final UniqueKey<MovieShowRecord> KEY_MOVIE_SHOW_PRIMARY = UniqueKeys0.KEY_MOVIE_SHOW_PRIMARY;
    public static final UniqueKey<MovieShowSeatRecord> KEY_MOVIE_SHOW_SEAT_PRIMARY = UniqueKeys0.KEY_MOVIE_SHOW_SEAT_PRIMARY;
    public static final UniqueKey<MovieTrailerRecord> KEY_MOVIE_TRAILER_PRIMARY = UniqueKeys0.KEY_MOVIE_TRAILER_PRIMARY;
    public static final UniqueKey<ReservationRecord> KEY_RESERVATION_PRIMARY = UniqueKeys0.KEY_RESERVATION_PRIMARY;
    public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = UniqueKeys0.KEY_ROLE_PRIMARY;
    public static final UniqueKey<SeatRecord> KEY_SEAT_PRIMARY = UniqueKeys0.KEY_SEAT_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;
    public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_PRIMARY = UniqueKeys0.KEY_USER_ROLE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<MovieRecord, GenreRecord> GENRE_FK = ForeignKeys0.GENRE_FK;
    public static final ForeignKey<MovieShowSeatRecord, MovieShowRecord> MOVIE_SHOW_FK = ForeignKeys0.MOVIE_SHOW_FK;
    public static final ForeignKey<MovieShowSeatRecord, SeatRecord> SEAT_ID_FK = ForeignKeys0.SEAT_ID_FK;
    public static final ForeignKey<MovieTrailerRecord, MovieRecord> TRAILER_FK = ForeignKeys0.TRAILER_FK;
    public static final ForeignKey<ReservationRecord, MovieShowSeatRecord> MV_SH_SEAT_FK = ForeignKeys0.MV_SH_SEAT_FK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CinemaRecord, Long> IDENTITY_CINEMA = Internal.createIdentity(Cinema.CINEMA, Cinema.CINEMA.ID);
        public static Identity<CinemaHallRecord, Long> IDENTITY_CINEMA_HALL = Internal.createIdentity(CinemaHall.CINEMA_HALL, CinemaHall.CINEMA_HALL.ID);
        public static Identity<CountryRecord, Long> IDENTITY_COUNTRY = Internal.createIdentity(Country.COUNTRY, Country.COUNTRY.ID);
        public static Identity<DirectorRecord, Long> IDENTITY_DIRECTOR = Internal.createIdentity(Director.DIRECTOR, Director.DIRECTOR.ID);
        public static Identity<GenreRecord, Long> IDENTITY_GENRE = Internal.createIdentity(Genre.GENRE, Genre.GENRE.ID);
        public static Identity<MovieRecord, Long> IDENTITY_MOVIE = Internal.createIdentity(Movie.MOVIE, Movie.MOVIE.ID);
        public static Identity<MovieShowRecord, Long> IDENTITY_MOVIE_SHOW = Internal.createIdentity(MovieShow.MOVIE_SHOW, MovieShow.MOVIE_SHOW.ID);
        public static Identity<MovieShowSeatRecord, Long> IDENTITY_MOVIE_SHOW_SEAT = Internal.createIdentity(MovieShowSeat.MOVIE_SHOW_SEAT, MovieShowSeat.MOVIE_SHOW_SEAT.ID);
        public static Identity<MovieTrailerRecord, Long> IDENTITY_MOVIE_TRAILER = Internal.createIdentity(MovieTrailer.MOVIE_TRAILER, MovieTrailer.MOVIE_TRAILER.ID);
        public static Identity<ReservationRecord, Long> IDENTITY_RESERVATION = Internal.createIdentity(Reservation.RESERVATION, Reservation.RESERVATION.ID);
        public static Identity<RoleRecord, Long> IDENTITY_ROLE = Internal.createIdentity(Role.ROLE, Role.ROLE.ID);
        public static Identity<SeatRecord, Long> IDENTITY_SEAT = Internal.createIdentity(Seat.SEAT, Seat.SEAT.ID);
        public static Identity<UserRecord, Long> IDENTITY_USER = Internal.createIdentity(User.USER, User.USER.ID);
        public static Identity<UserRoleRecord, Long> IDENTITY_USER_ROLE = Internal.createIdentity(UserRole.USER_ROLE, UserRole.USER_ROLE.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CinemaRecord> KEY_CINEMA_PRIMARY = Internal.createUniqueKey(Cinema.CINEMA, "KEY_cinema_PRIMARY", Cinema.CINEMA.ID);
        public static final UniqueKey<CinemaHallRecord> KEY_CINEMA_HALL_PRIMARY = Internal.createUniqueKey(CinemaHall.CINEMA_HALL, "KEY_cinema_hall_PRIMARY", CinemaHall.CINEMA_HALL.ID);
        public static final UniqueKey<CountryRecord> KEY_COUNTRY_PRIMARY = Internal.createUniqueKey(Country.COUNTRY, "KEY_country_PRIMARY", Country.COUNTRY.ID);
        public static final UniqueKey<DirectorRecord> KEY_DIRECTOR_PRIMARY = Internal.createUniqueKey(Director.DIRECTOR, "KEY_director_PRIMARY", Director.DIRECTOR.ID);
        public static final UniqueKey<GenreRecord> KEY_GENRE_PRIMARY = Internal.createUniqueKey(Genre.GENRE, "KEY_genre_PRIMARY", Genre.GENRE.ID);
        public static final UniqueKey<MovieRecord> KEY_MOVIE_PRIMARY = Internal.createUniqueKey(Movie.MOVIE, "KEY_movie_PRIMARY", Movie.MOVIE.ID);
        public static final UniqueKey<MovieShowRecord> KEY_MOVIE_SHOW_PRIMARY = Internal.createUniqueKey(MovieShow.MOVIE_SHOW, "KEY_movie_show_PRIMARY", MovieShow.MOVIE_SHOW.ID);
        public static final UniqueKey<MovieShowSeatRecord> KEY_MOVIE_SHOW_SEAT_PRIMARY = Internal.createUniqueKey(MovieShowSeat.MOVIE_SHOW_SEAT, "KEY_movie_show_seat_PRIMARY", MovieShowSeat.MOVIE_SHOW_SEAT.ID);
        public static final UniqueKey<MovieTrailerRecord> KEY_MOVIE_TRAILER_PRIMARY = Internal.createUniqueKey(MovieTrailer.MOVIE_TRAILER, "KEY_movie_trailer_PRIMARY", MovieTrailer.MOVIE_TRAILER.ID);
        public static final UniqueKey<ReservationRecord> KEY_RESERVATION_PRIMARY = Internal.createUniqueKey(Reservation.RESERVATION, "KEY_reservation_PRIMARY", Reservation.RESERVATION.ID);
        public static final UniqueKey<RoleRecord> KEY_ROLE_PRIMARY = Internal.createUniqueKey(Role.ROLE, "KEY_role_PRIMARY", Role.ROLE.ID);
        public static final UniqueKey<SeatRecord> KEY_SEAT_PRIMARY = Internal.createUniqueKey(Seat.SEAT, "KEY_seat_PRIMARY", Seat.SEAT.ID);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
        public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_PRIMARY = Internal.createUniqueKey(UserRole.USER_ROLE, "KEY_user_role_PRIMARY", UserRole.USER_ROLE.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<MovieRecord, GenreRecord> GENRE_FK = Internal.createForeignKey(com.eoller.cinemadb.cinemadb.generated.Keys.KEY_GENRE_PRIMARY, Movie.MOVIE, "genre_fk", Movie.MOVIE.GENRE_ID);
        public static final ForeignKey<MovieShowSeatRecord, MovieShowRecord> MOVIE_SHOW_FK = Internal.createForeignKey(com.eoller.cinemadb.cinemadb.generated.Keys.KEY_MOVIE_SHOW_PRIMARY, MovieShowSeat.MOVIE_SHOW_SEAT, "Movie_show_fk", MovieShowSeat.MOVIE_SHOW_SEAT.MOVIE_SHOW_ID);
        public static final ForeignKey<MovieShowSeatRecord, SeatRecord> SEAT_ID_FK = Internal.createForeignKey(com.eoller.cinemadb.cinemadb.generated.Keys.KEY_SEAT_PRIMARY, MovieShowSeat.MOVIE_SHOW_SEAT, "seat_id_fk", MovieShowSeat.MOVIE_SHOW_SEAT.SEAT_ID);
        public static final ForeignKey<MovieTrailerRecord, MovieRecord> TRAILER_FK = Internal.createForeignKey(com.eoller.cinemadb.cinemadb.generated.Keys.KEY_MOVIE_PRIMARY, MovieTrailer.MOVIE_TRAILER, "trailer_fk", MovieTrailer.MOVIE_TRAILER.ID);
        public static final ForeignKey<ReservationRecord, MovieShowSeatRecord> MV_SH_SEAT_FK = Internal.createForeignKey(com.eoller.cinemadb.cinemadb.generated.Keys.KEY_MOVIE_SHOW_SEAT_PRIMARY, Reservation.RESERVATION, "mv_sh_seat_fk", Reservation.RESERVATION.MOVIE_SHW_SEAT_ID);
    }
}
