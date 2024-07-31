package indeedtough.dimensionalores.data.server;

import indeedtough.dimensionalores.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "ores")))
                .add(ModBlocks.QUARTZ_ORE)
                .add(ModBlocks.DEEPSLATE_QUARTZ_ORE)
                .add(ModBlocks.NETHER_COAL_ORE)
                .add(ModBlocks.NETHER_COPPER_ORE)
                .add(ModBlocks.NETHER_DIAMOND_ORE)
                .add(ModBlocks.NETHER_EMERALD_ORE)
                .add(ModBlocks.NETHER_IRON_ORE)
                .add(ModBlocks.NETHER_LAPIS_ORE)
                .add(ModBlocks.NETHER_REDSTONE_ORE)
                .add(ModBlocks.END_COAL_ORE)
                .add(ModBlocks.END_COPPER_ORE)
                .add(ModBlocks.END_DIAMOND_ORE)
                .add(ModBlocks.END_EMERALD_ORE)
                .add(ModBlocks.END_GOLD_ORE)
                .add(ModBlocks.END_IRON_ORE)
                .add(ModBlocks.END_LAPIS_ORE)
                .add(ModBlocks.END_REDSTONE_ORE)
                .add(ModBlocks.END_QUARTZ_ORE);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.QUARTZ_ORE)
                .add(ModBlocks.DEEPSLATE_QUARTZ_ORE)
                .add(ModBlocks.NETHER_COAL_ORE)
                .add(ModBlocks.NETHER_COPPER_ORE)
                .add(ModBlocks.NETHER_DIAMOND_ORE)
                .add(ModBlocks.NETHER_EMERALD_ORE)
                .add(ModBlocks.NETHER_IRON_ORE)
                .add(ModBlocks.NETHER_LAPIS_ORE)
                .add(ModBlocks.NETHER_REDSTONE_ORE)
                .add(ModBlocks.END_COAL_ORE)
                .add(ModBlocks.END_COPPER_ORE)
                .add(ModBlocks.END_DIAMOND_ORE)
                .add(ModBlocks.END_EMERALD_ORE)
                .add(ModBlocks.END_GOLD_ORE)
                .add(ModBlocks.END_IRON_ORE)
                .add(ModBlocks.END_LAPIS_ORE)
                .add(ModBlocks.END_REDSTONE_ORE)
                .add(ModBlocks.END_QUARTZ_ORE);
        getOrCreateTagBuilder(BlockTags.COAL_ORES)
                .add(ModBlocks.NETHER_COAL_ORE)
                .add(ModBlocks.END_COAL_ORE);
        getOrCreateTagBuilder(BlockTags.COPPER_ORES)
                .add(ModBlocks.NETHER_COPPER_ORE)
                .add(ModBlocks.END_COPPER_ORE);
        getOrCreateTagBuilder(BlockTags.DIAMOND_ORES)
                .add(ModBlocks.NETHER_DIAMOND_ORE)
                .add(ModBlocks.END_DIAMOND_ORE);
        getOrCreateTagBuilder(BlockTags.EMERALD_ORES)
                .add(ModBlocks.NETHER_EMERALD_ORE)
                .add(ModBlocks.END_EMERALD_ORE);
        getOrCreateTagBuilder(BlockTags.GOLD_ORES)
                .add(ModBlocks.END_GOLD_ORE);
        getOrCreateTagBuilder(BlockTags.IRON_ORES)
                .add(ModBlocks.NETHER_IRON_ORE)
                .add(ModBlocks.END_IRON_ORE);
        getOrCreateTagBuilder(BlockTags.LAPIS_ORES)
                .add(ModBlocks.NETHER_LAPIS_ORE)
                .add(ModBlocks.END_LAPIS_ORE);
        getOrCreateTagBuilder(BlockTags.REDSTONE_ORES)
                .add(ModBlocks.NETHER_REDSTONE_ORE)
                .add(ModBlocks.END_REDSTONE_ORE);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "ores/quartz")))
                .add(ModBlocks.QUARTZ_ORE)
                .add(ModBlocks.DEEPSLATE_QUARTZ_ORE)
                .add(ModBlocks.END_QUARTZ_ORE);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.NETHER_COPPER_ORE)
                .add(ModBlocks.NETHER_IRON_ORE)
                .add(ModBlocks.NETHER_LAPIS_ORE)
                .add(ModBlocks.END_COPPER_ORE)
                .add(ModBlocks.END_IRON_ORE)
                .add(ModBlocks.END_LAPIS_ORE);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.NETHER_DIAMOND_ORE)
                .add(ModBlocks.NETHER_EMERALD_ORE)
                .add(ModBlocks.NETHER_REDSTONE_ORE)
                .add(ModBlocks.END_DIAMOND_ORE)
                .add(ModBlocks.END_EMERALD_ORE)
                .add(ModBlocks.END_GOLD_ORE)
                .add(ModBlocks.END_REDSTONE_ORE);
    }
}
