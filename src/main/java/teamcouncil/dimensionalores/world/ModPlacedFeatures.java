package teamcouncil.dimensionalores.world;

import teamcouncil.dimensionalores.DimensionalOres;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> QUARTZ_ORE_PLACED_KEY = registerKey("quartz_ore");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_QUARTZ_ORE_PLACED_KEY = registerKey("deepslate_quartz_ore");

    public static final RegistryKey<PlacedFeature> NETHER_COAL_ORE_PLACED_KEY = registerKey("nether_coal_ore");
    public static final RegistryKey<PlacedFeature> NETHER_COPPER_ORE_PLACED_KEY = registerKey("nether_copper_ore");
    public static final RegistryKey<PlacedFeature> NETHER_DIAMOND_ORE_PLACED_KEY = registerKey("nether_diamond_ore");
    public static final RegistryKey<PlacedFeature> NETHER_EMERALD_ORE_PLACED_KEY = registerKey("nether_emerald_ore");
    public static final RegistryKey<PlacedFeature> NETHER_IRON_ORE_PLACED_KEY = registerKey("nether_iron_ore");
    public static final RegistryKey<PlacedFeature> NETHER_LAPIS_ORE_PLACED_KEY = registerKey("nether_lapis_ore");
    public static final RegistryKey<PlacedFeature> NETHER_REDSTONE_ORE_PLACED_KEY = registerKey("nether_redstone_ore");

    public static final RegistryKey<PlacedFeature> END_COAL_ORE_PLACED_KEY = registerKey("end_coal_ore");
    public static final RegistryKey<PlacedFeature> END_COPPER_ORE_PLACED_KEY = registerKey("end_copper_ore");
    public static final RegistryKey<PlacedFeature> END_DIAMOND_ORE_PLACED_KEY = registerKey("end_diamond_ore");
    public static final RegistryKey<PlacedFeature> END_EMERALD_ORE_PLACED_KEY = registerKey("end_emerald_ore");
    public static final RegistryKey<PlacedFeature> END_GOLD_ORE_PLACED_KEY = registerKey("end_gold_ore");
    public static final RegistryKey<PlacedFeature> END_IRON_ORE_PLACED_KEY = registerKey("end_iron_ore");
    public static final RegistryKey<PlacedFeature> END_LAPIS_ORE_PLACED_KEY = registerKey("end_lapis_ore");
    public static final RegistryKey<PlacedFeature> END_REDSTONE_ORE_PLACED_KEY = registerKey("end_redstone_ore");
    public static final RegistryKey<PlacedFeature> END_QUARTZ_ORE_PLACED_KEY = registerKey("end_quartz_ore");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, QUARTZ_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.QUARTZ_ORE_KEY),
                OrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-128), YOffset.fixed(96))));
        register(context, DEEPSLATE_QUARTZ_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_QUARTZ_ORE_KEY),
                OrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-128), YOffset.fixed(96))));

        register(context, NETHER_COAL_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.NETHER_COAL_ORE_KEY),
                OrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, NETHER_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.NETHER_COPPER_ORE_KEY),
                OrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, NETHER_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.NETHER_DIAMOND_ORE_KEY),
                OrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, NETHER_EMERALD_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.NETHER_EMERALD_ORE_KEY),
                OrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, NETHER_IRON_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.NETHER_IRON_ORE_KEY),
                OrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, NETHER_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.NETHER_LAPIS_ORE_KEY),
                OrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, NETHER_REDSTONE_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.NETHER_REDSTONE_ORE_KEY),
                OrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));

        register(context, END_COAL_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.END_COAL_ORE_KEY),
                OrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, END_COPPER_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.END_COPPER_ORE_KEY),
                OrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, END_DIAMOND_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.END_DIAMOND_ORE_KEY),
                OrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, END_EMERALD_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.END_EMERALD_ORE_KEY),
                OrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, END_GOLD_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.END_GOLD_ORE_KEY),
                OrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, END_IRON_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.END_IRON_ORE_KEY),
                OrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, END_LAPIS_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.END_LAPIS_ORE_KEY),
                OrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, END_REDSTONE_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.END_REDSTONE_ORE_KEY),
                OrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
        register(context, END_QUARTZ_ORE_PLACED_KEY, configuredFeatureRegistryLookup.getOrThrow(ModConfiguredFeatures.END_QUARTZ_ORE_KEY),
                OrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(128))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(DimensionalOres.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
