package net.darties.minescape;

import net.darties.minescape.block.ModBlocks;
import net.darties.minescape.item.ModItemGroups;
import net.darties.minescape.item.ModItems;
import net.darties.minescape.util.ModCustomTrades;
import net.darties.minescape.util.ModLootTableModifiers;
import net.darties.minescape.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MineScape implements ModInitializer {
	public static final String MOD_ID = "minescape";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		ModWorldGeneration.generateModWorldGen();
	}
}

