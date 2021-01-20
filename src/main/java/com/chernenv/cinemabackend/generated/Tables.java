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


/**
 * Convenience access to all tables in cinemaDBtest
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>cinemaDBtest.cinema</code>.
     */
    public static final Cinema CINEMA = Cinema.CINEMA;

    /**
     * The table <code>cinemaDBtest.cinema_hall</code>.
     */
    public static final CinemaHall CINEMA_HALL = CinemaHall.CINEMA_HALL;

    /**
     * The table <code>cinemaDBtest.country</code>.
     */
    public static final Country COUNTRY = Country.COUNTRY;

    /**
     * The table <code>cinemaDBtest.director</code>.
     */
    public static final Director DIRECTOR = Director.DIRECTOR;

    /**
     * The table <code>cinemaDBtest.genre</code>.
     */
    public static final Genre GENRE = Genre.GENRE;

    /**
     * The table <code>cinemaDBtest.movie</code>.
     */
    public static final Movie MOVIE = Movie.MOVIE;

    /**
     * The table <code>cinemaDBtest.movie_show</code>.
     */
    public static final MovieShow MOVIE_SHOW = MovieShow.MOVIE_SHOW;

    /**
     * The table <code>cinemaDBtest.movie_show_seat</code>.
     */
    public static final MovieShowSeat MOVIE_SHOW_SEAT = MovieShowSeat.MOVIE_SHOW_SEAT;

    /**
     * The table <code>cinemaDBtest.movie_trailer</code>.
     */
    public static final MovieTrailer MOVIE_TRAILER = MovieTrailer.MOVIE_TRAILER;

    /**
     * The table <code>cinemaDBtest.reservation</code>.
     */
    public static final Reservation RESERVATION = Reservation.RESERVATION;

    /**
     * The table <code>cinemaDBtest.role</code>.
     */
    public static final Role ROLE = Role.ROLE;

    /**
     * The table <code>cinemaDBtest.seat</code>.
     */
    public static final Seat SEAT = Seat.SEAT;

    /**
     * The table <code>cinemaDBtest.user</code>.
     */
    public static final User USER = User.USER;

    /**
     * The table <code>cinemaDBtest.user_role</code>.
     */
    public static final UserRole USER_ROLE = UserRole.USER_ROLE;
}