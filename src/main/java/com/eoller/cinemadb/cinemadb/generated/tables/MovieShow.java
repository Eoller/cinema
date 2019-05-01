/*
 * This file is generated by jOOQ.
 */
package com.eoller.cinemadb.cinemadb.generated.tables;


import com.eoller.cinemadb.cinemadb.generated.Cinemadbtest;
import com.eoller.cinemadb.cinemadb.generated.Indexes;
import com.eoller.cinemadb.cinemadb.generated.Keys;
import com.eoller.cinemadb.cinemadb.generated.tables.records.MovieShowRecord;

import java.sql.Date;
import java.sql.Time;
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
public class MovieShow extends TableImpl<MovieShowRecord> {

    private static final long serialVersionUID = -292722421;

    /**
     * The reference instance of <code>cinemaDBtest.movie_show</code>
     */
    public static final MovieShow MOVIE_SHOW = new MovieShow();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MovieShowRecord> getRecordType() {
        return MovieShowRecord.class;
    }

    /**
     * The column <code>cinemaDBtest.movie_show.id</code>.
     */
    public final TableField<MovieShowRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cinemaDBtest.movie_show.show_date</code>.
     */
    public final TableField<MovieShowRecord, Date> SHOW_DATE = createField("show_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>cinemaDBtest.movie_show.show_time</code>.
     */
    public final TableField<MovieShowRecord, Time> SHOW_TIME = createField("show_time", org.jooq.impl.SQLDataType.TIME, this, "");

    /**
     * The column <code>cinemaDBtest.movie_show.cinema_hall_id</code>.
     */
    public final TableField<MovieShowRecord, Long> CINEMA_HALL_ID = createField("cinema_hall_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cinemaDBtest.movie_show.movie_id</code>.
     */
    public final TableField<MovieShowRecord, Long> MOVIE_ID = createField("movie_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cinemaDBtest.movie_show</code> table reference
     */
    public MovieShow() {
        this(DSL.name("movie_show"), null);
    }

    /**
     * Create an aliased <code>cinemaDBtest.movie_show</code> table reference
     */
    public MovieShow(String alias) {
        this(DSL.name(alias), MOVIE_SHOW);
    }

    /**
     * Create an aliased <code>cinemaDBtest.movie_show</code> table reference
     */
    public MovieShow(Name alias) {
        this(alias, MOVIE_SHOW);
    }

    private MovieShow(Name alias, Table<MovieShowRecord> aliased) {
        this(alias, aliased, null);
    }

    private MovieShow(Name alias, Table<MovieShowRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MovieShow(Table<O> child, ForeignKey<O, MovieShowRecord> key) {
        super(child, key, MOVIE_SHOW);
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
        return Arrays.<Index>asList(Indexes.MOVIE_SHOW_FK2RLSEY999V8UO9G081NQ1W1X3, Indexes.MOVIE_SHOW_FKSP1JOEJD7RLQF48CG5NFF615P, Indexes.MOVIE_SHOW_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MovieShowRecord> getPrimaryKey() {
        return Keys.KEY_MOVIE_SHOW_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MovieShowRecord>> getKeys() {
        return Arrays.<UniqueKey<MovieShowRecord>>asList(Keys.KEY_MOVIE_SHOW_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieShow as(String alias) {
        return new MovieShow(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MovieShow as(Name alias) {
        return new MovieShow(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MovieShow rename(String name) {
        return new MovieShow(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MovieShow rename(Name name) {
        return new MovieShow(name, null);
    }
}
