package indeedtough.dimensionalores;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.LoggerFactory;

public class DimensionalOresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Logger.info("Mod initialized for client");
    }

    public static class Logger {
        private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DimensionalOres.MOD_ID);

        public static void info(String text) {
            LOGGER.info("[Dimensional Ores] {}", text);
        }

        public static void error(String text) {
            LOGGER.error("[Dimensional Ores] {}", text);
        }
    }
}
