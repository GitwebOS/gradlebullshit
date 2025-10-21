package com.beer;

import java.io.File;

public class BeerCompatLoader {

    public static void init() {
        File modsFolder = new File("mods");
        if (!modsFolder.exists() || !modsFolder.isDirectory()) return;

        File[] files = modsFolder.listFiles(f -> f.getName().endsWith(".jar"));
        if (files == null) return;

        for (File modJar : files) {
            String version = detectMinecraftVersion(modJar);
            if (version.startsWith("1.18") || version.startsWith("1.19")) {
                System.out.println("[Beer] Loading mod " + modJar.getName() + " in compatibility mode for " + version);
                BeerRemapper.remapAndLoad(modJar, version);
            }
        }
    }

    private static String detectMinecraftVersion(File modJar) {
        try (java.util.zip.ZipFile zip = new java.util.zip.ZipFile(modJar)) {
            var entry = zip.getEntry("fabric.mod.json");
            if (entry == null) return "";
            var in = zip.getInputStream(entry);
            var json = new String(in.readAllBytes());
            var match = json.replace("\n","").replace(" ","").split("\"minecraft\":")[1].split("\"")[1];
            return match;
        } catch (Exception e) {
            return "";
        }
    }
}
