package org.carbon.sample.prop;

import org.carbon.component.annotation.Component;
import org.carbon.component.annotation.Inject;
import org.carbon.sample.prop.sub.SubProp1;

/**
 * @author Shota Oda 2016/10/09.
 */
@Component
public class BrotherProp {
    @Inject
    private SubProp1 subProp1;
}
