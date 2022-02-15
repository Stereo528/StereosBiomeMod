package io.github.stereo528.sbm;

import io.github.stereo528.sbm.world.biomes.Biomes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class SBM implements ModInitializer {

    public static final String MOD_ID = "sbm";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
    public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);



    public static Identifier locate(String location) {
        if (location.contains(":")) {
            return new Identifier(location);
        } else {
            return new Identifier(MOD_ID, location);
        }
    }

    @Override
    public void onInitialize() {
        SBM.LOGGER.info("SBM Did a thing...");
        Biomes.init();
    }
}
