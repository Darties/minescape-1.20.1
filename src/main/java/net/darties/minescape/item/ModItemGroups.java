package net.darties.minescape.item;


import net.darties.minescape.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.darties.minescape.MineScape;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MINESCAPE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MineScape.MOD_ID,"minescape"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.minescape"))
                    .icon(() -> new ItemStack(ModItems.RUNITE_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.RAW_MITHRIL_BLOCK);
                        entries.add(ModBlocks.RAW_ADAMANTITE_BLOCK);
                        entries.add(ModBlocks.RAW_RUNITE_BLOCK);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.MITHRIL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MITHRIL_ORE);
                        entries.add(ModBlocks.ADAMANTITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE);
                        entries.add(ModBlocks.NETHER_ADAMANTITE_ORE);
                        entries.add(ModBlocks.RUNITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUNITE_ORE);
                        entries.add(ModBlocks.NETHER_RUNITE_ORE);

                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModBlocks.BLACK_BLOCK);
                        entries.add(ModBlocks.MITHRIL_BLOCK);
                        entries.add(ModBlocks.ADAMANTITE_BLOCK);
                        entries.add(ModBlocks.RUNITE_BLOCK);
                        entries.add(ModBlocks.DRAGON_BLOCK);

                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.BRONZE_ALLOY);
                        entries.add(ModItems.RAW_MITHRIL);
                        entries.add(ModItems.RAW_ADAMANTITE);
                        entries.add(ModItems.RAW_RUNITE);
                        entries.add(ModItems.DRAGON_METAL_LUMP);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModItems.BLACK_INGOT);
                        entries.add(ModItems.MITHRIL_INGOT);
                        entries.add(ModItems.ADAMANTITE_INGOT);
                        entries.add(ModItems.RUNITE_INGOT);
                        entries.add(ModItems.DRAGON_INGOT);

                        entries.add(ModItems.BRONZE_SWORD);
                        entries.add(ModItems.BRONZE_PICKAXE);
                        entries.add(ModItems.BRONZE_AXE);
                        entries.add(ModItems.BRONZE_SHOVEL);
                        entries.add(ModItems.BRONZE_HOE);
                        entries.add(ModItems.BLACK_SWORD);
                        entries.add(ModItems.BLACK_PICKAXE);
                        entries.add(ModItems.BLACK_AXE);
                        entries.add(ModItems.BLACK_SHOVEL);
                        entries.add(ModItems.BLACK_HOE);
                        entries.add(ModItems.MITHRIL_SWORD);
                        entries.add(ModItems.MITHRIL_PICKAXE);
                        entries.add(ModItems.MITHRIL_AXE);
                        entries.add(ModItems.MITHRIL_SHOVEL);
                        entries.add(ModItems.MITHRIL_HOE);
                        entries.add(ModItems.ADAMANTITE_SWORD);
                        entries.add(ModItems.ADAMANTITE_PICKAXE);
                        entries.add(ModItems.ADAMANTITE_AXE);
                        entries.add(ModItems.ADAMANTITE_SHOVEL);
                        entries.add(ModItems.ADAMANTITE_HOE);
                        entries.add(ModItems.RUNITE_SWORD);
                        entries.add(ModItems.RUNITE_PICKAXE);
                        entries.add(ModItems.RUNITE_AXE);
                        entries.add(ModItems.RUNITE_SHOVEL);
                        entries.add(ModItems.RUNITE_HOE);
                        entries.add(ModItems.DRAGON_SWORD);
                        entries.add(ModItems.DRAGON_PICKAXE);
                        entries.add(ModItems.DRAGON_AXE);
                        entries.add(ModItems.DRAGON_SHOVEL);
                        entries.add(ModItems.DRAGON_HOE);

                        entries.add(ModItems.BRONZE_HELMET);
                        entries.add(ModItems.BRONZE_CHESTPLATE);
                        entries.add(ModItems.BRONZE_LEGGINGS);
                        entries.add(ModItems.BRONZE_BOOTS);
                        entries.add(ModItems.BLACK_HELMET);
                        entries.add(ModItems.BLACK_CHESTPLATE);
                        entries.add(ModItems.BLACK_LEGGINGS);
                        entries.add(ModItems.BLACK_BOOTS);
                        entries.add(ModItems.MITHRIL_HELMET);
                        entries.add(ModItems.MITHRIL_CHESTPLATE);
                        entries.add(ModItems.MITHRIL_LEGGINGS);
                        entries.add(ModItems.MITHRIL_BOOTS);
                        entries.add(ModItems.ADAMANTITE_HELMET);
                        entries.add(ModItems.ADAMANTITE_CHESTPLATE);
                        entries.add(ModItems.ADAMANTITE_LEGGINGS);
                        entries.add(ModItems.ADAMANTITE_BOOTS);
                        entries.add(ModItems.RUNITE_HELMET);
                        entries.add(ModItems.RUNITE_CHESTPLATE);
                        entries.add(ModItems.RUNITE_LEGGINGS);
                        entries.add(ModItems.RUNITE_BOOTS);
                        entries.add(ModItems.DRAGON_HELMET);
                        entries.add(ModItems.DRAGON_CHESTPLATE);
                        entries.add(ModItems.DRAGON_LEGGINGS);
                        entries.add(ModItems.DRAGON_BOOTS);

                    }).build());

    public static void registerItemGroups() {
        MineScape.LOGGER.info("Registering item groups for " + MineScape.MOD_ID);
    }
}
