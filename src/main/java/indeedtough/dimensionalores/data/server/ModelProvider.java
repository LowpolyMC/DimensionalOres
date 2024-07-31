package indeedtough.dimensionalores.data.server;

import indeedtough.dimensionalores.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.QUARTZ_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_QUARTZ_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_REDSTONE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_QUARTZ_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_REDSTONE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {}
}
