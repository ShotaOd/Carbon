/*
 * This file is generated by jOOQ.
*/
package org.carbon.sample.v2.ext.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.carbon.sample.v2.ext.jooq.Carbondb;
import org.carbon.sample.v2.ext.jooq.Keys;
import org.carbon.sample.v2.ext.jooq.tables.records.AuthClientRecord;
import org.jooq.Field;
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
public class AuthClient extends TableImpl<AuthClientRecord> {

    private static final long serialVersionUID = 438065428;

    /**
     * The reference instance of <code>carbondb.auth_client</code>
     */
    public static final AuthClient AUTH_CLIENT = new AuthClient();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthClientRecord> getRecordType() {
        return AuthClientRecord.class;
    }

    /**
     * The column <code>carbondb.auth_client.id</code>.
     */
    public final TableField<AuthClientRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>carbondb.auth_client.client_host</code>.
     */
    public final TableField<AuthClientRecord, String> CLIENT_HOST = createField("client_host", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>carbondb.auth_client.client_id</code>.
     */
    public final TableField<AuthClientRecord, String> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.CHAR.length(127).nullable(false), this, "");

    /**
     * Create a <code>carbondb.auth_client</code> table reference
     */
    public AuthClient() {
        this("auth_client", null);
    }

    /**
     * Create an aliased <code>carbondb.auth_client</code> table reference
     */
    public AuthClient(String alias) {
        this(alias, AUTH_CLIENT);
    }

    private AuthClient(String alias, Table<AuthClientRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthClient(String alias, Table<AuthClientRecord> aliased, Field<?>[] parameters) {
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
    public Identity<AuthClientRecord, Long> getIdentity() {
        return Keys.IDENTITY_AUTH_CLIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AuthClientRecord> getPrimaryKey() {
        return Keys.KEY_AUTH_CLIENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AuthClientRecord>> getKeys() {
        return Arrays.<UniqueKey<AuthClientRecord>>asList(Keys.KEY_AUTH_CLIENT_PRIMARY, Keys.KEY_AUTH_CLIENT_AUTH_CLIENT_CLIENT_HOST_UINDEX, Keys.KEY_AUTH_CLIENT_AUTH_CLIENT_CLIENT_ID_UINDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthClient as(String alias) {
        return new AuthClient(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthClient rename(String name) {
        return new AuthClient(name, null);
    }
}
