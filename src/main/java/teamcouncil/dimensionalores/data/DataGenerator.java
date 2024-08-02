package teamcouncil.dimensionalores.data;

import teamcouncil.dimensionalores.data.server.*;
import teamcouncil.dimensionalores.world.ModConfiguredFeatures;
import teamcouncil.dimensionalores.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(BlockLootTableProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(DynamicRegistryProvider::new);
		pack.addProvider(ModelProvider::new);
		pack.addProvider(RecipeProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
