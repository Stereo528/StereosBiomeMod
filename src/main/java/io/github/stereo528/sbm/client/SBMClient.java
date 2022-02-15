package io.github.stereo528.sbm.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import static io.github.stereo528.sbm.SBM.LOGGER;

@Environment(EnvType.CLIENT)
public class SBMClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        LOGGER.info("SBMClient Did a thing...");
    }
}
