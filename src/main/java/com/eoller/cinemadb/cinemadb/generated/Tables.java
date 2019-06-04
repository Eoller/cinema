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
    public static final Cinema CINEMA = com.eoller.cinemadb.cinemadb.generated.tables.Cinema.CINEMA;

    /**
     * The table <code>cinemaDBtest.cinema_hall</code>.
     */
    public static final CinemaHall CINEMA_HALL = com.eoller.cinemadb.cinemadb.generated.tables.CinemaHall.CINEMA_HALL;

    /**
     * The table <code>cinemaDBtest.country</code>.
     */
    public static final Country COUNTRY = com.eoller.cinemadb.cinemadb.generated.tables.Country.COUNTRY;

    /**
     * The table <code>cinemaDBtest.director</code>.
     */
    public static final Director DIRECTOR = com.eoller.cinemadb.cinemadb.generated.tables.Director.DIRECTOR;

    /**
     * The table <code>cinemaDBtest.genre</code>.
     */
    public static final Genre GENRE = com.eoller.cinemadb.cinemadb.generated.tables.Genre.GENRE;

    /**
     * The table <code>cinemaDBtest.movie</code>.
     */
    public static final Movie MOVIE = com.eoller.cinemadb.cinemadb.generated.tables.Movie.MOVIE;

    /**
     * The table <code>cinemaDBtest.movie_show</code>.
     */
    public static final MovieShow MOVIE_SHOW = com.eoller.cinemadb.cinemadb.generated.tables.MovieShow.MOVIE_SHOW;

    /**
     * The table <code>cinemaDBtest.movie_show_seat</code>.
     */
    public static final MovieShowSeat MOVIE_SHOW_SEAT = com.eoller.cinemadb.cinemadb.generated.tables.MovieShowSeat.MOVIE_SHOW_SEAT;

    /**
     * The table <code>cinemaDBtest.movie_trailer</code>.
     */
    public static final MovieTrailer MOVIE_TRAILER = com.eoller.cinemadb.cinemadb.generated.tables.MovieTrailer.MOVIE_TRAILER;

    /**
     * The table <code>cinemaDBtest.reservation</code>.
     */
    public static final Reservation RESERVATION = com.eoller.cinemadb.cinemadb.generated.tables.Reservation.RESERVATION;

    /**
     * The table <code>cinemaDBtest.role</code>.
     */
    public static final Role ROLE = com.eoller.cinemadb.cinemadb.generated.tables.Role.ROLE;

    /**
     * The table <code>cinemaDBtest.seat</code>.
     */
    public static final Seat SEAT = com.eoller.cinemadb.cinemadb.generated.tables.Seat.SEAT;

    /**
     * The table <code>cinemaDBtest.user</code>.
     */
    public static final User USER = com.eoller.cinemadb.cinemadb.generated.tables.User.USER;

    /**
     * The table <code>cinemaDBtest.user_role</code>.
     */
    public static final UserRole USER_ROLE = com.eoller.cinemadb.cinemadb.generated.tables.UserRole.USER_ROLE;
}
