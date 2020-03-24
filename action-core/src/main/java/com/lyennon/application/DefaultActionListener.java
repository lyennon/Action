package com.lyennon.application;

import com.lyennon.action.ActionEvent;
import com.lyennon.action.ActionListener;
import com.lyennon.action.ActionPair;

/**
 * @author yong.liang
 */
public class DefaultActionListener implements ActionListener {

    private Application application;

    public DefaultActionListener(Application application) {
        this.application = application;
    }

    public void actionEvent(ActionEvent actionEvent) {
        if (ActionEvent.ADD_EVENT.equals(actionEvent.getType())) {
            ActionPair actionPair = (ActionPair) actionEvent.getData();
            application.addAction(actionPair.getName(), actionPair.getAction());
        }
    }
}
