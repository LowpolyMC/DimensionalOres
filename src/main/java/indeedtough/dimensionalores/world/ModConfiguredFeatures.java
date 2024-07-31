package indeedtough.dimensionalores.world;

import indeedtough.dimensionalores.DimensionalOres;
import indeedtough.dimensionalores.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_QUARTZ_ORES_KEY = registerKey("overworld_quartz_ores");

    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_COAL_ORES_KEY = registerKey("nether_coal_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_COPPER_ORES_KEY = registerKey("nether_copper_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_DIAMOND_ORES_KEY = registerKey("nether_diamond_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_EMERALD_ORES_KEY = registerKey("nether_emerald_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_IRON_ORES_KEY = registerKey("nether_iron_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_LAPIS_ORES_KEY = registerKey("nether_lapis_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_REDSTONE_ORES_KEY = registerKey("nether_redstone_ores");

    public static final RegistryKey<ConfiguredFeature<?, ?>> END_COAL_ORES_KEY = registerKey("end_coal_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_COPPER_ORES_KEY = registerKey("end_copper_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_DIAMOND_ORES_KEY = registerKey("end_diamond_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_EMERALD_ORES_KEY = registerKey("end_emerald_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_GOLD_ORES_KEY = registerKey("end_gold_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_IRON_ORES_KEY = registerKey("end_iron_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_LAPIS_ORES_KEY = registerKey("end_lapis_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_REDSTONE_ORES_KEY = registerKey("end_redstone_ores");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_QUARTZ_ORES_KEY = registerKey("end_quartz_ores");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceables = new BlockMatchRuleTest(net.minecraft.block.Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldQuartzOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.QUARTZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_QUARTZ_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherCoalOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherCopperOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherDiamondOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherEmeraldOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherIronOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherLapisOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherRedstoneOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_REDSTONE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endCoalOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endCopperOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endDiamondOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endEmeraldOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endGoldOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endIronOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endLapisOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endRedstoneOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_REDSTONE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endQuartzOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_QUARTZ_ORE.getDefaultState()));

        register(context, OVERWORLD_QUARTZ_ORES_KEY, Feature.ORE, new OreFeatureConfig(overworldQuartzOres, 4));

        register(context, NETHER_COAL_ORES_KEY, Feature.ORE, new OreFeatureConfig(netherCoalOres, 6));
        register(context, NETHER_COPPER_ORES_KEY, Feature.ORE, new OreFeatureConfig(netherCopperOres, 5));
        register(context, NETHER_DIAMOND_ORES_KEY, Feature.ORE, new OreFeatureConfig(netherDiamondOres, 2));
        register(context, NETHER_EMERALD_ORES_KEY, Feature.ORE, new OreFeatureConfig(netherEmeraldOres, 2));
        register(context, NETHER_IRON_ORES_KEY, Feature.ORE, new OreFeatureConfig(netherIronOres, 5));
        register(context, NETHER_LAPIS_ORES_KEY, Feature.ORE, new OreFeatureConfig(netherLapisOres, 2));
        register(context, NETHER_REDSTONE_ORES_KEY, Feature.ORE, new OreFeatureConfig(netherRedstoneOres, 4));

        register(context, END_COAL_ORES_KEY, Feature.ORE, new OreFeatureConfig(endCoalOres, 5));
        register(context, END_COPPER_ORES_KEY, Feature.ORE, new OreFeatureConfig(endCopperOres, 4));
        register(context, END_DIAMOND_ORES_KEY, Feature.ORE, new OreFeatureConfig(endDiamondOres, 1));
        register(context, END_EMERALD_ORES_KEY, Feature.ORE, new OreFeatureConfig(endEmeraldOres, 1));
        register(context, END_GOLD_ORES_KEY, Feature.ORE, new OreFeatureConfig(endGoldOres, 2));
        register(context, END_IRON_ORES_KEY, Feature.ORE, new OreFeatureConfig(endIronOres, 3));
        register(context, END_LAPIS_ORES_KEY, Feature.ORE, new OreFeatureConfig(endLapisOres, 1));
        register(context, END_REDSTONE_ORES_KEY, Feature.ORE, new OreFeatureConfig(endRedstoneOres, 2));
        register(context, END_QUARTZ_ORES_KEY, Feature.ORE, new OreFeatureConfig(endQuartzOres, 3));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(DimensionalOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
