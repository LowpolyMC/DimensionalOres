package teamcouncil.dimensionalores.client;

import dev.isxander.yacl3.api.*;
import dev.isxander.yacl3.api.controller.TickBoxControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.SerialEntry;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import teamcouncil.dimensionalores.DimensionalOres;

public class ModConfig {
    public static final ConfigClassHandler<ModConfig> CONFIG = ConfigClassHandler.createBuilder(ModConfig.class)
            .serializer(config -> GsonConfigSerializerBuilder.create(config)
                    .setPath(FabricLoader.getInstance().getConfigDir().resolve("%s.json".formatted(DimensionalOres.MOD_ID)))
                    .build())
            .build();

    @SerialEntry public boolean quartz_ore = true;
    @SerialEntry public boolean deepslate_quartz_ore = true;

    @SerialEntry public boolean nether_coal_ore = true;
    @SerialEntry public boolean nether_copper_ore = true;
    @SerialEntry public boolean nether_diamond_ore = true;
    @SerialEntry public boolean nether_emerald_ore = true;
    @SerialEntry public boolean nether_iron_ore = true;
    @SerialEntry public boolean nether_lapis_ore = true;
    @SerialEntry public boolean nether_redstone_ore = true;

    @SerialEntry public boolean end_coal_ore = true;
    @SerialEntry public boolean end_copper_ore = true;
    @SerialEntry public boolean end_diamond_ore = true;
    @SerialEntry public boolean end_emerald_ore = true;
    @SerialEntry public boolean end_gold_ore = true;
    @SerialEntry public boolean end_iron_ore = true;
    @SerialEntry public boolean end_lapis_ore = true;
    @SerialEntry public boolean end_quartz_ore = true;
    @SerialEntry public boolean end_redstone_ore = true;

    public static Screen create(Screen parent) {
        return YetAnotherConfigLib.create(CONFIG, (defaults, config, builder) -> builder
                .title(Text.translatable("dimensionalores.title"))
                .category(ConfigCategory.createBuilder()
                        .name(Text.translatable("dimensionalores.title"))
                        .group(OptionGroup.createBuilder()
                                .name(Text.literal("Overworld"))
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.quartz_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.quartz_ore, newVal -> config.quartz_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.deepslate_quartz_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.deepslate_quartz_ore, newVal -> config.deepslate_quartz_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .build())
                        .group(OptionGroup.createBuilder()
                                .name(Text.literal("The Nether"))
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.nether_coal_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.nether_coal_ore, newVal -> config.nether_coal_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.nether_copper_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.nether_copper_ore, newVal -> config.nether_copper_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.nether_diamond_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.nether_diamond_ore, newVal -> config.nether_diamond_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.nether_emerald_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.nether_emerald_ore, newVal -> config.nether_emerald_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.nether_iron_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.nether_iron_ore, newVal -> config.nether_iron_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.nether_lapis_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.nether_lapis_ore, newVal -> config.nether_lapis_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.nether_redstone_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.nether_redstone_ore, newVal -> config.nether_redstone_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .build())
                        .group(OptionGroup.createBuilder()
                                .name(Text.literal("The End"))
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.end_coal_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.end_coal_ore, newVal -> config.end_coal_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.end_copper_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.end_copper_ore, newVal -> config.end_copper_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.end_diamond_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.end_diamond_ore, newVal -> config.end_diamond_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.end_emerald_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.end_emerald_ore, newVal -> config.end_emerald_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.end_gold_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.end_gold_ore, newVal -> config.end_gold_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.end_iron_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.end_iron_ore, newVal -> config.end_iron_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.end_lapis_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.end_lapis_ore, newVal -> config.end_lapis_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.end_quartz_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.end_quartz_ore, newVal -> config.end_quartz_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .option(Option.<Boolean>createBuilder()
                                        .name(Text.translatable("block.dimensionalores.end_redstone_ore"))
                                        .description(OptionDescription.of(Text.translatable("dimensionalores.config.warning")))
                                        .binding(true, () -> config.end_redstone_ore, newVal -> config.end_redstone_ore = newVal)
                                        .controller(TickBoxControllerBuilder::create)
                                        .build())
                                .build())
                        .build()
        )).generateScreen(parent);
    }
}
