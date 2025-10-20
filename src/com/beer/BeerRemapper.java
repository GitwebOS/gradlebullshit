package com.beer;

import java.io.File;
import java.net.URL;

public class BeerRemapper {

    public static void remapAndLoad(File modJar, String mcVersion) {
        try {
            URL[] urls = new URL[]{modJar.toURI().toURL()};
            BeerClassLoader loader = new BeerClassLoader(urls, BeerRemapper.class.getClassLoader());
            // TODO: integrate TinyRemapper here for actual remapping
            System.out.println("[Beer] Loaded " + modJar.getName() + " (prototype, not remapped yet)");
        } catch (Exception e) {
            System.err.println("[Beer] Failed to load mod: " + modJar.getName());
            e.printStackTrace();
        }
    }
}
