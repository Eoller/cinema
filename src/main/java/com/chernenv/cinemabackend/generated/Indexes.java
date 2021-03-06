/*
 * This file is generated by jOOQ.
 */
package com.chernenv.cinemabackend.generated;


import com.chernenv.cinemabackend.generated.tables.Cinema;
import com.chernenv.cinemabackend.generated.tables.CinemaHall;
import com.chernenv.cinemabackend.generated.tables.Country;
import com.chernenv.cinemabackend.generated.tables.Director;
import com.chernenv.cinemabackend.generated.tables.Genre;
import com.chernenv.cinemabackend.generated.tables.Movie;
import com.chernenv.cinemabackend.generated.tables.MovieShow;
import com.chernenv.cinemabackend.generated.tables.MovieShowSeat;
import com.chernenv.cinemabackend.generated.tables.MovieTrailer;
import com.chernenv.cinemabackend.generated.tables.Reservation;
import com.chernenv.cinemabackend.generated.tables.Role;
import com.chernenv.cinemabackend.generated.tables.Seat;
import com.chernenv.cinemabackend.generated.tables.User;
import com.chernenv.cinemabackend.generated.tables.UserRole;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>cinemaDBtest</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CINEMA_PRIMARY = Indexes0.CINEMA_PRIMARY;
    public static final Index CINEMA_HALL_FKO0VKU6P3NMP2TXOFWWYLS44JQ = Indexes0.CINEMA_HALL_FKO0VKU6P3NMP2TXOFWWYLS44JQ;
    public static final Index CINEMA_HALL_PRIMARY = Indexes0.CINEMA_HALL_PRIMARY;
    public static final Index COUNTRY_PRIMARY = Indexes0.COUNTRY_PRIMARY;
    public static final Index DIRECTOR_PRIMARY = Indexes0.DIRECTOR_PRIMARY;
    public static final Index GENRE_PRIMARY = Indexes0.GENRE_PRIMARY;
    public static final Index MOVIE_FK5H5HKYXPRVSGPQG69NQSQ5P48 = Indexes0.MOVIE_FK5H5HKYXPRVSGPQG69NQSQ5P48;
    public static final Index MOVIE_FKBI47W3CNSFI30GC1NU2AVGRA2 = Indexes0.MOVIE_FKBI47W3CNSFI30GC1NU2AVGRA2;
    public static final Index MOVIE_GENRE_FK_IDX = Indexes0.MOVIE_GENRE_FK_IDX;
    public static final Index MOVIE_PRIMARY = Indexes0.MOVIE_PRIMARY;
    public static final Index MOVIE_SHOW_FK2RLSEY999V8UO9G081NQ1W1X3 = Indexes0.MOVIE_SHOW_FK2RLSEY999V8UO9G081NQ1W1X3;
    public static final Index MOVIE_SHOW_FKSP1JOEJD7RLQF48CG5NFF615P = Indexes0.MOVIE_SHOW_FKSP1JOEJD7RLQF48CG5NFF615P;
    public static final Index MOVIE_SHOW_PRIMARY = Indexes0.MOVIE_SHOW_PRIMARY;
    public static final Index MOVIE_SHOW_SEAT_MOVIE_SHOW_FK_IDX = Indexes0.MOVIE_SHOW_SEAT_MOVIE_SHOW_FK_IDX;
    public static final Index MOVIE_SHOW_SEAT_PRIMARY = Indexes0.MOVIE_SHOW_SEAT_PRIMARY;
    public static final Index MOVIE_SHOW_SEAT_SEAT_ID_FK_IDX = Indexes0.MOVIE_SHOW_SEAT_SEAT_ID_FK_IDX;
    public static final Index MOVIE_TRAILER_PRIMARY = Indexes0.MOVIE_TRAILER_PRIMARY;
    public static final Index RESERVATION_FKM4OIMK0L1757O9PWAVORJ6LJG = Indexes0.RESERVATION_FKM4OIMK0L1757O9PWAVORJ6LJG;
    public static final Index RESERVATION_MV_SH_SEAT_FK_IDX = Indexes0.RESERVATION_MV_SH_SEAT_FK_IDX;
    public static final Index RESERVATION_PRIMARY = Indexes0.RESERVATION_PRIMARY;
    public static final Index ROLE_PRIMARY = Indexes0.ROLE_PRIMARY;
    public static final Index SEAT_FKSO5YP5WLPKCVS31LOJ6YBVCLT = Indexes0.SEAT_FKSO5YP5WLPKCVS31LOJ6YBVCLT;
    public static final Index SEAT_PRIMARY = Indexes0.SEAT_PRIMARY;
    public static final Index USER_PRIMARY = Indexes0.USER_PRIMARY;
    public static final Index USER_ROLE_FK859N2JVI8IVHUI0RL0ESWS6O = Indexes0.USER_ROLE_FK859N2JVI8IVHUI0RL0ESWS6O;
    public static final Index USER_ROLE_FKA68196081FVOVJHKEK5M97N3Y = Indexes0.USER_ROLE_FKA68196081FVOVJHKEK5M97N3Y;
    public static final Index USER_ROLE_PRIMARY = Indexes0.USER_ROLE_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CINEMA_PRIMARY = Internal.createIndex("PRIMARY", Cinema.CINEMA, new OrderField[] { Cinema.CINEMA.ID }, true);
        public static Index CINEMA_HALL_FKO0VKU6P3NMP2TXOFWWYLS44JQ = Internal.createIndex("FKo0vku6p3nmp2txofwwyls44jq", CinemaHall.CINEMA_HALL, new OrderField[] { CinemaHall.CINEMA_HALL.CINEMA_ID }, false);
        public static Index CINEMA_HALL_PRIMARY = Internal.createIndex("PRIMARY", CinemaHall.CINEMA_HALL, new OrderField[] { CinemaHall.CINEMA_HALL.ID }, true);
        public static Index COUNTRY_PRIMARY = Internal.createIndex("PRIMARY", Country.COUNTRY, new OrderField[] { Country.COUNTRY.ID }, true);
        public static Index DIRECTOR_PRIMARY = Internal.createIndex("PRIMARY", Director.DIRECTOR, new OrderField[] { Director.DIRECTOR.ID }, true);
        public static Index GENRE_PRIMARY = Internal.createIndex("PRIMARY", Genre.GENRE, new OrderField[] { Genre.GENRE.ID }, true);
        public static Index MOVIE_FK5H5HKYXPRVSGPQG69NQSQ5P48 = Internal.createIndex("FK5h5hkyxprvsgpqg69nqsq5p48", Movie.MOVIE, new OrderField[] { Movie.MOVIE.COUNTRY_ID }, false);
        public static Index MOVIE_FKBI47W3CNSFI30GC1NU2AVGRA2 = Internal.createIndex("FKbi47w3cnsfi30gc1nu2avgra2", Movie.MOVIE, new OrderField[] { Movie.MOVIE.DIRECTOR_ID }, false);
        public static Index MOVIE_GENRE_FK_IDX = Internal.createIndex("genre_fk_idx", Movie.MOVIE, new OrderField[] { Movie.MOVIE.GENRE_ID }, false);
        public static Index MOVIE_PRIMARY = Internal.createIndex("PRIMARY", Movie.MOVIE, new OrderField[] { Movie.MOVIE.ID }, true);
        public static Index MOVIE_SHOW_FK2RLSEY999V8UO9G081NQ1W1X3 = Internal.createIndex("FK2rlsey999v8uo9g081nq1w1x3", MovieShow.MOVIE_SHOW, new OrderField[] { MovieShow.MOVIE_SHOW.CINEMA_HALL_ID }, false);
        public static Index MOVIE_SHOW_FKSP1JOEJD7RLQF48CG5NFF615P = Internal.createIndex("FKsp1joejd7rlqf48cg5nff615p", MovieShow.MOVIE_SHOW, new OrderField[] { MovieShow.MOVIE_SHOW.MOVIE_ID }, false);
        public static Index MOVIE_SHOW_PRIMARY = Internal.createIndex("PRIMARY", MovieShow.MOVIE_SHOW, new OrderField[] { MovieShow.MOVIE_SHOW.ID }, true);
        public static Index MOVIE_SHOW_SEAT_MOVIE_SHOW_FK_IDX = Internal.createIndex("Movie_show_fk_idx", MovieShowSeat.MOVIE_SHOW_SEAT, new OrderField[] { MovieShowSeat.MOVIE_SHOW_SEAT.MOVIE_SHOW_ID }, false);
        public static Index MOVIE_SHOW_SEAT_PRIMARY = Internal.createIndex("PRIMARY", MovieShowSeat.MOVIE_SHOW_SEAT, new OrderField[] { MovieShowSeat.MOVIE_SHOW_SEAT.ID }, true);
        public static Index MOVIE_SHOW_SEAT_SEAT_ID_FK_IDX = Internal.createIndex("seat_id_fk_idx", MovieShowSeat.MOVIE_SHOW_SEAT, new OrderField[] { MovieShowSeat.MOVIE_SHOW_SEAT.SEAT_ID }, false);
        public static Index MOVIE_TRAILER_PRIMARY = Internal.createIndex("PRIMARY", MovieTrailer.MOVIE_TRAILER, new OrderField[] { MovieTrailer.MOVIE_TRAILER.ID }, true);
        public static Index RESERVATION_FKM4OIMK0L1757O9PWAVORJ6LJG = Internal.createIndex("FKm4oimk0l1757o9pwavorj6ljg", Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.USER_ID }, false);
        public static Index RESERVATION_MV_SH_SEAT_FK_IDX = Internal.createIndex("mv_sh_seat_fk_idx", Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.MOVIE_SHW_SEAT_ID }, false);
        public static Index RESERVATION_PRIMARY = Internal.createIndex("PRIMARY", Reservation.RESERVATION, new OrderField[] { Reservation.RESERVATION.ID }, true);
        public static Index ROLE_PRIMARY = Internal.createIndex("PRIMARY", Role.ROLE, new OrderField[] { Role.ROLE.ID }, true);
        public static Index SEAT_FKSO5YP5WLPKCVS31LOJ6YBVCLT = Internal.createIndex("FKso5yp5wlpkcvs31loj6ybvclt", Seat.SEAT, new OrderField[] { Seat.SEAT.CINEMA_HALL_ID }, false);
        public static Index SEAT_PRIMARY = Internal.createIndex("PRIMARY", Seat.SEAT, new OrderField[] { Seat.SEAT.ID }, true);
        public static Index USER_PRIMARY = Internal.createIndex("PRIMARY", User.USER, new OrderField[] { User.USER.ID }, true);
        public static Index USER_ROLE_FK859N2JVI8IVHUI0RL0ESWS6O = Internal.createIndex("FK859n2jvi8ivhui0rl0esws6o", UserRole.USER_ROLE, new OrderField[] { UserRole.USER_ROLE.USER_ID }, false);
        public static Index USER_ROLE_FKA68196081FVOVJHKEK5M97N3Y = Internal.createIndex("FKa68196081fvovjhkek5m97n3y", UserRole.USER_ROLE, new OrderField[] { UserRole.USER_ROLE.ROLE_ID }, false);
        public static Index USER_ROLE_PRIMARY = Internal.createIndex("PRIMARY", UserRole.USER_ROLE, new OrderField[] { UserRole.USER_ROLE.ID }, true);
    }
}
