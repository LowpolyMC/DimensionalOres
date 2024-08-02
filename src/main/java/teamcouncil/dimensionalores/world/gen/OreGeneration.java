package teamcouncil.dimensionalores.world.gen;

import org.spongepowered.asm.mixin.Unique;
import teamcouncil.dimensionalores.client.ModConfig;
import teamcouncil.dimensionalores.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class OreGeneration {
    public static void generateOres() {
        final ModConfig config = ModConfig.CONFIG.instance();

        if(config.quartz_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.QUARTZ_ORE_PLACED_KEY);
        if(config.deepslate_quartz_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DEEPSLATE_QUARTZ_ORE_PLACED_KEY);

        if(config.nether_coal_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_COAL_ORE_PLACED_KEY);
        if(config.nether_copper_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_COPPER_ORE_PLACED_KEY);
        if(config.nether_diamond_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_DIAMOND_ORE_PLACED_KEY);
        if(config.nether_emerald_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_EMERALD_ORE_PLACED_KEY);
        if(config.nether_iron_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_IRON_ORE_PLACED_KEY);
        if(config.nether_lapis_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_LAPIS_ORE_PLACED_KEY);
        if(config.nether_redstone_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.NETHER_REDSTONE_ORE_PLACED_KEY);

        if(config.end_coal_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_COAL_ORE_PLACED_KEY);
        if(config.end_copper_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_COPPER_ORE_PLACED_KEY);
        if(config.end_diamond_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_DIAMOND_ORE_PLACED_KEY);
        if(config.end_emerald_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_EMERALD_ORE_PLACED_KEY);
        if(config.end_gold_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_GOLD_ORE_PLACED_KEY);
        if(config.end_iron_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_IRON_ORE_PLACED_KEY);
        if(config.end_lapis_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_LAPIS_ORE_PLACED_KEY);
        if(config.end_redstone_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_REDSTONE_ORE_PLACED_KEY);
        if(config.end_quartz_ore)
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.END_QUARTZ_ORE_PLACED_KEY);
    }
}
