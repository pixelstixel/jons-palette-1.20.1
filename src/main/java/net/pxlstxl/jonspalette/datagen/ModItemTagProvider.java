package net.pxlstxl.jonspalette.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.pxlstxl.jonspalette.block.ModBlocks;
import net.pxlstxl.jonspalette.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.SHULKER_BALLS)
                .add(ModBlocks.SHULKER_BALL.asItem())
                .add(ModBlocks.WHITE_SHULKER_BALL.asItem())
                .add(ModBlocks.ORANGE_SHULKER_BALL.asItem())
                .add(ModBlocks.MAGENTA_SHULKER_BALL.asItem())
                .add(ModBlocks.LIGHT_BLUE_SHULKER_BALL.asItem())
                .add(ModBlocks.YELLOW_SHULKER_BALL.asItem())
                .add(ModBlocks.LIME_SHULKER_BALL.asItem())
                .add(ModBlocks.PINK_SHULKER_BALL.asItem())
                .add(ModBlocks.GRAY_SHULKER_BALL.asItem())
                .add(ModBlocks.LIGHT_GRAY_SHULKER_BALL.asItem())
                .add(ModBlocks.CYAN_SHULKER_BALL.asItem())
                .add(ModBlocks.PURPLE_SHULKER_BALL.asItem())
                .add(ModBlocks.BLUE_SHULKER_BALL.asItem())
                .add(ModBlocks.BROWN_SHULKER_BALL.asItem())
                .add(ModBlocks.GREEN_SHULKER_BALL.asItem())
                .add(ModBlocks.RED_SHULKER_BALL.asItem())
                .add(ModBlocks.BLACK_SHULKER_BALL.asItem());
    }
}
