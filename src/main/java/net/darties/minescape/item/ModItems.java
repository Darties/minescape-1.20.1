package net.darties.minescape.item;

import net.darties.minescape.MineScape;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Raw ingredients and metals
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item (new FabricItemSettings()));
    public static final Item BRONZE_ALLOY = registerItem("bronze_alloy", new Item (new FabricItemSettings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item (new FabricItemSettings()));
    public static final Item BLACK_INGOT =  registerItem("black_ingot", new Item (new FabricItemSettings()));
    public static final Item RAW_MITHRIL = registerItem("raw_mithril", new Item(new FabricItemSettings()));
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ADAMANTITE = registerItem("raw_adamantite", new Item(new FabricItemSettings()));
    public static final Item ADAMANTITE_INGOT = registerItem("adamantite_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_RUNITE = registerItem("raw_runite", new Item(new FabricItemSettings()));
    public static final Item RUNITE_INGOT = registerItem("runite_ingot", new Item(new FabricItemSettings()));
    public static final Item DRAGON_METAL_LUMP =  registerItem("dragon_metal_lump", new Item (new FabricItemSettings()));
    public static final Item DRAGON_INGOT =  registerItem("dragon_ingot", new Item (new FabricItemSettings()));

    // Tools
    // Formulas for in-game stats:
    // Attack Damage = 1 + attackDamage + ToolMaterial.attackDamage
    // Attack Speed = 1 + attackSpeed
    public static final Item BRONZE_SWORD = registerItem("bronze_sword", new SwordItem(ModToolMaterial.BRONZE,
            2, -2.4F, new FabricItemSettings()));
    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe", new PickaxeItem(ModToolMaterial.BRONZE,
            1, -2.8F, new FabricItemSettings()));
    public static final Item BRONZE_AXE = registerItem("bronze_axe", new AxeItem(ModToolMaterial.BRONZE,
            4.0F, -3.1F, new FabricItemSettings()));
    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel", new ShovelItem(ModToolMaterial.BRONZE,
            0, -3.0F, new FabricItemSettings()));
    public static final Item BRONZE_HOE = registerItem("bronze_hoe", new HoeItem(ModToolMaterial.BRONZE,
            0, -2.9F, new FabricItemSettings()));
    public static final Item BLACK_SWORD = registerItem("black_sword", new SwordItem(ModToolMaterial.BLACK,
            2, -2.4F, new FabricItemSettings()));
    public static final Item BLACK_PICKAXE = registerItem("black_pickaxe", new PickaxeItem(ModToolMaterial.BLACK,
            1, -2.8F, new FabricItemSettings()));
    public static final Item BLACK_AXE = registerItem("black_axe", new AxeItem(ModToolMaterial.BLACK,
            4.0F, -3.1F, new FabricItemSettings()));
    public static final Item BLACK_SHOVEL = registerItem("black_shovel", new ShovelItem(ModToolMaterial.BLACK,
            0, -3.0F, new FabricItemSettings()));
    public static final Item BLACK_HOE = registerItem("black_hoe", new HoeItem(ModToolMaterial.BLACK,
            0, -3.0F, new FabricItemSettings()));
    public static final Item MITHRIL_SWORD = registerItem("mithril_sword", new SwordItem(ModToolMaterial.MITHRIL,
            2, -2.4F, new FabricItemSettings()));
    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe", new PickaxeItem(ModToolMaterial.MITHRIL,
            1, -2.8F, new FabricItemSettings()));
    public static final Item MITHRIL_AXE = registerItem("mithril_axe", new AxeItem(ModToolMaterial.MITHRIL,
            4.0F, -3.1F, new FabricItemSettings()));
    public static final Item MITHRIL_SHOVEL = registerItem("mithril_shovel", new ShovelItem(ModToolMaterial.MITHRIL,
            1.5F, -3.0F, new FabricItemSettings()));
    public static final Item MITHRIL_HOE = registerItem("mithril_hoe", new HoeItem(ModToolMaterial.MITHRIL,
            0, -3.0F, new FabricItemSettings()));
    public static final Item ADAMANTITE_SWORD = registerItem("adamantite_sword", new SwordItem(ModToolMaterial.ADAMANTITE,
            3, -2.4F, new FabricItemSettings()));
    public static final Item ADAMANTITE_PICKAXE = registerItem("adamantite_pickaxe", new PickaxeItem(ModToolMaterial.ADAMANTITE,
            2, -2.8F, new FabricItemSettings()));
    public static final Item ADAMANTITE_AXE = registerItem("adamantite_axe", new AxeItem(ModToolMaterial.ADAMANTITE,
            5.0F, -3.0F, new FabricItemSettings()));
    public static final Item ADAMANTITE_SHOVEL = registerItem("adamantite_shovel", new ShovelItem(ModToolMaterial.ADAMANTITE,
            1.5F, -3.0F, new FabricItemSettings()));
    public static final Item ADAMANTITE_HOE = registerItem("adamantite_hoe", new HoeItem(ModToolMaterial.ADAMANTITE,
            1, -3.0F, new FabricItemSettings()));
    public static final Item RUNITE_SWORD = registerItem("runite_sword", new SwordItem(ModToolMaterial.RUNITE,
            4, -2.4F, new FabricItemSettings()));
    public static final Item RUNITE_PICKAXE = registerItem("runite_pickaxe", new PickaxeItem(ModToolMaterial.RUNITE,
            2, -2.8F, new FabricItemSettings()));
    public static final Item RUNITE_AXE = registerItem("runite_axe", new AxeItem(ModToolMaterial.RUNITE,
            6.0F, -3.0F, new FabricItemSettings()));
    public static final Item RUNITE_SHOVEL = registerItem("runite_shovel", new ShovelItem(ModToolMaterial.RUNITE,
            1.5F, -3.0F, new FabricItemSettings()));
    public static final Item RUNITE_HOE = registerItem("runite_hoe", new HoeItem(ModToolMaterial.RUNITE,
            2, -2.5F, new FabricItemSettings()));
    public static final Item DRAGON_SWORD = registerItem("dragon_sword", new SwordItem(ModToolMaterial.DRAGON,
            4, -2.4F, new FabricItemSettings()));
    public static final Item DRAGON_PICKAXE = registerItem("dragon_pickaxe", new PickaxeItem(ModToolMaterial.DRAGON,
            2, -2.8F, new FabricItemSettings()));
    public static final Item DRAGON_AXE = registerItem("dragon_axe", new AxeItem(ModToolMaterial.DRAGON,
            6.0F, -3.0F, new FabricItemSettings()));
    public static final Item DRAGON_SHOVEL = registerItem("dragon_shovel", new ShovelItem(ModToolMaterial.DRAGON,
            0, -3.0F, new FabricItemSettings()));
    public static final Item DRAGON_HOE = registerItem("dragon_hoe", new HoeItem(ModToolMaterial.DRAGON,
            0, -2.9F, new FabricItemSettings()));


    // Armor
    public static final Item BRONZE_HELMET = registerItem("bronze_helmet",
            new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate",
            new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings",
            new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BRONZE_BOOTS = registerItem("bronze_boots",
            new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item BLACK_HELMET = registerItem("black_helmet",
            new ArmorItem(ModArmorMaterials.BLACK, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLACK_CHESTPLATE = registerItem("black_chestplate",
            new ArmorItem(ModArmorMaterials.BLACK, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BLACK_LEGGINGS = registerItem("black_leggings",
            new ArmorItem(ModArmorMaterials.BLACK, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BLACK_BOOTS = registerItem("black_boots",
            new ArmorItem(ModArmorMaterials.BLACK, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item MITHRIL_HELMET = registerItem("mithril_helmet",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item MITHRIL_CHESTPLATE = registerItem("mithril_chestplate",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item MITHRIL_LEGGINGS = registerItem("mithril_leggings",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item MITHRIL_BOOTS = registerItem("mithril_boots",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item ADAMANTITE_HELMET = registerItem("adamantite_helmet",
            new ArmorItem(ModArmorMaterials.ADAMANTITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ADAMANTITE_CHESTPLATE = registerItem("adamantite_chestplate",
            new ArmorItem(ModArmorMaterials.ADAMANTITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ADAMANTITE_LEGGINGS = registerItem("adamantite_leggings",
            new ArmorItem(ModArmorMaterials.ADAMANTITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ADAMANTITE_BOOTS = registerItem("adamantite_boots",
            new ArmorItem(ModArmorMaterials.ADAMANTITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item RUNITE_HELMET = registerItem("runite_helmet",
            new ArmorItem(ModArmorMaterials.RUNITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUNITE_CHESTPLATE = registerItem("runite_chestplate",
            new ArmorItem(ModArmorMaterials.RUNITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUNITE_LEGGINGS = registerItem("runite_leggings",
            new ArmorItem(ModArmorMaterials.RUNITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUNITE_BOOTS = registerItem("runite_boots",
            new ArmorItem(ModArmorMaterials.RUNITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item DRAGON_HELMET = registerItem("dragon_helmet",
            new ArmorItem(ModArmorMaterials.DRAGON, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DRAGON_CHESTPLATE = registerItem("dragon_chestplate",
            new ArmorItem(ModArmorMaterials.DRAGON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DRAGON_LEGGINGS = registerItem("dragon_leggings",
            new ArmorItem(ModArmorMaterials.DRAGON, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DRAGON_BOOTS = registerItem("dragon_boots",
            new ArmorItem(ModArmorMaterials.DRAGON, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,new Identifier(MineScape.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MineScape.LOGGER.info("Registering items for " + MineScape.MOD_ID);
    }
}
