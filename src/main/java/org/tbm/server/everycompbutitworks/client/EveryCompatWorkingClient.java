package org.tbm.server.everycompbutitworks.client;

import com.starfish_studios.another_furniture.block.entity.PlanterBoxBlockEntity;
import com.starfish_studios.another_furniture.client.renderer.blockentity.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import org.tbm.server.everycompbutitworks.blocks.ModBlocks;

import static org.tbm.server.everycompbutitworks.registry.AFBlockEntityTypes.createBlockEntityType;

public class EveryCompatWorkingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererRegistry.register(createBlockEntityType(PlanterBoxBlockEntity::new, ModBlocks.FLOWERING_AZALEA_PLANTER), PlanterBoxRenderer::new);
    }
}
