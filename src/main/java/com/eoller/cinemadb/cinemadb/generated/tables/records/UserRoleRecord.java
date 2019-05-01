/*
 * This file is generated by jOOQ.
 */
package com.eoller.cinemadb.cinemadb.generated.tables.records;


import com.eoller.cinemadb.cinemadb.generated.tables.UserRole;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class UserRoleRecord extends UpdatableRecordImpl<UserRoleRecord> implements Record3<Long, Long, Long> {

    private static final long serialVersionUID = 415231709;

    /**
     * Setter for <code>cinemaDBtest.user_role.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cinemaDBtest.user_role.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cinemaDBtest.user_role.role_id</code>.
     */
    public void setRoleId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>cinemaDBtest.user_role.role_id</code>.
     */
    public Long getRoleId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>cinemaDBtest.user_role.user_id</code>.
     */
    public void setUserId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cinemaDBtest.user_role.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return UserRole.USER_ROLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return UserRole.USER_ROLE.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return UserRole.USER_ROLE.USER_ID;
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
    public Long component2() {
        return getRoleId();
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
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getRoleId();
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
    public UserRoleRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRoleRecord value2(Long value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRoleRecord value3(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRoleRecord values(Long value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRoleRecord
     */
    public UserRoleRecord() {
        super(UserRole.USER_ROLE);
    }

    /**
     * Create a detached, initialised UserRoleRecord
     */
    public UserRoleRecord(Long id, Long roleId, Long userId) {
        super(UserRole.USER_ROLE);

        set(0, id);
        set(1, roleId);
        set(2, userId);
    }
}
