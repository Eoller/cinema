/*
 * This file is generated by jOOQ.
 */
package com.chernenv.cinemabackend.generated.tables.records;


import com.chernenv.cinemabackend.generated.tables.MovieShow;

import java.sql.Date;
import java.sql.Time;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MovieShowRecord extends UpdatableRecordImpl<MovieShowRecord> implements Record6<Long, Date, Time, Long, Long, Integer> {

    private static final long serialVersionUID = 1302842504;

    /**
     * Setter for <code>cinemaDBtest.movie_show.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cinemaDBtest.movie_show.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cinemaDBtest.movie_show.show_date</code>.
     */
    public void setShowDate(Date value) {
        set(1, value);
    }

    /**
     * Getter for <code>cinemaDBtest.movie_show.show_date</code>.
     */
    public Date getShowDate() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>cinemaDBtest.movie_show.show_time</code>.
     */
    public void setShowTime(Time value) {
        set(2, value);
    }

    /**
     * Getter for <code>cinemaDBtest.movie_show.show_time</code>.
     */
    public Time getShowTime() {
        return (Time) get(2);
    }

    /**
     * Setter for <code>cinemaDBtest.movie_show.cinema_hall_id</code>.
     */
    public void setCinemaHallId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>cinemaDBtest.movie_show.cinema_hall_id</code>.
     */
    public Long getCinemaHallId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>cinemaDBtest.movie_show.movie_id</code>.
     */
    public void setMovieId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>cinemaDBtest.movie_show.movie_id</code>.
     */
    public Long getMovieId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>cinemaDBtest.movie_show.price</code>.
     */
    public void setPrice(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>cinemaDBtest.movie_show.price</code>.
     */
    public Integer getPrice() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Date, Time, Long, Long, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Date, Time, Long, Long, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return MovieShow.MOVIE_SHOW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field2() {
        return MovieShow.MOVIE_SHOW.SHOW_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Time> field3() {
        return MovieShow.MOVIE_SHOW.SHOW_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return MovieShow.MOVIE_SHOW.CINEMA_HALL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return MovieShow.MOVIE_SHOW.MOVIE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return MovieShow.MOVIE_SHOW.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component2() {
        return getShowDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time component3() {
        return getShowTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getCinemaHallId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getMovieId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value2() {
        return getShowDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Time value3() {
        return getShowTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getCinemaHallId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getMovieId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieShowRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieShowRecord value2(Date value) {
        setShowDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieShowRecord value3(Time value) {
        setShowTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieShowRecord value4(Long value) {
        setCinemaHallId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieShowRecord value5(Long value) {
        setMovieId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieShowRecord value6(Integer value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieShowRecord values(Long value1, Date value2, Time value3, Long value4, Long value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MovieShowRecord
     */
    public MovieShowRecord() {
        super(MovieShow.MOVIE_SHOW);
    }

    /**
     * Create a detached, initialised MovieShowRecord
     */
    public MovieShowRecord(Long id, Date showDate, Time showTime, Long cinemaHallId, Long movieId, Integer price) {
        super(MovieShow.MOVIE_SHOW);

        set(0, id);
        set(1, showDate);
        set(2, showTime);
        set(3, cinemaHallId);
        set(4, movieId);
        set(5, price);
    }
}
