package org.tbm.server.everycompbutitworks;

import net.fabricmc.api.ModInitializer;
import org.tbm.server.everycompbutitworks.blocks.ModBlocks;
//import org.tbm.server.everycompbutitworks.registry.AFBlockEntityTypes;

public class EveryCompatWorking implements ModInitializer {
    @Override
    public void onInitialize() {
        ModBlocks.registerModBlocks();
        //AFBlockEntityTypes.init();
    }
}
