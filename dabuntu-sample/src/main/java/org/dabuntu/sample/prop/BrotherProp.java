package org.dabuntu.sample.prop;

import org.dabuntu.component.instanceFactory.annotation.Component;
import org.dabuntu.component.instanceFactory.annotation.Inject;
import org.dabuntu.sample.prop.sub.SubProp1;

/**
 * @author ubuntu 2016/10/09.
 */
@Component
public class BrotherProp {
	@Inject
	private SubProp1 subProp1;
}
