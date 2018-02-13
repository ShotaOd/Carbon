package org.carbon.sample.auth.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.carbon.authentication.AuthIdentity;
import org.carbon.sample.ext.jooq.tables.pojos.Lecturer;
import org.mindrot.jbcrypt.BCrypt;

/**
 * @author Shota Oda 2016/11/23.
 */
@Data
@AllArgsConstructor
public class BusinessAuthIdentity implements AuthIdentity {

    private Lecturer user;

    @Override
    public String identity() {
        return user.getUsername();
    }

    @Override
    public String cryptSecret() {
        return user.getPassword();
    }

    @Override
    public boolean confirm(String plainPassword) {
        return BCrypt.checkpw(plainPassword, cryptSecret());
    }
}
