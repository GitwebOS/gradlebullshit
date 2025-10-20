package com.beer;

import java.net.URL;
import java.net.URLClassLoader;

public class BeerClassLoader extends URLClassLoader {

    public BeerClassLoader(URL[] urls, ClassLoader parent) {
        super(urls, parent);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // Future: apply remapping/transformations here
        return super.findClass(name);
    }
}
