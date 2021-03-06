package org.carbon.sample.v2.app.oauth.client;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import lombok.NonNull;
import org.apache.commons.text.RandomStringGenerator;
import org.carbon.component.annotation.Component;
import org.carbon.component.annotation.Assemble;
import org.carbon.persistent.annotation.Transactional;
import org.carbon.sample.v2.exception.DuplicateEntityException;
import org.carbon.sample.v2.ext.jooq.tables.daos.AuthClientDao;
import org.carbon.sample.v2.ext.jooq.tables.pojos.AuthClient;
import org.carbon.sample.v2.app.oauth.AuthClientDto;
import org.carbon.sample.v2.app.user.UserService;

/**
 * @author Shota Oda 2017/07/17.
 */
@Component
public class OAuth2ClientService {

    @Assemble
    private UserService userService;
    @Assemble
    private AuthClientDao dao;
    @Assemble
    private RandomStringGenerator stringGenerator;

    public List<AuthClientDto> fetchAllClient() {
        return dao.findAll().stream()
                .map(AuthClientDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public String registerClientHost(@NonNull String host) throws DuplicateEntityException {
        if (dao.fetchOneByClientHost(host) != null) {
            throw new DuplicateEntityException();
        }
        String clientId = generateClientId();
        AuthClient client = new AuthClient(null, host, clientId);
        dao.insert(client);
        return clientId;
    }

    private String generateClientId() {
        return UUID.randomUUID().toString()
                .replace("-", "")
                .concat(stringGenerator.generate(18));
    }
}
