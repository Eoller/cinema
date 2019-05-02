/*
 * This file is generated by jOOQ.
 */
package com.eoller.cinemadb.cinemadb.generated.tables.records;


import com.eoller.cinemadb.cinemadb.generated.tables.Reservation;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class ReservationRecord extends UpdatableRecordImpl<ReservationRecord> implements Record4<Long, Boolean, Long, Long> {

    private static final long serialVersionUID = 1596407064;

    /**
     * Setter for <code>cinemaDBtest.reservation.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cinemaDBtest.reservation.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cinemaDBtest.reservation.payed</code>.
     */
    public void setPayed(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>cinemaDBtest.reservation.payed</code>.
     */
    public Boolean getPayed() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>cinemaDBtest.reservation.user_id</code>.
     */
    public void setUserId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cinemaDBtest.reservation.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>cinemaDBtest.reservation.movie_shw_seat_id</code>.
     */
    public void setMovieShwSeatId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>cinemaDBtest.reservation.movie_shw_seat_id</code>.
     */
    public Long getMovieShwSeatId() {
        return (Long) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Boolean, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Boolean, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Reservation.RESERVATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return Reservation.RESERVATION.PAYED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Reservation.RESERVATION.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Reservation.RESERVATION.MOVIE_SHW_SEAT_ID;
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
    public Boolean component2() {
        return getPayed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getMovieShwSeatId();
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
    public Boolean value2() {
        return getPayed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getMovieShwSeatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationRecord value2(Boolean value) {
        setPayed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationRecord value3(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationRecord value4(Long value) {
        setMovieShwSeatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationRecord values(Long value1, Boolean value2, Long value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationRecord
     */
    public ReservationRecord() {
        super(Reservation.RESERVATION);
    }

    /**
     * Create a detached, initialised ReservationRecord
     */
    public ReservationRecord(Long id, Boolean payed, Long userId, Long movieShwSeatId) {
        super(Reservation.RESERVATION);

        set(0, id);
        set(1, payed);
        set(2, userId);
        set(3, movieShwSeatId);
    }
}
