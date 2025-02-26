package net.pxlstxl.jonspalette.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.pxlstxl.jonspalette.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PEBBLESTONE);

        addDrop(ModBlocks.SHULKER_BALL);
        addDrop(ModBlocks.WHITE_SHULKER_BALL);
        addDrop(ModBlocks.ORANGE_SHULKER_BALL);
        addDrop(ModBlocks.MAGENTA_SHULKER_BALL);
        addDrop(ModBlocks.LIGHT_BLUE_SHULKER_BALL);
        addDrop(ModBlocks.YELLOW_SHULKER_BALL);
        addDrop(ModBlocks.LIME_SHULKER_BALL);
        addDrop(ModBlocks.PINK_SHULKER_BALL);
        addDrop(ModBlocks.GRAY_SHULKER_BALL);
        addDrop(ModBlocks.LIGHT_GRAY_SHULKER_BALL);
        addDrop(ModBlocks.CYAN_SHULKER_BALL);
        addDrop(ModBlocks.PURPLE_SHULKER_BALL);
        addDrop(ModBlocks.BLUE_SHULKER_BALL);
        addDrop(ModBlocks.BROWN_SHULKER_BALL);
        addDrop(ModBlocks.GREEN_SHULKER_BALL);
        addDrop(ModBlocks.RED_SHULKER_BALL);
        addDrop(ModBlocks.BLACK_SHULKER_BALL);

        addDrop(ModBlocks.STAVE_PLANKS);
        addDrop(ModBlocks.STAVE_PLANKS_COLUMN);

        addDrop(ModBlocks.WORKSTONE);
        addDrop(ModBlocks.POLISHED_WORKSTONE);
        addDrop(ModBlocks.CHISELED_WORKSTONE);

        addDrop(ModBlocks.BOARD_PLANKS);
        addDrop(ModBlocks.POLISHED_BOARD_PLANKS);
        addDrop(ModBlocks.CHISELED_BOARD_PLANKS);
        addDrop(ModBlocks.PATTERNED_BOARD_PLANKS);

    }
}
