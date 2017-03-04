/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.records;


import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.tables.Lecturer;
import org.carbon.sample.ext.jooq.tables.interfaces.ILecturer;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class LecturerRecord extends UpdatableRecordImpl<LecturerRecord> implements Record7<Long, String, String, Long, String, String, String>, ILecturer {

    private static final long serialVersionUID = -1548173554;

    /**
     * Setter for <code>carbondb.lecturer.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>carbondb.lecturer.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>carbondb.lecturer.username</code>.
     */
    @Override
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>carbondb.lecturer.username</code>.
     */
    @Override
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>carbondb.lecturer.email</code>.
     */
    @Override
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>carbondb.lecturer.email</code>.
     */
    @Override
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>carbondb.lecturer.thumbnail_id</code>.
     */
    @Override
    public void setThumbnailId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>carbondb.lecturer.thumbnail_id</code>.
     */
    @Override
    public Long getThumbnailId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>carbondb.lecturer.pr_text</code>.
     */
    @Override
    public void setPrText(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>carbondb.lecturer.pr_text</code>.
     */
    @Override
    public String getPrText() {
        return (String) get(4);
    }

    /**
     * Setter for <code>carbondb.lecturer.password</code>.
     */
    @Override
    public void setPassword(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>carbondb.lecturer.password</code>.
     */
    @Override
    public String getPassword() {
        return (String) get(5);
    }

    /**
     * Setter for <code>carbondb.lecturer.pr_text_short</code>.
     */
    @Override
    public void setPrTextShort(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>carbondb.lecturer.pr_text_short</code>.
     */
    @Override
    public String getPrTextShort() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, Long, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, Long, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Lecturer.LECTURER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Lecturer.LECTURER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Lecturer.LECTURER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Lecturer.LECTURER.THUMBNAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Lecturer.LECTURER.PR_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Lecturer.LECTURER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Lecturer.LECTURER.PR_TEXT_SHORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getThumbnailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPrText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPrTextShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord value4(Long value) {
        setThumbnailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord value5(String value) {
        setPrText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord value6(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord value7(String value) {
        setPrTextShort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerRecord values(Long value1, String value2, String value3, Long value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ILecturer from) {
        setId(from.getId());
        setUsername(from.getUsername());
        setEmail(from.getEmail());
        setThumbnailId(from.getThumbnailId());
        setPrText(from.getPrText());
        setPassword(from.getPassword());
        setPrTextShort(from.getPrTextShort());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ILecturer> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LecturerRecord
     */
    public LecturerRecord() {
        super(Lecturer.LECTURER);
    }

    /**
     * Create a detached, initialised LecturerRecord
     */
    public LecturerRecord(Long id, String username, String email, Long thumbnailId, String prText, String password, String prTextShort) {
        super(Lecturer.LECTURER);

        set(0, id);
        set(1, username);
        set(2, email);
        set(3, thumbnailId);
        set(4, prText);
        set(5, password);
        set(6, prTextShort);
    }
}
