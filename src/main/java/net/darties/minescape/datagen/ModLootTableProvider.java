package net.darties.minescape.datagen;

import net.darties.minescape.block.ModBlocks;
import net.darties.minescape.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RAW_TIN_BLOCK);
        addDrop(ModBlocks.RAW_MITHRIL_BLOCK);
        addDrop(ModBlocks.RAW_ADAMANTITE_BLOCK);
        addDrop(ModBlocks.RAW_RUNITE_BLOCK);
        addDrop(ModBlocks.TIN_BLOCK);
        addDrop(ModBlocks.BRONZE_BLOCK);
        addDrop(ModBlocks.BLACK_BLOCK);
        addDrop(ModBlocks.MITHRIL_BLOCK);
        addDrop(ModBlocks.ADAMANTITE_BLOCK);
        addDrop(ModBlocks.RUNITE_BLOCK);
        addDrop(ModBlocks.DRAGON_BLOCK);

        addDrop(ModBlocks.TIN_ORE, oreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.MITHRIL_ORE, oreDrops(ModBlocks.MITHRIL_ORE, ModItems.RAW_MITHRIL));
        addDrop(ModBlocks.DEEPSLATE_MITHRIL_ORE, oreDrops(ModBlocks.DEEPSLATE_MITHRIL_ORE, ModItems.RAW_MITHRIL));
        addDrop(ModBlocks.ADAMANTITE_ORE, oreDrops(ModBlocks.ADAMANTITE_ORE, ModItems.RAW_ADAMANTITE));
        addDrop(ModBlocks.DEEPSLATE_ADAMANTITE_ORE, oreDrops(ModBlocks.DEEPSLATE_ADAMANTITE_ORE, ModItems.RAW_ADAMANTITE));
        addDrop(ModBlocks.NETHER_ADAMANTITE_ORE, oreDrops(ModBlocks.NETHER_ADAMANTITE_ORE, ModItems.RAW_ADAMANTITE));
        addDrop(ModBlocks.RUNITE_ORE, oreDrops(ModBlocks.RUNITE_ORE, ModItems.RAW_RUNITE));
        addDrop(ModBlocks.DEEPSLATE_RUNITE_ORE, oreDrops(ModBlocks.DEEPSLATE_RUNITE_ORE, ModItems.RAW_RUNITE));
        addDrop(ModBlocks.NETHER_RUNITE_ORE, oreDrops(ModBlocks.NETHER_RUNITE_ORE, ModItems.RAW_RUNITE));
    }
}
