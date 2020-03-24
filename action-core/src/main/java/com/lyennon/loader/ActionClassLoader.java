package com.lyennon.loader;

import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandlerFactory;

/**
 * @author yong.liang
 */
public class ActionClassLoader extends URLClassLoader {
    public ActionClassLoader() {
        super(new URL[0], null);
    }

    public ActionClassLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    public ActionClassLoader(URL[] urls) {
        super(urls);
    }

    public ActionClassLoader(URL[] urls, ClassLoader parent, URLStreamHandlerFactory factory) {
        super(urls, parent, factory);
    }

}
