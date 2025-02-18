package net.pxlstxl.jonspalette.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.pxlstxl.jonspalette.block.ModBlocks;
import net.pxlstxl.jonspalette.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PEBBLESTONE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SHULKER_BALL);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BOARD_PLANKS);
        blockStateModelGenerator.registerLog(ModBlocks.BOARD_PLANKS_COLUMN).log(ModBlocks.BOARD_PLANKS_COLUMN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PEBBLE, Models.GENERATED);

    }
}
