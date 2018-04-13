/*
 * This file is generated by jOOQ.
*/
package org.carbon.sample.v2.ext.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.carbon.component.annotation.Component;
import org.carbon.sample.v2.ext.jooq.tables.RockettyRanking;
import org.carbon.sample.v2.ext.jooq.tables.records.RockettyRankingRecord;
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
public class RockettyRankingDao extends DAOImpl<RockettyRankingRecord, org.carbon.sample.v2.ext.jooq.tables.pojos.RockettyRanking, Long> {

    /**
     * Create a new RockettyRankingDao without any configuration
     */
    public RockettyRankingDao() {
        super(RockettyRanking.ROCKETTY_RANKING, org.carbon.sample.v2.ext.jooq.tables.pojos.RockettyRanking.class);
    }

    /**
     * Create a new RockettyRankingDao with an attached configuration
     */
    public RockettyRankingDao(Configuration configuration) {
        super(RockettyRanking.ROCKETTY_RANKING, org.carbon.sample.v2.ext.jooq.tables.pojos.RockettyRanking.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.carbon.sample.v2.ext.jooq.tables.pojos.RockettyRanking object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.RockettyRanking> fetchById(Long... values) {
        return fetch(RockettyRanking.ROCKETTY_RANKING.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.carbon.sample.v2.ext.jooq.tables.pojos.RockettyRanking fetchOneById(Long value) {
        return fetchOne(RockettyRanking.ROCKETTY_RANKING.ID, value);
    }

    /**
     * Fetch records that have <code>internal_user_id IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.RockettyRanking> fetchByInternalUserId(String... values) {
        return fetch(RockettyRanking.ROCKETTY_RANKING.INTERNAL_USER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>internal_user_id = value</code>
     */
    public org.carbon.sample.v2.ext.jooq.tables.pojos.RockettyRanking fetchOneByInternalUserId(String value) {
        return fetchOne(RockettyRanking.ROCKETTY_RANKING.INTERNAL_USER_ID, value);
    }

    /**
     * Fetch records that have <code>score IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.RockettyRanking> fetchByScore(Integer... values) {
        return fetch(RockettyRanking.ROCKETTY_RANKING.SCORE, values);
    }

    /**
     * Fetch records that have <code>display_name IN (values)</code>
     */
    public List<org.carbon.sample.v2.ext.jooq.tables.pojos.RockettyRanking> fetchByDisplayName(String... values) {
        return fetch(RockettyRanking.ROCKETTY_RANKING.DISPLAY_NAME, values);
    }
}