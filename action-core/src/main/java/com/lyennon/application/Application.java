package com.lyennon.application;

import com.lyennon.Action;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yong.liang
 */
public class Application {
    private Map<String, Action> map = new HashMap<String, Action>();

    public void addAction(String name, Action action) {
        if (map.get(name) != null) {
            throw new IllegalStateException(name + "exists");
        }
        map.put(name, action);
    }

    public void removeAction(String name) {
        if (map.get(name) == null) {
            throw new IllegalStateException(name + "not exists");
        }
        map.remove(name);
    }
}
