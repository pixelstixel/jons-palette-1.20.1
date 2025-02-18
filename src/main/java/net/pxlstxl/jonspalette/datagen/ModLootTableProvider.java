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
        addDrop(ModBlocks.BOARD_PLANKS);
        addDrop(ModBlocks.BOARD_PLANKS_COLUMN);


    }
}
