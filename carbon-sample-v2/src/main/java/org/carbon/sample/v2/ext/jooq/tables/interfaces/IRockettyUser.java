/*
 * This file is generated by jOOQ.
*/
package org.carbon.sample.v2.ext.jooq.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;


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
public interface IRockettyUser extends Serializable {

    /**
     * Getter for <code>carbondb.rocketty_user.id</code>.
     */
    public Long getId();

    /**
     * Getter for <code>carbondb.rocketty_user.rocketty_auth_client_id</code>.
     */
    public Long getRockettyAuthClientId();

    /**
     * Getter for <code>carbondb.rocketty_user.display_name</code>.
     */
    public String getDisplayName();
}