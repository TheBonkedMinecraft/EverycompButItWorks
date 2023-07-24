package org.tbm.server.everycompbutitworks.client;

import com.starfish_studios.another_furniture.registry.AFRegistry;
import com.starfish_studios.another_furniture.client.renderer.blockentity.*;
import net.fabricmc.api.ClientModInitializer;
import org.tbm.server.everycompbutitworks.registry.AFBlockEntityTypes;

public class EveryCompatWorkingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AFRegistry.registerBlockEntityRenderer(AFBlockEntityTypes.PLANTER_BOX, PlanterBoxRenderer::new);
    }
}
