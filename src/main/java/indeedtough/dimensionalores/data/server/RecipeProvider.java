package indeedtough.dimensionalores.data.server;

import indeedtough.dimensionalores.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> COAL_SMELTABLES = List.of(ModBlocks.NETHER_COAL_ORE, ModBlocks.END_COAL_ORE);
    private static final List<ItemConvertible> COPPER_SMELTABLES = List.of(ModBlocks.NETHER_COPPER_ORE, ModBlocks.END_COPPER_ORE);
    private static final List<ItemConvertible> DIAMOND_SMELTABLES = List.of(ModBlocks.NETHER_DIAMOND_ORE, ModBlocks.END_DIAMOND_ORE);
    private static final List<ItemConvertible> EMERALD_SMELTABLES = List.of(ModBlocks.NETHER_EMERALD_ORE, ModBlocks.END_EMERALD_ORE);
    private static final List<ItemConvertible> GOLD_SMELTABLES = List.of(ModBlocks.END_GOLD_ORE);
    private static final List<ItemConvertible> IRON_SMELTABLES = List.of(ModBlocks.NETHER_IRON_ORE, ModBlocks.END_IRON_ORE);
    private static final List<ItemConvertible> LAPIS_SMELTABLES = List.of(ModBlocks.NETHER_LAPIS_ORE, ModBlocks.END_LAPIS_ORE);
    private static final List<ItemConvertible> REDSTONE_SMELTABLES = List.of(ModBlocks.NETHER_REDSTONE_ORE, ModBlocks.END_REDSTONE_ORE);
    private static final List<ItemConvertible> QUARTZ_SMELTABLES = List.of(ModBlocks.QUARTZ_ORE, ModBlocks.DEEPSLATE_QUARTZ_ORE, ModBlocks.END_QUARTZ_ORE);

    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL,
                0.1f, 200, "coal");
        offerBlasting(exporter, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL,
                0.1f, 100, "coal");

        offerSmelting(exporter, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 200, "copper_ingot");
        offerBlasting(exporter, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 100, "copper_ingot");

        offerSmelting(exporter, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND,
                1.0f, 200, "diamond");
        offerBlasting(exporter, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND,
                1.0f, 100, "diamond");

        offerSmelting(exporter, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD,
                1.0f, 200, "emerald");
        offerBlasting(exporter, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD,
                1.0f, 100, "emerald");

        offerSmelting(exporter, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT,
                1.0f, 200, "gold_ingot");
        offerBlasting(exporter, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT,
                1.0f, 100, "gold_ingot");

        offerSmelting(exporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 200, "iron_ingot");
        offerBlasting(exporter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 100, "iron_ingot");

        offerSmelting(exporter, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.2f, 200, "lapis_lazuli");
        offerBlasting(exporter, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.2f, 100, "lapis_lazuli");

        offerSmelting(exporter, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 200, "redstone");
        offerBlasting(exporter, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 100, "redstone");

        offerSmelting(exporter, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ,
                0.7f, 200, "quartz");
        offerBlasting(exporter, QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ,
                0.7f, 100, "quartz");
    }
}
