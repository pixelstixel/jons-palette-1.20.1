package net.pxlstxl.jonspalette.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pxlstxl.jonspalette.JonsPalette;

public class ModBlocks
{
    public static final Block PEBBLESTONE = registerBlock("pebblestone",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block SHULKER_BALL = registerBlock("shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_SHULKER_BALL = registerBlock("white_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_SHULKER_BALL = registerBlock("orange_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block MAGENTA_SHULKER_BALL = registerBlock("magenta_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BLUE_SHULKER_BALL = registerBlock("light_blue_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block YELLOW_SHULKER_BALL = registerBlock("yellow_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIME_SHULKER_BALL = registerBlock("lime_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PINK_SHULKER_BALL = registerBlock("pink_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GRAY_SHULKER_BALL = registerBlock("gray_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_GRAY_SHULKER_BALL = registerBlock("light_gray_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block CYAN_SHULKER_BALL = registerBlock("cyan_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PURPLE_SHULKER_BALL = registerBlock("purple_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BLUE_SHULKER_BALL = registerBlock("blue_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BROWN_SHULKER_BALL = registerBlock("brown_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREEN_SHULKER_BALL = registerBlock("green_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block RED_SHULKER_BALL = registerBlock("red_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BLACK_SHULKER_BALL = registerBlock("black_shulker_ball",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));

    public static final Block BOARD_PLANKS = registerBlock("board_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.BARREL)));
    public static final Block BOARD_PLANKS_COLUMN = registerBlock("board_planks_column",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BARREL)));


    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(JonsPalette.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(JonsPalette.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks()
    {
        JonsPalette.LOGGER.info("Registering ModBlocks for " + JonsPalette.MOD_ID);
    }



}
