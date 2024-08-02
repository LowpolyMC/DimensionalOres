package teamcouncil.dimensionalores.world;

import teamcouncil.dimensionalores.DimensionalOres;
import teamcouncil.dimensionalores.block.ModBlocks;
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
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZ_ORE_KEY = registerKey("quartz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_QUARTZ_ORE_KEY = registerKey("deepslate_quartz_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_COAL_ORE_KEY = registerKey("nether_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_COPPER_ORE_KEY = registerKey("nether_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_DIAMOND_ORE_KEY = registerKey("nether_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_EMERALD_ORE_KEY = registerKey("nether_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_IRON_ORE_KEY = registerKey("nether_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_LAPIS_ORE_KEY = registerKey("nether_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_REDSTONE_ORE_KEY = registerKey("nether_redstone_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> END_COAL_ORE_KEY = registerKey("end_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_COPPER_ORE_KEY = registerKey("end_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_DIAMOND_ORE_KEY = registerKey("end_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_EMERALD_ORE_KEY = registerKey("end_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_GOLD_ORE_KEY = registerKey("end_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_IRON_ORE_KEY = registerKey("end_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_LAPIS_ORE_KEY = registerKey("end_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_REDSTONE_ORE_KEY = registerKey("end_redstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_QUARTZ_ORE_KEY = registerKey("end_quartz_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplaceables = new BlockMatchRuleTest(net.minecraft.block.Blocks.END_STONE);

        List<OreFeatureConfig.Target> quartzOre =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.QUARTZ_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> deepslateQuartzOre =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_QUARTZ_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherCoalOre =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherCopperOre =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherDiamondOre =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherEmeraldOre =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherIronOre =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherLapisOre =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherRedstoneOre =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.NETHER_REDSTONE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endCoalOre =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endCopperOre =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_COPPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endDiamondOre =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_DIAMOND_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endEmeraldOre =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_EMERALD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endGoldOre =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_GOLD_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endIronOre =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_IRON_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endLapisOre =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_LAPIS_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endRedstoneOre =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_REDSTONE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endQuartzOre =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_QUARTZ_ORE.getDefaultState()));

        register(context, QUARTZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(quartzOre, 4));
        register(context, DEEPSLATE_QUARTZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslateQuartzOre, 4));

        register(context, NETHER_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherCoalOre, 6));
        register(context, NETHER_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherCopperOre, 5));
        register(context, NETHER_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherDiamondOre, 2));
        register(context, NETHER_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherEmeraldOre, 2));
        register(context, NETHER_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherIronOre, 5));
        register(context, NETHER_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherLapisOre, 2));
        register(context, NETHER_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRedstoneOre, 4));

        register(context, END_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(endCoalOre, 5));
        register(context, END_COPPER_ORE_KEY, Feature.ORE, new OreFeatureConfig(endCopperOre, 4));
        register(context, END_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(endDiamondOre, 1));
        register(context, END_EMERALD_ORE_KEY, Feature.ORE, new OreFeatureConfig(endEmeraldOre, 1));
        register(context, END_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(endGoldOre, 2));
        register(context, END_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(endIronOre, 3));
        register(context, END_LAPIS_ORE_KEY, Feature.ORE, new OreFeatureConfig(endLapisOre, 1));
        register(context, END_REDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endRedstoneOre, 2));
        register(context, END_QUARTZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(endQuartzOre, 3));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(DimensionalOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
