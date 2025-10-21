package com.beer;

import net.fabricmc.api.ModInitializer;

public class BeerMod implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("[Beer] Cheers! Starting compatibility layer...");
        BeerCompatLoader.init();
    }
}
