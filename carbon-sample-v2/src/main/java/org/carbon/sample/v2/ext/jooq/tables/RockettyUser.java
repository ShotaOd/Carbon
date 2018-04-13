/*
 * This file is generated by jOOQ.
*/
package org.carbon.sample.v2.ext.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.carbon.sample.v2.ext.jooq.Carbondb;
import org.carbon.sample.v2.ext.jooq.Keys;
import org.carbon.sample.v2.ext.jooq.tables.records.RockettyUserRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RockettyUser extends TableImpl<RockettyUserRecord> {

    private static final long serialVersionUID = 513768456;

    /**
     * The reference instance of <code>carbondb.rocketty_user</code>
     */
    public static final RockettyUser ROCKETTY_USER = new RockettyUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RockettyUserRecord> getRecordType() {
        return RockettyUserRecord.class;
    }

    /**
     * The column <code>carbondb.rocketty_user.id</code>.
     */
    public final TableField<RockettyUserRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>carbondb.rocketty_user.rocketty_auth_client_id</code>.
     */
    public final TableField<RockettyUserRecord, Long> ROCKETTY_AUTH_CLIENT_ID = createField("rocketty_auth_client_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>carbondb.rocketty_user.display_name</code>.
     */
    public final TableField<RockettyUserRecord, String> DISPLAY_NAME = createField("display_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>carbondb.rocketty_user</code> table reference
     */
    public RockettyUser() {
        this("rocketty_user", null);
    }

    /**
     * Create an aliased <code>carbondb.rocketty_user</code> table reference
     */
    public RockettyUser(String alias) {
        this(alias, ROCKETTY_USER);
    }

    private RockettyUser(String alias, Table<RockettyUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private RockettyUser(String alias, Table<RockettyUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Carbondb.CARBONDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RockettyUserRecord, Long> getIdentity() {
        return Keys.IDENTITY_ROCKETTY_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RockettyUserRecord> getPrimaryKey() {
        return Keys.KEY_ROCKETTY_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RockettyUserRecord>> getKeys() {
        return Arrays.<UniqueKey<RockettyUserRecord>>asList(Keys.KEY_ROCKETTY_USER_PRIMARY, Keys.KEY_ROCKETTY_USER_ROCKETTY_USER_DISPLAY_NAME_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RockettyUserRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RockettyUserRecord, ?>>asList(Keys.ROCKETTY_USER_ROCKETTY_AUTH_CLIENT_ID_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RockettyUser as(String alias) {
        return new RockettyUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RockettyUser rename(String name) {
        return new RockettyUser(name, null);
    }
}