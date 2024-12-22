package net.darties.minescape.datagen;

import net.darties.minescape.block.ModBlocks;
import net.darties.minescape.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_MITHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ADAMANTITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUNITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BRONZE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHRIL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUNITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRAGON_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ADAMANTITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_ADAMANTITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUNITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUNITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUNITE_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_ALLOY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MITHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ADAMANTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUNITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGON_METAL_LUMP, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRAGON_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.BRONZE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLACK_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUNITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUNITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUNITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUNITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUNITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRAGON_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRONZE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRONZE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRONZE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BRONZE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BLACK_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MITHRIL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MITHRIL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MITHRIL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MITHRIL_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADAMANTITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADAMANTITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADAMANTITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ADAMANTITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUNITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUNITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUNITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUNITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DRAGON_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DRAGON_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DRAGON_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.DRAGON_BOOTS));

    }


}