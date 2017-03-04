/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.pojos;


import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.tables.interfaces.IUser;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.8.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class User implements IUser {

    private static final long serialVersionUID = -291451618;

    private Long id;
    private String username;
    private String password;

    public User() {
    }

    public User(User value) {
        this.id = value.id;
        this.username = value.username;
        this.password = value.password;
    }

    public User(
            Long id,
            String username,
            String password
    ) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(password);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IUser from) {
        setId(from.getId());
        setUsername(from.getUsername());
        setPassword(from.getPassword());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IUser> E into(E into) {
        into.from(this);
        return into;
    }
}
