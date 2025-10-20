package com.beer.mapping;

import java.util.HashMap;
import java.util.Map;

public class MappingRegistry {
    public static final Map<String, String> MAPPINGS_1_18 = new HashMap<>();
    public static final Map<String, String> MAPPINGS_1_19 = new HashMap<>();

    static {
        // Example mapping entries (fill in real Yarn mappings later)
        MAPPINGS_1_18.put("net/minecraft/class_310", "net/minecraft/client/MinecraftClient");
        MAPPINGS_1_19.put("net/minecraft/class_310", "net/minecraft/client/MinecraftClient");
    }
}
