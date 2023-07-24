package org.tbm.server.everycompbutitworks.registry;

import com.starfish_studios.another_furniture.block.entity.PlanterBoxBlockEntity;
import com.starfish_studios.another_furniture.registry.AFRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.tbm.server.everycompbutitworks.blocks.ModBlocks;

import java.util.function.Supplier;

public class AFBlockEntityTypes {
    public static final Supplier<BlockEntityType<PlanterBoxBlockEntity>> PLANTER_BOX = registerBlockEntityType("planter_box",
            () -> createBlockEntityType(PlanterBoxBlockEntity::new,
                    ModBlocks.FLOWERING_AZALEA_PLANTER
            ));

    public static void init() {}

    public static <T extends BlockEntityType<E>, E extends BlockEntity> Supplier<T> registerBlockEntityType(String name, Supplier<T> blockEntity) {
        var registry = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier("everycomp", name), blockEntity.get());
        return () -> registry;
    }
    public static <T extends BlockEntity> BlockEntityType<T> createBlockEntityType(AFRegistry.BlockEntitySupplier<T> blockEntity, Block... validBlocks) {
        return FabricBlockEntityTypeBuilder.create(blockEntity::create, validBlocks).build();
    }
}