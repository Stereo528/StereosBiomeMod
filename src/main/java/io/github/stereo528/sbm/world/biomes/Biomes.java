package io.github.stereo528.sbm.world.biomes;

import io.github.stereo528.sbm.SBM;
import io.github.stereo528.sbm.world.features.VegitationPlacedFeatures;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

public class Biomes {
    public static final RegistryKey<Biome> WOODY_PLAINS_KEY = register("woody_plains");

    public static final Biome WOODY_PLAINS = register(WOODY_PLAINS_KEY, createWoodyPlains());

    private static RegistryKey<Biome> register(String name) {
        SBM.LOGGER.info("Registry Key For " + name + " Biome");
        return RegistryKey.of(Registry.BIOME_KEY, SBM.locate(name));
    }

    private static Biome register(RegistryKey<Biome> key, Biome biome) {
        SBM.LOGGER.info("Registry For " + biome.toString() + " Biome");
        return Registry.register(BuiltinRegistries.BIOME, key, biome);
    }




    private static Biome createWoodyPlains(){

        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(spawnSettings);
        DefaultBiomeFeatures.addMonsters(spawnSettings, 95, 5, 100, false);

        GenerationSettings.Builder genSettings = new GenerationSettings.Builder();
        DefaultBiomeFeatures.addLandCarvers(genSettings);
        DefaultBiomeFeatures.addDungeons(genSettings);
        DefaultBiomeFeatures.addMineables(genSettings);
        DefaultBiomeFeatures.addDefaultOres(genSettings);
        DefaultBiomeFeatures.addDefaultDisks(genSettings);
        DefaultBiomeFeatures.addDefaultVegetation(genSettings);
        genSettings.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegitationPlacedFeatures.WOODED_PLAINS_TREES);


        return new Biome.Builder()
                .precipitation(Biome.Precipitation.RAIN)
                .category(Biome.Category.PLAINS)
                .temperature(0.4f)
                .downfall(0.5f)
                .effects(new BiomeEffects.Builder().waterColor(0x3f76e4).waterFogColor(0x050333).fogColor(0xc0d8ff).skyColor(0x77adff).grassColor(0x69ea5b).build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(genSettings.build())
                .build();
    }


    public static void init (){

    }
}
