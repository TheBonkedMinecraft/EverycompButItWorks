package org.tbm.server.everycompbutitworks;

import com.starfish_studios.another_furniture.block.PlanterBoxBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EverycompButItWorks implements ModInitializer {
    @Override
    public void onInitialize() {
        //it doesnt call onInitialize and doesnt register the block
        System.out.println("hmm");
        registerModBlocks();
    }
    private static Block registerBlock(String id, String name, Block block) {
        registerBlockItem(id, name, block);
        return Registry.register(Registry.BLOCK, new Identifier(id, name), block);
    }

    private static Item registerBlockItem(String id, String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(id, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        System.out.println("Hmmge");
        registerBlock("everycomp", "af/ecologics/flowering_azalea_planter_box", new PlanterBoxBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    }
}
