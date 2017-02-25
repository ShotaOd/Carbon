/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.pojos;


import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.tables.interfaces.IRole;


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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Role implements IRole {

    private static final long serialVersionUID = -539419437;

    private Long id;

    public Role() {}

    public Role(Role value) {
        this.id = value.id;
    }

    public Role(
        Long id
    ) {
        this.id = id;
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
    public String toString() {
        StringBuilder sb = new StringBuilder("Role (");

        sb.append(id);

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
    public void from(IRole from) {
        setId(from.getId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IRole> E into(E into) {
        into.from(this);
        return into;
    }
}