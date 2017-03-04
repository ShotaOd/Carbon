/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.interfaces;


import java.io.Serializable;
import javax.annotation.Generated;


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
public interface IAsset extends Serializable {

    /**
     * Setter for <code>carbondb.asset.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>carbondb.asset.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>carbondb.asset.asset_path</code>.
     */
    public void setAssetPath(String value);

    /**
     * Getter for <code>carbondb.asset.asset_path</code>.
     */
    public String getAssetPath();

    /**
     * Setter for <code>carbondb.asset.asset_type</code>.
     */
    public void setAssetType(String value);

    /**
     * Getter for <code>carbondb.asset.asset_type</code>.
     */
    public String getAssetType();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IAsset
     */
    public void from(org.carbon.sample.ext.jooq.tables.interfaces.IAsset from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IAsset
     */
    public <E extends org.carbon.sample.ext.jooq.tables.interfaces.IAsset> E into(E into);
}
