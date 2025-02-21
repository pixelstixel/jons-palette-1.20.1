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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGENTA_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_BLUE_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIME_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAY_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_GRAY_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CYAN_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BROWN_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SHULKER_BALL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_SHULKER_BALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STAVE_PLANKS);
        blockStateModelGenerator.registerLog(ModBlocks.STAVE_PLANKS_COLUMN).log(ModBlocks.STAVE_PLANKS_COLUMN);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WORKSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_WORKSTONE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_BOARD_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PATTERNED_BOARD_PLANKS);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PEBBLE, Models.GENERATED);

    }
}
