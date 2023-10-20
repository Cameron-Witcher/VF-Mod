package com.vanillaflux.utils;

import com.vanillaflux.VanillaFluxMod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Utils {
    private static Logger LOGGER;
    private static VanillaFluxMod mod;


    public static void init(VanillaFluxMod mod) {
        Utils.mod = mod;
        LOGGER = LoggerFactory.getLogger("VF-Stats");
    }

    public static void log(String message) {
        LOGGER.info(message);
    }

    public static VanillaFluxMod getMod() {
        return mod;
    }


}
