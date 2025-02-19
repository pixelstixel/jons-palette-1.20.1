package net.pxlstxl.jonspalette.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.pxlstxl.jonspalette.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PEBBLESTONE)

                .add(ModBlocks.SHULKER_BALL)
                .add(ModBlocks.WHITE_SHULKER_BALL)
                .add(ModBlocks.ORANGE_SHULKER_BALL)
                .add(ModBlocks.MAGENTA_SHULKER_BALL)
                .add(ModBlocks.LIGHT_BLUE_SHULKER_BALL)
                .add(ModBlocks.YELLOW_SHULKER_BALL)
                .add(ModBlocks.LIME_SHULKER_BALL)
                .add(ModBlocks.PINK_SHULKER_BALL)
                .add(ModBlocks.GRAY_SHULKER_BALL)
                .add(ModBlocks.LIGHT_GRAY_SHULKER_BALL)
                .add(ModBlocks.CYAN_SHULKER_BALL)
                .add(ModBlocks.PURPLE_SHULKER_BALL)
                .add(ModBlocks.BLUE_SHULKER_BALL)
                .add(ModBlocks.BROWN_SHULKER_BALL)
                .add(ModBlocks.GREEN_SHULKER_BALL)
                .add(ModBlocks.RED_SHULKER_BALL)
                .add(ModBlocks.BLACK_SHULKER_BALL);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.BOARD_PLANKS)
                .add(ModBlocks.BOARD_PLANKS_COLUMN);

    }
}
