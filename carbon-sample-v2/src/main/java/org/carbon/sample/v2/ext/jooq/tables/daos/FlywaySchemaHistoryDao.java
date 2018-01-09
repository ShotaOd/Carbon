/*
 * This file is generated by jOOQ.
*/
package org.carbon.sample.v2.ext.jooq.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.carbon.component.annotation.Component;
import org.carbon.sample.v2.ext.jooq.tables.FlywaySchemaHistory;
import org.carbon.sample.v2.ext.jooq.tables.records.FlywaySchemaHistoryRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Component
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FlywaySchemaHistoryDao extends DAOImpl<FlywaySchemaHistoryRecord, org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory, Integer> {

    /**
     * Create a new FlywaySchemaHistoryDao without any configuration
     */
    public FlywaySchemaHistoryDao() {
        super(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory.class);
    }

    /**
     * Create a new FlywaySchemaHistoryDao with an attached configuration
     */
    public FlywaySchemaHistoryDao(Configuration configuration) {
        super(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory object) {
        return object.getInstalledRank();
    }

    /**
     * Fetch records that have <code>installed_rank IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory> fetchByInstalledRank(Integer... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK, values);
    }

    /**
     * Fetch a unique record that has <code>installed_rank = value</code>
     */
    public org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory fetchOneByInstalledRank(Integer value) {
        return fetchOne(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK, value);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory> fetchByVersion(String... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.VERSION, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory> fetchByDescription(String... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory> fetchByType(String... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.TYPE, values);
    }

    /**
     * Fetch records that have <code>script IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory> fetchByScript(String... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SCRIPT, values);
    }

    /**
     * Fetch records that have <code>checksum IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory> fetchByChecksum(Integer... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.CHECKSUM, values);
    }

    /**
     * Fetch records that have <code>installed_by IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory> fetchByInstalledBy(String... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_BY, values);
    }

    /**
     * Fetch records that have <code>installed_on IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory> fetchByInstalledOn(Timestamp... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_ON, values);
    }

    /**
     * Fetch records that have <code>execution_time IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory> fetchByExecutionTime(Integer... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.EXECUTION_TIME, values);
    }

    /**
     * Fetch records that have <code>success IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.FlywaySchemaHistory> fetchBySuccess(Byte... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS, values);
    }
}
