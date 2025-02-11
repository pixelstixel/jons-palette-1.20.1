package net.pxlstxl.jonspalette;

import net.fabricmc.api.ModInitializer;

import net.pxlstxl.jonspalette.item.ModItemGroups;
import net.pxlstxl.jonspalette.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JonsPalette implements ModInitializer {
	public static final String MOD_ID = "jonspalette";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}