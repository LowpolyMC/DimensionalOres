package indeedtough.dimensionalores;

import indeedtough.dimensionalores.block.ModBlocks;
import indeedtough.dimensionalores.item.ModItemGroups;
import indeedtough.dimensionalores.world.gen.WorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;

public class DimensionalOres implements ModInitializer {
	public static final String MOD_ID = "dimensionalores";

	@Override
	public void onInitialize() {
		ModBlocks.register();
		ModItemGroups.register();

		WorldGeneration.register();

		DimensionalOresClient.Logger.info("Mod initialized");
	}
}