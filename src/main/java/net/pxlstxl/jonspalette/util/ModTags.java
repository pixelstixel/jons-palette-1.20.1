package net.pxlstxl.jonspalette.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.pxlstxl.jonspalette.JonsPalette;

public class ModTags
{
    public static class Blocks
    {
        private static TagKey<Block> createTag(String name)
        {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(JonsPalette.MOD_ID, name));
        }
    }

    public static class Items
    {
        private static TagKey<Item> createTag(String name)
        {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(JonsPalette.MOD_ID, name));
        }
    }

    public static final TagKey<Item> SHULKER_BALLS = TagKey.of(RegistryKeys.ITEM, Identifier.of("jonspalette", "shulker_balls"));

}
