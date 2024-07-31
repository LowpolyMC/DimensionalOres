package indeedtough.dimensionalores.block;

import indeedtough.dimensionalores.DimensionalOres;
import indeedtough.dimensionalores.DimensionalOresClient;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block QUARTZ_ORE = registerBlock("quartz_ore", new Block(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.STONE).strength(3.0F, 3.0F)));

    public static final Block DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore", new Block(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.DEEPSLATE).strength(4.5F, 3.0F)));

    public static final Block NETHER_COAL_ORE = registerBlock("nether_coal_ore", new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.NETHERRACK).strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block NETHER_COPPER_ORE = registerBlock("nether_copper_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.NETHERRACK).strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block NETHER_DIAMOND_ORE = registerBlock("nether_diamond_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.NETHERRACK).strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block NETHER_EMERALD_ORE = registerBlock("nether_emerald_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.NETHERRACK).strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block NETHER_IRON_ORE = registerBlock("nether_iron_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.NETHERRACK).strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block NETHER_LAPIS_ORE = registerBlock("nether_lapis_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.NETHERRACK).strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block NETHER_REDSTONE_ORE = registerBlock("nether_redstone_ore", new RedstoneOreBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.NETHERRACK).ticksRandomly().luminance(net.minecraft.block.Blocks.createLightLevelFromLitBlockState(9)).strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHER_ORE)));

    public static final Block END_COAL_ORE = registerBlock("end_coal_ore", new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.END_STONE).strength(3.0F, 9.0F)));
    public static final Block END_COPPER_ORE = registerBlock("end_copper_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.END_STONE).strength(3.0F, 9.0F)));
    public static final Block END_DIAMOND_ORE = registerBlock("end_diamond_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.END_STONE).strength(3.0F, 9.0F)));
    public static final Block END_EMERALD_ORE = registerBlock("end_emerald_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.END_STONE).strength(3.0F, 9.0F)));
    public static final Block END_GOLD_ORE = registerBlock("end_gold_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.END_STONE).strength(3.0F, 9.0F)));
    public static final Block END_IRON_ORE = registerBlock("end_iron_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.END_STONE).strength(3.0F, 9.0F)));
    public static final Block END_LAPIS_ORE = registerBlock("end_lapis_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.END_STONE).strength(3.0F, 9.0F)));
    public static final Block END_REDSTONE_ORE = registerBlock("end_redstone_ore", new RedstoneOreBlock(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.END_STONE).ticksRandomly().luminance(net.minecraft.block.Blocks.createLightLevelFromLitBlockState(9)).strength(3.0F, 9.0F)));
    public static final Block END_QUARTZ_ORE = registerBlock("end_quartz_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(net.minecraft.block.Blocks.END_STONE).strength(3.0F, 9.0F)));

    private static Block registerBlock(String name, Block block) {
        registerItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DimensionalOres.MOD_ID, name), block);
    }

    private static Item registerItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(DimensionalOres.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void register() {
        DimensionalOresClient.Logger.info("Registered blocks");
    }
}
