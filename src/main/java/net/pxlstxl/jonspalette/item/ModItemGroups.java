package net.pxlstxl.jonspalette.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pxlstxl.jonspalette.JonsPalette;
import net.pxlstxl.jonspalette.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(JonsPalette.MOD_ID, "pebble"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.jonspalette"))
                    .icon(() -> new ItemStack(ModBlocks.BOARD_PLANKS)).entries((displayContext, entries) ->
                    {
                        entries.add(ModItems.PEBBLE);
                        entries.add(ModBlocks.PEBBLESTONE);

                        entries.add(ModBlocks.SHULKER_BALL);
                        entries.add(ModBlocks.WHITE_SHULKER_BALL);
                        entries.add(ModBlocks.ORANGE_SHULKER_BALL);
                        entries.add(ModBlocks.MAGENTA_SHULKER_BALL);
                        entries.add(ModBlocks.LIGHT_BLUE_SHULKER_BALL);
                        entries.add(ModBlocks.YELLOW_SHULKER_BALL);
                        entries.add(ModBlocks.LIME_SHULKER_BALL);
                        entries.add(ModBlocks.PINK_SHULKER_BALL);
                        entries.add(ModBlocks.GRAY_SHULKER_BALL);
                        entries.add(ModBlocks.LIGHT_GRAY_SHULKER_BALL);
                        entries.add(ModBlocks.CYAN_SHULKER_BALL);
                        entries.add(ModBlocks.PURPLE_SHULKER_BALL);
                        entries.add(ModBlocks.BLUE_SHULKER_BALL);
                        entries.add(ModBlocks.BROWN_SHULKER_BALL);
                        entries.add(ModBlocks.GREEN_SHULKER_BALL);
                        entries.add(ModBlocks.RED_SHULKER_BALL);
                        entries.add(ModBlocks.BLACK_SHULKER_BALL);

                        entries.add(ModBlocks.STAVE_PLANKS);
                        entries.add(ModBlocks.STAVE_PLANKS_COLUMN);

                        entries.add(ModBlocks.WORKSTONE);
                        entries.add(ModBlocks.POLISHED_WORKSTONE);
                        entries.add(ModBlocks.CHISELED_WORKSTONE);

                        entries.add(ModBlocks.BOARD_PLANKS);
                        entries.add(ModBlocks.POLISHED_BOARD_PLANKS);
                        entries.add(ModBlocks.CHISELED_BOARD_PLANKS);
                        entries.add(ModBlocks.PATTERNED_BOARD_PLANKS);


                    }).build());

    public static void registerItemGroups()
    {
        JonsPalette.LOGGER.info("Registering Item Groups for" + JonsPalette.MOD_ID);
    }

}
