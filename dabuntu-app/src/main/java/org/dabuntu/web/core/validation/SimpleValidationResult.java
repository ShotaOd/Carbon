package org.dabuntu.web.core.validation;

import javax.validation.ConstraintViolation;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author ubuntu 2016/12/11.
 */
public class SimpleValidationResult extends ValidationResult {
    Map<String, String> simpleViolationResults;
    public SimpleValidationResult(Set<ConstraintViolation> constraintViolations) {
        super(constraintViolations);
        parseSimpleMap();
    }

    public Map<String, String> getViolationResults() {
        return simpleViolationResults;
    }

    private void parseSimpleMap() {
        simpleViolationResults = this.constraintViolations.stream()
            .collect(Collectors.toMap(
                cv -> cv.getPropertyPath().toString(),
                cv -> cv.getMessage()
            ));
    }
}
