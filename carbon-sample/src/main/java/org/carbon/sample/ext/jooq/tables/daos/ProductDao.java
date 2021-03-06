/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.daos;


import java.util.List;
import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.tables.Product;
import org.carbon.sample.ext.jooq.tables.records.ProductRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class ProductDao extends DAOImpl<ProductRecord, org.carbon.sample.ext.jooq.tables.pojos.Product, Long> {

    /**
     * Create a new ProductDao without any configuration
     */
    public ProductDao() {
        super(Product.PRODUCT, org.carbon.sample.ext.jooq.tables.pojos.Product.class);
    }

    /**
     * Create a new ProductDao with an attached configuration
     */
    public ProductDao(Configuration configuration) {
        super(Product.PRODUCT, org.carbon.sample.ext.jooq.tables.pojos.Product.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.carbon.sample.ext.jooq.tables.pojos.Product object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.carbon.sample.ext.jooq.tables.pojos.Product> fetchById(Long... values) {
        return fetch(Product.PRODUCT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.carbon.sample.ext.jooq.tables.pojos.Product fetchOneById(Long value) {
        return fetchOne(Product.PRODUCT.ID, value);
    }
}
