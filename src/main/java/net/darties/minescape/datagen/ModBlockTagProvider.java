package net.darties.minescape.datagen;

import net.darties.minescape.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE)
                .add(ModBlocks.ADAMANTITE_ORE)
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE)
                .add(ModBlocks.NETHER_ADAMANTITE_ORE)
                .add(ModBlocks.RUNITE_ORE)
                .add(ModBlocks.DEEPSLATE_RUNITE_ORE)
                .add(ModBlocks.NETHER_RUNITE_ORE)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.RAW_MITHRIL_BLOCK)
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK)
                .add(ModBlocks.RAW_RUNITE_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.BRONZE_BLOCK)
                .add(ModBlocks.BLACK_BLOCK)
                .add(ModBlocks.MITHRIL_BLOCK)
                .add(ModBlocks.ADAMANTITE_BLOCK)
                .add(ModBlocks.RUNITE_BLOCK)
                .add(ModBlocks.DRAGON_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.RAW_MITHRIL_BLOCK)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.BRONZE_BLOCK)
                .add(ModBlocks.BLACK_BLOCK)
                .add(ModBlocks.MITHRIL_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ADAMANTITE_ORE)
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE)
                .add(ModBlocks.NETHER_ADAMANTITE_ORE)
                .add(ModBlocks.RUNITE_ORE)
                .add(ModBlocks.DEEPSLATE_RUNITE_ORE)
                .add(ModBlocks.NETHER_RUNITE_ORE)
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK)
                .add(ModBlocks.RAW_RUNITE_BLOCK)
                .add(ModBlocks.ADAMANTITE_BLOCK)
                .add(ModBlocks.RUNITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DRAGON_BLOCK);
    }
}
