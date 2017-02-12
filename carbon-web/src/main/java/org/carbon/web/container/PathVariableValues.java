package org.carbon.web.container;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shota Oda 2016/10/08.
 */
public class PathVariableValues {
    //      Map<varName, value>
    private Map<String, String> map;

    public PathVariableValues() {
        map = new HashMap<>();
    }

    public void addValue(String varName, String value) {
        map.put(varName, value);
    }

    public String getValue(String varName) {
        return map.get(varName);
    }
}
