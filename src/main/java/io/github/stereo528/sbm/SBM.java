package io.github.stereo528.sbm;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.Level;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class SBM implements ModInitializer {

    public static final String MOD_ID = "sbm";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
    public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();

    static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void onInitialize() {
        SBM.LOGGER.info("poggy woggy");
    }
}
