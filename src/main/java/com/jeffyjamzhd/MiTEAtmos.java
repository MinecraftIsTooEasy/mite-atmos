package com.jeffyjamzhd;

import eu.ha3.matmos.game.mod.LiteModMAtmos;
import net.fabricmc.api.ModInitializer;

import net.xiaoyu233.fml.ModResourceManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MiTEAtmos implements ModInitializer {
    public static final String MOD_ID = "miteatmos";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static LiteModMAtmos mod_instance;

    @Override
    public void onInitialize() {
        ModResourceManager.addResourcePackDomain(MOD_ID);
        mod_instance = new LiteModMAtmos();
    }
}
