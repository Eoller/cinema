/*
 * This file is generated by jOOQ.
 */
package com.eoller.cinemadb.cinemadb.generated.tables;


import com.eoller.cinemadb.cinemadb.generated.Cinemadbtest;
import com.eoller.cinemadb.cinemadb.generated.Indexes;
import com.eoller.cinemadb.cinemadb.generated.Keys;
import com.eoller.cinemadb.cinemadb.generated.tables.records.UserRecord;

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
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = -709821267;

    /**
     * The reference instance of <code>cinemaDBtest.user</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>cinemaDBtest.user.id</code>.
     */
    public final TableField<UserRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cinemaDBtest.user.email</code>.
     */
    public final TableField<UserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>cinemaDBtest.user.enabled</code>.
     */
    public final TableField<UserRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>cinemaDBtest.user.firstName</code>.
     */
    public final TableField<UserRecord, String> FIRSTNAME = createField("firstName", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>cinemaDBtest.user.lastName</code>.
     */
    public final TableField<UserRecord, String> LASTNAME = createField("lastName", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>cinemaDBtest.user.password</code>.
     */
    public final TableField<UserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>cinemaDBtest.user.phone</code>.
     */
    public final TableField<UserRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>cinemaDBtest.user.username</code>.
     */
    public final TableField<UserRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>cinemaDBtest.user</code> table reference
     */
    public User() {
        this(DSL.name("user"), null);
    }

    /**
     * Create an aliased <code>cinemaDBtest.user</code> table reference
     */
    public User(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>cinemaDBtest.user</code> table reference
     */
    public User(Name alias) {
        this(alias, USER);
    }

    private User(Name alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> User(Table<O> child, ForeignKey<O, UserRecord> key) {
        super(child, key, USER);
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
        return Arrays.<Index>asList(Indexes.USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRecord>>asList(Keys.KEY_USER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(Name name) {
        return new User(name, null);
    }
}
