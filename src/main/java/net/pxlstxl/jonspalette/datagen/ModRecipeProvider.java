package net.pxlstxl.jonspalette.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.pxlstxl.jonspalette.block.ModBlocks;
import net.pxlstxl.jonspalette.item.ModItems;
import net.pxlstxl.jonspalette.util.ModTags;

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

        // Shulker Ball Coloring
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.WHITE_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.WHITE_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.ORANGE_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.ORANGE_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.MAGENTA_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.MAGENTA_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.LIGHT_BLUE_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.YELLOW_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.YELLOW_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.LIME_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.LIME_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.PINK_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.PINK_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.GRAY_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.GRAY_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.LIGHT_GRAY_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.CYAN_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.CYAN_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.PURPLE_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.PURPLE_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.BLUE_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.BLUE_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.BROWN_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.BROWN_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.GREEN_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.GREEN_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.RED_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.RED_SHULKER_BALL)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_SHULKER_BALL)
                .input(Ingredient.fromTag(ModTags.SHULKER_BALLS))
                .input(Items.BLACK_DYE)
                .criterion(hasItem(ModBlocks.SHULKER_BALL), conditionsFromItem(ModBlocks.SHULKER_BALL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.BLACK_SHULKER_BALL)));


        // Board Planks Crafting
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STAVE_PLANKS, 4)
                .input(Items.BARREL)
                .criterion(hasItem(Items.BARREL), conditionsFromItem(Items.BARREL))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.STAVE_PLANKS)));

        // Board Planks Column from Board Planks
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STAVE_PLANKS_COLUMN, 2)
                .pattern("B  ")
                .pattern("B  ")
                .input('B', ModBlocks.BOARD_PLANKS)
                .criterion(hasItem(ModBlocks.BOARD_PLANKS), conditionsFromItem(ModBlocks.BOARD_PLANKS))
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.STAVE_PLANKS_COLUMN)));

    }
}
