package io.github.stereo528.sbm.world.features;

import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationConfiguredFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class VegitationPlacedFeatures {

    public static final PlacedFeature WOODED_PLAINS_TREES = PlacedFeatures.register("trees_wooded_plains", VegetationConfiguredFeatures.TREES_BIRCH_AND_OAK.withPlacement(VegetationPlacedFeatures.modifiers(PlacedFeatures.createCountExtraModifier(2, 0.1f, 1))));
}
