package org.carbon.persistent.jooq;

import javax.sql.DataSource;

import org.carbon.component.annotation.Component;
import org.carbon.component.annotation.Configuration;
import org.carbon.component.annotation.Inject;
import org.carbon.component.annotation.Transparent;
import org.carbon.persistent.DialectResolver;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDSLContext;
import static org.carbon.persistent.ConnectionTester.testConnection;

/**
 * @author Shota Oda 2016/11/26.
 */
@Transparent /* managed by PersistentModuleConfigurer */
@Configuration
public class JooqConfiguration {
    @Inject
    private DataSource dataSource;

    @Component
    public DSLContext dslContext() {
        testConnection(dataSource);
        DialectResolver.Dialect dialect = DialectResolver.resolve();
        switch (dialect) {
            case MySql:
                return new DefaultDSLContext(dataSource, SQLDialect.MYSQL);
            case Postgres:
                return new DefaultDSLContext(dataSource, SQLDialect.POSTGRES);
            default:
                throw new IllegalStateException("Cannot resolve Sql dialect");
        }
    }
}
