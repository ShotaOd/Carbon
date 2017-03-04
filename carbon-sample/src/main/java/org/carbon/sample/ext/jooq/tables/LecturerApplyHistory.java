/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables;


import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.Carbondb;
import org.carbon.sample.ext.jooq.Keys;
import org.carbon.sample.ext.jooq.tables.records.LecturerApplyHistoryRecord;
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
                "jOOQ version:3.8.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class LecturerApplyHistory extends TableImpl<LecturerApplyHistoryRecord> {

    private static final long serialVersionUID = 836740532;

    /**
     * The reference instance of <code>carbondb.lecturer_apply_history</code>
     */
    public static final LecturerApplyHistory LECTURER_APPLY_HISTORY = new LecturerApplyHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LecturerApplyHistoryRecord> getRecordType() {
        return LecturerApplyHistoryRecord.class;
    }

    /**
     * The column <code>carbondb.lecturer_apply_history.id</code>.
     */
    public final TableField<LecturerApplyHistoryRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>carbondb.lecturer_apply_history</code> table reference
     */
    public LecturerApplyHistory() {
        this("lecturer_apply_history", null);
    }

    /**
     * Create an aliased <code>carbondb.lecturer_apply_history</code> table reference
     */
    public LecturerApplyHistory(String alias) {
        this(alias, LECTURER_APPLY_HISTORY);
    }

    private LecturerApplyHistory(String alias, Table<LecturerApplyHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private LecturerApplyHistory(String alias, Table<LecturerApplyHistoryRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<LecturerApplyHistoryRecord> getPrimaryKey() {
        return Keys.KEY_LECTURER_APPLY_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LecturerApplyHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<LecturerApplyHistoryRecord>>asList(Keys.KEY_LECTURER_APPLY_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerApplyHistory as(String alias) {
        return new LecturerApplyHistory(alias, this);
    }

    /**
     * Rename this table
     */
    public LecturerApplyHistory rename(String name) {
        return new LecturerApplyHistory(name, null);
    }
}
