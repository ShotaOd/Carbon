package org.carbon.sample.auth;

import org.carbon.authentication.conf.AuthConfigAdapter;
import org.carbon.authentication.conf.AuthDefinitionBuilder;
import org.carbon.component.annotation.Component;
import org.carbon.component.annotation.Inject;
import org.carbon.sample.auth.basic.BasicAuthEvent;
import org.carbon.sample.auth.basic.identity.SampleBasicAuthIdentifier;
import org.carbon.sample.auth.basic.identity.SampleBasicAuthIdentity;
import org.carbon.sample.auth.business.BusinessAuthIdentifier;
import org.carbon.sample.auth.business.BusinessAuthIdentity;
import org.carbon.sample.auth.consumer.ConsumerAuthIdentifier;
import org.carbon.sample.auth.consumer.ConsumerAuthIdentity;
import org.carbon.sample.auth.form.identity.FormAuthIdentifier;
import org.carbon.sample.auth.form.identity.FormAuthIdentity;
import org.carbon.web.def.HttpMethod;

/**
 * @author Shota Oda 2016/11/03.
 */
@Component
public class SampleSecurityConfigAdapter implements AuthConfigAdapter {

    // -----------------------------------------------------
    //                                               for Basic Auth
    //                                               -------
    @Inject
    private SampleBasicAuthIdentifier basicIdentifier;
    @Inject
    private BasicAuthEvent basicFinisher;

    // -----------------------------------------------------
    //                                               for Form Auth
    //                                               -------
    @Inject
    private FormAuthIdentifier formIdentifier;

    // -----------------------------------------------------
    //                                               for Consumer Auth
    //                                               -------
    @Inject
    private ConsumerAuthIdentifier consumerAuthIdentifier;

    // -----------------------------------------------------
    //                                               for Business Auth
    //                                               -------
    @Inject
    private BusinessAuthIdentifier businessAuthIdentifier;

    @Override
    public void configure(AuthDefinitionBuilder config) {
        config
                .defineForPage(SampleBasicAuthIdentity.class)
                    .identifier(basicIdentifier)
                    .base("/basic/")
                    .authTo(HttpMethod.GET, "/basic/**")
                    .logout("/basic/logout")
                    .redirect("/basic")
                .end()
                .defineForPage(FormAuthIdentity.class)
                    .identifier(formIdentifier)
                    .base("/form/")
                    .authTo(HttpMethod.POST, "/form/auth")
                    .logout("/form/logout")
                    .redirect("/form")
                .end()
                .defineForPage(BusinessAuthIdentity.class)
                    .identifier(businessAuthIdentifier)
                    .base("/business/")
                    .authTo(HttpMethod.POST, "/business/auth")
                    .logout("/business/logout")
                    .redirect("/business")
                .end()
                .defineForPage(ConsumerAuthIdentity.class)
                    .identifier(consumerAuthIdentifier)
                    .base("/consumer/")
                    .authTo(HttpMethod.POST, "/consumer/auth")
                    .logout("/consumer/logout")
                    .redirect("/consumer")
                .end()
        ;
    }
}
