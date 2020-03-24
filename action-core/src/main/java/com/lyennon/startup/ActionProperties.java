package com.lyennon.startup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author yong.liang
 */
public class ActionProperties {

    private static Properties properties = null;

    static {
        loadProperties();
    }

    private ActionProperties() {
    }


    private static void loadProperties() {
        File home = new File(System.getProperty("action.base"),System.getProperty("user.dir"));
        File conf = new File(home, "conf");
        File propsFile = new File(conf, "action.properties");
        properties = new Properties();
        try {
            properties.load(new FileInputStream(propsFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
