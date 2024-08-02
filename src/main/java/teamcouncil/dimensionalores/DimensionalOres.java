package teamcouncil.dimensionalores;

import teamcouncil.dimensionalores.block.ModBlocks;
import teamcouncil.dimensionalores.client.DimensionalOresClient;
import teamcouncil.dimensionalores.client.ModConfig;
import teamcouncil.dimensionalores.item.ModItemGroups;
import teamcouncil.dimensionalores.world.gen.WorldGeneration;
import net.fabricmc.api.ModInitializer;

public class DimensionalOres implements ModInitializer {
	public static final String MOD_ID = "dimensionalores";

	@Override
	public void onInitialize() {
		ModConfig.CONFIG.load();

		ModBlocks.register();
		ModItemGroups.register();

		WorldGeneration.register();

		DimensionalOresClient.Logger.info("Mod initialized");
	}
}