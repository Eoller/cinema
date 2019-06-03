/*
 * This file is generated by jOOQ.
 */
package com.eoller.cinemadb.cinemadb.generated.tables;


import com.eoller.cinemadb.cinemadb.generated.Cinemadbtest;
import com.eoller.cinemadb.cinemadb.generated.Indexes;
import com.eoller.cinemadb.cinemadb.generated.Keys;
import com.eoller.cinemadb.cinemadb.generated.tables.records.SeatRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class Seat extends TableImpl<SeatRecord> {

    private static final long serialVersionUID = 122014898;

    /**
     * The reference instance of <code>cinemaDBtest.seat</code>
     */
    public static final Seat SEAT = new Seat();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SeatRecord> getRecordType() {
        return SeatRecord.class;
    }

    /**
     * The column <code>cinemaDBtest.seat.id</code>.
     */
    public final TableField<SeatRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>cinemaDBtest.seat.is_vip</code>.
     */
    public final TableField<SeatRecord, Boolean> IS_VIP = createField("is_vip", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>cinemaDBtest.seat.number</code>.
     */
    public final TableField<SeatRecord, Integer> NUMBER = createField("number", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>cinemaDBtest.seat.cinema_hall_id</code>.
     */
    public final TableField<SeatRecord, Long> CINEMA_HALL_ID = createField("cinema_hall_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cinemaDBtest.seat</code> table reference
     */
    public Seat() {
        this(DSL.name("seat"), null);
    }

    /**
     * Create an aliased <code>cinemaDBtest.seat</code> table reference
     */
    public Seat(String alias) {
        this(DSL.name(alias), SEAT);
    }

    /**
     * Create an aliased <code>cinemaDBtest.seat</code> table reference
     */
    public Seat(Name alias) {
        this(alias, SEAT);
    }

    private Seat(Name alias, Table<SeatRecord> aliased) {
        this(alias, aliased, null);
    }

    private Seat(Name alias, Table<SeatRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Seat(Table<O> child, ForeignKey<O, SeatRecord> key) {
        super(child, key, SEAT);
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
        return Arrays.<Index>asList(Indexes.SEAT_FKSO5YP5WLPKCVS31LOJ6YBVCLT, Indexes.SEAT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SeatRecord, Long> getIdentity() {
        return Keys.IDENTITY_SEAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SeatRecord> getPrimaryKey() {
        return Keys.KEY_SEAT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SeatRecord>> getKeys() {
        return Arrays.<UniqueKey<SeatRecord>>asList(Keys.KEY_SEAT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Seat as(String alias) {
        return new Seat(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Seat as(Name alias) {
        return new Seat(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Seat rename(String name) {
        return new Seat(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Seat rename(Name name) {
        return new Seat(name, null);
    }
}
