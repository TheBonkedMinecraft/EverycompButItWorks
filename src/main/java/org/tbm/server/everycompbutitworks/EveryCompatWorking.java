package org.tbm.server.everycompbutitworks;

import net.fabricmc.api.ModInitializer;
import org.tbm.server.everycompbutitworks.blocks.ModBlocks;

public class EveryCompatWorking implements ModInitializer {
    @Override
    public void onInitialize() {
        ModBlocks.registerModBlocks();
    }
}
