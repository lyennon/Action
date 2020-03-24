package com.lyennon.action;

/**
 * @author yong.liang
 */
public class ActionEvent {

    public static String ADD_EVENT = "add";

    private final Object data;

    private final String type;

    public ActionEvent(Object data, String type) {
        this.data = data;
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public String getType() {
        return type;
    }
}
