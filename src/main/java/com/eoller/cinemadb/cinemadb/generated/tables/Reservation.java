/*
 * This file is generated by jOOQ.
 */
package com.eoller.cinemadb.cinemadb.generated.tables;


import com.eoller.cinemadb.cinemadb.generated.Cinemadbtest;
import com.eoller.cinemadb.cinemadb.generated.Indexes;
import com.eoller.cinemadb.cinemadb.generated.Keys;
import com.eoller.cinemadb.cinemadb.generated.tables.records.ReservationRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Reservation extends TableImpl<ReservationRecord> {

    private static final long serialVersionUID = 180143572;

    /**
     * The reference instance of <code>cinemaDBtest.reservation</code>
     */
    public static final Reservation RESERVATION = new Reservation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationRecord> getRecordType() {
        return ReservationRecord.class;
    }

    /**
     * The column <code>cinemaDBtest.reservation.id</code>.
     */
    public final TableField<ReservationRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cinemaDBtest.reservation.payed</code>.
     */
    public final TableField<ReservationRecord, Byte> PAYED = createField("payed", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>cinemaDBtest.reservation.user_id</code>.
     */
    public final TableField<ReservationRecord, Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cinemaDBtest.reservation.movie_shw_seat_id</code>.
     */
    public final TableField<ReservationRecord, Long> MOVIE_SHW_SEAT_ID = createField("movie_shw_seat_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cinemaDBtest.reservation</code> table reference
     */
    public Reservation() {
        this(DSL.name("reservation"), null);
    }

    /**
     * Create an aliased <code>cinemaDBtest.reservation</code> table reference
     */
    public Reservation(String alias) {
        this(DSL.name(alias), RESERVATION);
    }

    /**
     * Create an aliased <code>cinemaDBtest.reservation</code> table reference
     */
    public Reservation(Name alias) {
        this(alias, RESERVATION);
    }

    private Reservation(Name alias, Table<ReservationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Reservation(Name alias, Table<ReservationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Reservation(Table<O> child, ForeignKey<O, ReservationRecord> key) {
        super(child, key, RESERVATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Cinemadbtest.CINEMADBTEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.RESERVATION_FKM4OIMK0L1757O9PWAVORJ6LJG, Indexes.RESERVATION_MV_SH_SEAT_FK_IDX, Indexes.RESERVATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationRecord> getPrimaryKey() {
        return Keys.KEY_RESERVATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationRecord>>asList(Keys.KEY_RESERVATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ReservationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ReservationRecord, ?>>asList(Keys.MV_SH_SEAT_FK);
    }

    public MovieShowSeat movieShowSeat() {
        return new MovieShowSeat(this, Keys.MV_SH_SEAT_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reservation as(String alias) {
        return new Reservation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Reservation as(Name alias) {
        return new Reservation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Reservation rename(String name) {
        return new Reservation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Reservation rename(Name name) {
        return new Reservation(name, null);
    }
}
