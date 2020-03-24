package com.lyennon.action;

import com.lyennon.Action;

/**
 * @author yong.liang
 */
public class ActionWrapper {

    private Action action;

    private String name;

    private ActionContext actionContext;

    public ActionWrapper() {
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionContext getActionContext() {
        return actionContext;
    }

    public void setActionContext(ActionContext actionContext) {
        this.actionContext = actionContext;
    }
}
