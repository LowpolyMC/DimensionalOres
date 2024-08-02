package teamcouncil.dimensionalores.data.server;

import teamcouncil.dimensionalores.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BlockLootTableProvider extends FabricBlockLootTableProvider {
    public BlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.QUARTZ_ORE, oreDrops(ModBlocks.QUARTZ_ORE, Items.QUARTZ));

        addDrop(ModBlocks.DEEPSLATE_QUARTZ_ORE, oreDrops(ModBlocks.DEEPSLATE_QUARTZ_ORE, Items.QUARTZ));

        addDrop(ModBlocks.NETHER_COAL_ORE, oreDrops(ModBlocks.NETHER_COAL_ORE, Items.COAL));
        addDrop(ModBlocks.NETHER_COPPER_ORE, copperOreDrops(ModBlocks.NETHER_COPPER_ORE));
        addDrop(ModBlocks.NETHER_DIAMOND_ORE, oreDrops(ModBlocks.NETHER_DIAMOND_ORE, Items.DIAMOND));
        addDrop(ModBlocks.NETHER_EMERALD_ORE, oreDrops(ModBlocks.NETHER_EMERALD_ORE, Items.EMERALD));
        addDrop(ModBlocks.NETHER_IRON_ORE, oreDrops(ModBlocks.NETHER_IRON_ORE, Items.RAW_IRON));
        addDrop(ModBlocks.NETHER_LAPIS_ORE, lapisOreDrops(ModBlocks.NETHER_LAPIS_ORE));
        addDrop(ModBlocks.NETHER_REDSTONE_ORE, redstoneOreDrops(ModBlocks.NETHER_REDSTONE_ORE));

        addDrop(ModBlocks.END_COAL_ORE, oreDrops(ModBlocks.END_COAL_ORE, Items.COAL));
        addDrop(ModBlocks.END_COPPER_ORE, copperOreDrops(ModBlocks.END_COPPER_ORE));
        addDrop(ModBlocks.END_DIAMOND_ORE, oreDrops(ModBlocks.END_DIAMOND_ORE, Items.DIAMOND));
        addDrop(ModBlocks.END_EMERALD_ORE, oreDrops(ModBlocks.END_EMERALD_ORE, Items.EMERALD));
        addDrop(ModBlocks.END_GOLD_ORE, oreDrops(ModBlocks.END_GOLD_ORE, Items.RAW_GOLD));
        addDrop(ModBlocks.END_IRON_ORE, oreDrops(ModBlocks.END_IRON_ORE, Items.RAW_IRON));
        addDrop(ModBlocks.END_LAPIS_ORE, lapisOreDrops(ModBlocks.END_LAPIS_ORE));
        addDrop(ModBlocks.END_QUARTZ_ORE, oreDrops(ModBlocks.END_QUARTZ_ORE, Items.QUARTZ));
        addDrop(ModBlocks.END_REDSTONE_ORE, redstoneOreDrops(ModBlocks.END_REDSTONE_ORE));
    }
}
