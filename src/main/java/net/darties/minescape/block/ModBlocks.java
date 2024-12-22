package net.darties.minescape.block;

import net.darties.minescape.MineScape;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RAW_MITHRIL_BLOCK = registerBlock("raw_mithril_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 3.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RAW_ADAMANTITE_BLOCK = registerBlock("raw_adamantite_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RAW_RUNITE_BLOCK = registerBlock("raw_runite_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(AbstractBlock.Settings.create().strength(3.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block BLACK_BLOCK = registerBlock("black_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block ADAMANTITE_BLOCK = registerBlock("adamantite_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block RUNITE_BLOCK = registerBlock("runite_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 6.0F).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block DRAGON_BLOCK = registerBlock("dragon_block",
            new Block(AbstractBlock.Settings.create().strength(50.0F, 1200.0F).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block TIN_ORE = registerBlock("tin_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.create().strength(3.0F,3.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.create().strength(3.0F,3.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_MITHRIL_ORE = registerBlock("deepslate_mithril_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.create().strength(4.5F,3.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block ADAMANTITE_ORE = registerBlock("adamantite_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.create().strength(3.0F,3.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_ADAMANTITE_ORE = registerBlock("deepslate_adamantite_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.create().strength(4.5F,3.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block NETHER_ADAMANTITE_ORE = registerBlock("nether_adamantite_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.create().strength(3.0F,3.0F).requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));
    public static final Block RUNITE_ORE = registerBlock("runite_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.create().strength(3.0F,3.0F).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_RUNITE_ORE = registerBlock("deepslate_runite_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.create().strength(4.5F,3.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block NETHER_RUNITE_ORE = registerBlock("nether_runite_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.create().strength(3.0F,3.0F).requiresTool().sounds(BlockSoundGroup.NETHER_ORE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem( name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MineScape.MOD_ID, name), block);
    }

    private static void registerBlockItem (String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MineScape.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void  registerModBlocks() {
        MineScape.LOGGER.info("Registering blocks for " + MineScape.MOD_ID);
    }

}
