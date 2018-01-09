/*
 * This file is generated by jOOQ.
*/
package org.carbon.sample.v2.ext.jooq.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.carbon.sample.v2.ext.jooq.Carbondb;
import org.carbon.sample.v2.ext.jooq.Keys;
import org.carbon.sample.v2.ext.jooq.tables.records.FlywaySchemaHistoryRecord;
import org.jooq.Field;
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
public class FlywaySchemaHistory extends TableImpl<FlywaySchemaHistoryRecord> {

    private static final long serialVersionUID = 22769391;

    /**
     * The reference instance of <code>carbondb.flyway_schema_history</code>
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = new FlywaySchemaHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FlywaySchemaHistoryRecord> getRecordType() {
        return FlywaySchemaHistoryRecord.class;
    }

    /**
     * The column <code>carbondb.flyway_schema_history.installed_rank</code>.
     */
    public final TableField<FlywaySchemaHistoryRecord, Integer> INSTALLED_RANK = createField("installed_rank", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>carbondb.flyway_schema_history.version</code>.
     */
    public final TableField<FlywaySchemaHistoryRecord, String> VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>carbondb.flyway_schema_history.description</code>.
     */
    public final TableField<FlywaySchemaHistoryRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>carbondb.flyway_schema_history.type</code>.
     */
    public final TableField<FlywaySchemaHistoryRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>carbondb.flyway_schema_history.script</code>.
     */
    public final TableField<FlywaySchemaHistoryRecord, String> SCRIPT = createField("script", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false), this, "");

    /**
     * The column <code>carbondb.flyway_schema_history.checksum</code>.
     */
    public final TableField<FlywaySchemaHistoryRecord, Integer> CHECKSUM = createField("checksum", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>carbondb.flyway_schema_history.installed_by</code>.
     */
    public final TableField<FlywaySchemaHistoryRecord, String> INSTALLED_BY = createField("installed_by", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>carbondb.flyway_schema_history.installed_on</code>.
     */
    public final TableField<FlywaySchemaHistoryRecord, Timestamp> INSTALLED_ON = createField("installed_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>carbondb.flyway_schema_history.execution_time</code>.
     */
    public final TableField<FlywaySchemaHistoryRecord, Integer> EXECUTION_TIME = createField("execution_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>carbondb.flyway_schema_history.success</code>.
     */
    public final TableField<FlywaySchemaHistoryRecord, Byte> SUCCESS = createField("success", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>carbondb.flyway_schema_history</code> table reference
     */
    public FlywaySchemaHistory() {
        this("flyway_schema_history", null);
    }

    /**
     * Create an aliased <code>carbondb.flyway_schema_history</code> table reference
     */
    public FlywaySchemaHistory(String alias) {
        this(alias, FLYWAY_SCHEMA_HISTORY);
    }

    private FlywaySchemaHistory(String alias, Table<FlywaySchemaHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private FlywaySchemaHistory(String alias, Table<FlywaySchemaHistoryRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<FlywaySchemaHistoryRecord> getPrimaryKey() {
        return Keys.KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FlywaySchemaHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<FlywaySchemaHistoryRecord>>asList(Keys.KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlywaySchemaHistory as(String alias) {
        return new FlywaySchemaHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FlywaySchemaHistory rename(String name) {
        return new FlywaySchemaHistory(name, null);
    }
}
