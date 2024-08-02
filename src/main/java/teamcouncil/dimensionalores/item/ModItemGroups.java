package teamcouncil.dimensionalores.item;

import teamcouncil.dimensionalores.DimensionalOres;
import teamcouncil.dimensionalores.client.DimensionalOresClient;
import teamcouncil.dimensionalores.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DIMENSIONAL_ORES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DimensionalOres.MOD_ID, DimensionalOres.MOD_ID),
            FabricItemGroup.builder().displayName(Text.translatable("dimensionalores.title"))
                    .icon(() -> new ItemStack(ModBlocks.NETHER_DIAMOND_ORE)).entries((displayContext, entries) -> {
                        ModItems.addAllItemEntries(entries);
                    }).build());

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addAllItemEntries);

        DimensionalOresClient.Logger.info("Registered item groups");
    }
}
