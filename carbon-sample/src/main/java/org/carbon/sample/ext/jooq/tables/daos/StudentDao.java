/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.tables.Student;
import org.carbon.sample.ext.jooq.tables.records.StudentRecord;
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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentDao extends DAOImpl<StudentRecord, org.carbon.sample.ext.jooq.tables.pojos.Student, Long> {

    /**
     * Create a new StudentDao without any configuration
     */
    public StudentDao() {
        super(Student.STUDENT, org.carbon.sample.ext.jooq.tables.pojos.Student.class);
    }

    /**
     * Create a new StudentDao with an attached configuration
     */
    public StudentDao(Configuration configuration) {
        super(Student.STUDENT, org.carbon.sample.ext.jooq.tables.pojos.Student.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(org.carbon.sample.ext.jooq.tables.pojos.Student object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<org.carbon.sample.ext.jooq.tables.pojos.Student> fetchById(Long... values) {
        return fetch(Student.STUDENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public org.carbon.sample.ext.jooq.tables.pojos.Student fetchOneById(Long value) {
        return fetchOne(Student.STUDENT.ID, value);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<org.carbon.sample.ext.jooq.tables.pojos.Student> fetchByPassword(String... values) {
        return fetch(Student.STUDENT.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<org.carbon.sample.ext.jooq.tables.pojos.Student> fetchByUsername(String... values) {
        return fetch(Student.STUDENT.USERNAME, values);
    }

    /**
     * Fetch a unique record that has <code>username = value</code>
     */
    public org.carbon.sample.ext.jooq.tables.pojos.Student fetchOneByUsername(String value) {
        return fetchOne(Student.STUDENT.USERNAME, value);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<org.carbon.sample.ext.jooq.tables.pojos.Student> fetchByEmail(String... values) {
        return fetch(Student.STUDENT.EMAIL, values);
    }

    /**
     * Fetch a unique record that has <code>email = value</code>
     */
    public org.carbon.sample.ext.jooq.tables.pojos.Student fetchOneByEmail(String value) {
        return fetchOne(Student.STUDENT.EMAIL, value);
    }
}