package net.pxlstxl.jonspalette.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pxlstxl.jonspalette.JonsPalette;

public class ModItemGroups {
    public static final ItemGroup PEBBLE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(JonsPalette.MOD_ID, "pebble"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pebble"))
                    .icon(() -> new ItemStack(ModItems.PEBBLE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PEBBLE);
                        entries.add(ModItems.FLAT_PEBBLE);

                    }).build());
    public static void registerItemGroups()
    {
        JonsPalette.LOGGER.info("Registering Item Groups for" + JonsPalette.MOD_ID);
    }

}
