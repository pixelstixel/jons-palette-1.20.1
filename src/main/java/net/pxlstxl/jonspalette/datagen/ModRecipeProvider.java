package net.pxlstxl.jonspalette.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.StonecuttingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.pxlstxl.jonspalette.block.ModBlocks;
import net.pxlstxl.jonspalette.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {

        // Pebbles from stones


        // Pebblestone Crafting
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEBBLESTONE)
                .pattern("PP ")
                .pattern("PP ")
                .pattern("   ")
                .input('P', ModItems.PEBBLE)
                .criterion(hasItem(ModItems.PEBBLE), conditionsFromItem(ModItems.PEBBLE))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.PEBBLESTONE)));

        // Shulker Ball Crafting
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHULKER_BALL, 2)
                .pattern(" S ")
                .pattern("SFS")
                .pattern(" S ")
                .input('S', Items.SHULKER_SHELL)
                .input('F', Items.POPPED_CHORUS_FRUIT)
                .criterion(hasItem(Items.SHULKER_SHELL), conditionsFromItem(Items.SHULKER_SHELL))
                .criterion(hasItem(Items.POPPED_CHORUS_FRUIT), conditionsFromItem(Items.POPPED_CHORUS_FRUIT))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.SHULKER_BALL)));

        // Board Planks Crafting
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BOARD_PLANKS, 4)
                .input(Items.BARREL)
                .criterion(hasItem(Items.BARREL), conditionsFromItem(Items.BARREL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.BOARD_PLANKS)));

        // Board Planks Column from Board Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BOARD_PLANKS_COLUMN, 2)
                .pattern("B  ")
                .pattern("B  ")
                .pattern("   ")
                .input('B', ModBlocks.BOARD_PLANKS)
                .criterion(hasItem(ModBlocks.BOARD_PLANKS), conditionsFromItem(ModBlocks.BOARD_PLANKS))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.BOARD_PLANKS_COLUMN)));

    }
}
