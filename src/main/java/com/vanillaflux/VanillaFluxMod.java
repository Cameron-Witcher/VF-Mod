package com.vanillaflux;

import com.vanillaflux.listeners.PlayerJoinListener;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import com.vanillaflux.utils.Utils;

public class VanillaFluxMod implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.


    @Override
    public void onInitialize() {
        Utils.init(this);
        Utils.log("Hello Fabric world!");

        ServerPlayConnectionEvents.JOIN.register(new PlayerJoinListener());


    }
}