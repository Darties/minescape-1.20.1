package net.darties.minescape.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.darties.minescape.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantRandomlyLootFunction;
import net.minecraft.loot.function.EnchantWithLevelsLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {

    private static final Identifier ABANDONED_MINESHAFT_ID =
            new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier ANCIENT_CITY_ID =
            new Identifier("minecraft", "chests/ancient_city");
    private static final Identifier BASTION_BRIDGE_ID =
            new Identifier("minecraft", "chests/bastion_bridge");
    private static final Identifier BASTION_HOGLIN_STABLE_ID =
            new Identifier("minecraft", "chests/bastion_hoglin_stable");
    private static final Identifier BASTION_OTHER_ID =
            new Identifier("minecraft", "chests/bastion_other");
    private static final Identifier BASTION_TREASURE_ID =
            new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier BURIED_TREASURE_ID =
            new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier DESERT_PYRAMID_ID =
            new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier END_CITY_ID =
            new Identifier("minecraft", "chests/end_city");
    private static final Identifier JUNGLE_TEMPLE_ID =
            new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier NETHER_BRIDGE_ID =
            new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier PILLAGER_OUTPOST_ID =
            new Identifier("minecraft", "chests/pillager_outpost");
    private static final Identifier SHIPWRECK_SUPPLY_ID =
            new Identifier("minecraft", "chests/shipwreck_supply");
    private static final Identifier SHIPWRECK_TRESURE_ID =
            new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier SIMPLE_DUNGEON_ID =
            new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier STRONGHOLD_CORRIDOR_ID =
            new Identifier("minecraft", "chests/stronghold_corridor");
    private static final Identifier STRONGHOLD_CROSSING_ID =
            new Identifier("minecraft", "chests/stronghold_crossing");
    private static final Identifier UNDERWATER_RUIN_BIG_ID =
            new Identifier("minecraft", "chests/underwater_ruin_big");
    private static final Identifier UNDERWATER_RUIN_SMALL_ID =
            new Identifier("minecraft", "chests/underwater_ruin_small");
    private static final Identifier WOODLAND_MANSION_ID =
            new Identifier("minecraft", "chests/woodland_mansion");
    private static final Identifier VILLAGER_ARMORER_ID =
            new Identifier("minecraft", "chests/village/village_armorer");
    private static final Identifier VILLAGER_TOOLSMITH_ID =
            new Identifier("minecraft", "chests/village/village_toolsmith");
    private static final Identifier VILLAGER_WEAPONSMITH_ID =
            new Identifier("minecraft", "chests/village/village_weaponsmith");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            // Abandoned Mineshaft -------------------------------------------------------------------------------------
            if(ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.145F))
                        .with(ItemEntry.builder(ModItems.MITHRIL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(ABANDONED_MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01F))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 3.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // // Ancient City -----------------------------------------------------------------------------------------
            if(ANCIENT_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(3))
                        .conditionally(RandomChanceLootCondition.builder(0.12F))
                        .with(ItemEntry.builder(ModItems.BLACK_HELMET))
                        .with(ItemEntry.builder(ModItems.BLACK_CHESTPLATE))
                        .with(ItemEntry.builder(ModItems.BLACK_LEGGINGS))
                        .with(ItemEntry.builder(ModItems.BLACK_BOOTS))
                        .with(ItemEntry.builder(ModItems.BLACK_SWORD))
                        .with(ItemEntry.builder(ModItems.BLACK_PICKAXE))
                        .with(ItemEntry.builder(ModItems.BLACK_AXE))
                        .with(ItemEntry.builder(ModItems.BLACK_SHOVEL))
                        .with(ItemEntry.builder(ModItems.BLACK_HOE))
                        .apply(EnchantRandomlyLootFunction.builder())
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_SWORD))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_PICKAXE))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_AXE))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_SHOVEL))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_HOE))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_HELMET))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_CHESTPLATE))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_LEGGINGS))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_BOOTS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(ANCIENT_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.232F))
                        .with(ItemEntry.builder(ModItems.BLACK_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 5.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(ANCIENT_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.152F))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // Bastion -------------------------------------------------------------------------------------------------
            if(BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.112F))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05F))
                        .with(ItemEntry.builder(ModItems.RUNITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_HOGLIN_STABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12F))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_SWORD))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_PICKAXE))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_AXE))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_SHOVEL))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_HOE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_HOGLIN_STABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.232F))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_HOGLIN_STABLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1F))
                        .with(ItemEntry.builder(ModItems.RUNITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 3.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_OTHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.232F))
                        .with(ItemEntry.builder(ModItems.BLACK_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_OTHER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(4))
                        .conditionally(RandomChanceLootCondition.builder(0.15F))
                        .with(ItemEntry.builder(ModItems.BLACK_SWORD))
                        .with(ItemEntry.builder(ModItems.BLACK_PICKAXE))
                        .with(ItemEntry.builder(ModItems.BLACK_AXE))
                        .with(ItemEntry.builder(ModItems.BLACK_SHOVEL))
                        .with(ItemEntry.builder(ModItems.BLACK_HOE))
                        .with(ItemEntry.builder(ModItems.BLACK_HOE))
                        .with(ItemEntry.builder(ModItems.BLACK_HELMET))
                        .with(ItemEntry.builder(ModItems.BLACK_CHESTPLATE))
                        .with(ItemEntry.builder(ModItems.BLACK_LEGGINGS))
                        .with(ItemEntry.builder(ModItems.BLACK_BOOTS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.337F))
                        .with(ItemEntry.builder(ModItems.RUNITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BASTION_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(2))
                        .conditionally(RandomChanceLootCondition.builder(0.228F))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_HELMET))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_CHESTPLATE))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_LEGGINGS))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_BOOTS))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_SWORD))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_PICKAXE))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_AXE))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_SHOVEL))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_HOE))
                        .apply(EnchantRandomlyLootFunction.builder())
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // Buried Treasure -----------------------------------------------------------------------------------------
            if(BURIED_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.88F))
                        .with(ItemEntry.builder(ModItems.MITHRIL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BURIED_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(3))
                        .conditionally(RandomChanceLootCondition.builder(.2F))
                        .with(ItemEntry.builder(ModItems.MITHRIL_HELMET))
                        .with(ItemEntry.builder(ModItems.MITHRIL_CHESTPLATE))
                        .with(ItemEntry.builder(ModItems.MITHRIL_LEGGINGS))
                        .with(ItemEntry.builder(ModItems.MITHRIL_BOOTS))
                        .with(ItemEntry.builder(ModItems.MITHRIL_SWORD))
                        .with(ItemEntry.builder(ModItems.MITHRIL_PICKAXE))
                        .with(ItemEntry.builder(ModItems.MITHRIL_AXE))
                        .with(ItemEntry.builder(ModItems.MITHRIL_SHOVEL))
                        .with(ItemEntry.builder(ModItems.MITHRIL_HOE))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(5.0F, 10.0F)))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // Desert Pyramid ------------------------------------------------------------------------------------------
            if(DESERT_PYRAMID_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02F))
                        .with(ItemEntry.builder(ModItems.RUNITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 3.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(DESERT_PYRAMID_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.123F))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 5.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // End City ------------------------------------------------------------------------------------------------
            if(END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.133F))
                        .with(ItemEntry.builder(ModItems.RUNITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(3))
                        .conditionally(RandomChanceLootCondition.builder(0.067F))
                        .with(ItemEntry.builder(ModItems.RUNITE_HELMET))
                        .with(ItemEntry.builder(ModItems.RUNITE_CHESTPLATE))
                        .with(ItemEntry.builder(ModItems.RUNITE_LEGGINGS))
                        .with(ItemEntry.builder(ModItems.RUNITE_BOOTS))
                        .with(ItemEntry.builder(ModItems.RUNITE_SWORD))
                        .with(ItemEntry.builder(ModItems.RUNITE_PICKAXE))
                        .with(ItemEntry.builder(ModItems.RUNITE_AXE))
                        .with(ItemEntry.builder(ModItems.RUNITE_SHOVEL))
                        .with(ItemEntry.builder(ModItems.RUNITE_HOE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // Jungle Temple -------------------------------------------------------------------------------------------
            if(JUNGLE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25F))
                        .with(ItemEntry.builder(ModItems.MITHRIL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(JUNGLE_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.17F))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // Nether Bridge -------------------------------------------------------------------------------------------
            if(NETHER_BRIDGE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2F))
                        .with(ItemEntry.builder(ModItems.BLACK_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // Pillager Outpost ----------------------------------------------------------------------------------------
            if(PILLAGER_OUTPOST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5F))
                        .with(ItemEntry.builder(ModItems.BRONZE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 4.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(PILLAGER_OUTPOST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2F))
                        .with(ItemEntry.builder(ModItems.BLACK_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 3.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // Shipwreck Supply ----------------------------------------------------------------------------------------
            if(SHIPWRECK_SUPPLY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25F))
                        .with(ItemEntry.builder(ModItems.BRONZE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 5.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(SHIPWRECK_SUPPLY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(3))
                        .conditionally(RandomChanceLootCondition.builder(0.18F))
                        .with(ItemEntry.builder(ModItems.BRONZE_HELMET))
                        .with(ItemEntry.builder(ModItems.BRONZE_CHESTPLATE))
                        .with(ItemEntry.builder(ModItems.BRONZE_LEGGINGS))
                        .with(ItemEntry.builder(ModItems.BRONZE_BOOTS))
                        .with(ItemEntry.builder(ModItems.BRONZE_SWORD))
                        .with(ItemEntry.builder(ModItems.BRONZE_PICKAXE))
                        .with(ItemEntry.builder(ModItems.BRONZE_AXE))
                        .with(ItemEntry.builder(ModItems.BRONZE_SHOVEL))
                        .with(ItemEntry.builder(ModItems.BRONZE_HOE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // Shipwreck Treasure --------------------------------------------------------------------------------------
            if(SHIPWRECK_TRESURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25F))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 3.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // Simple Dungeon ------------------------------------------------------------------------------------------
            if(SIMPLE_DUNGEON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15F))
                        .with(ItemEntry.builder(ModItems.MITHRIL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // Stronghold ----------------------------------------------------------------------------------------------
            if(STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12F))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 5.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(STRONGHOLD_CORRIDOR_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(3))
                        .conditionally(RandomChanceLootCondition.builder(0.052F))
                        .with(ItemEntry.builder(ModItems.MITHRIL_HELMET))
                        .with(ItemEntry.builder(ModItems.MITHRIL_CHESTPLATE))
                        .with(ItemEntry.builder(ModItems.MITHRIL_LEGGINGS))
                        .with(ItemEntry.builder(ModItems.MITHRIL_BOOTS))
                        .with(ItemEntry.builder(ModItems.MITHRIL_SWORD))
                        .with(ItemEntry.builder(ModItems.MITHRIL_PICKAXE))
                        .with(ItemEntry.builder(ModItems.MITHRIL_AXE))
                        .with(ItemEntry.builder(ModItems.MITHRIL_SHOVEL))
                        .with(ItemEntry.builder(ModItems.MITHRIL_HOE))
                        .apply(EnchantRandomlyLootFunction.builder())
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(STRONGHOLD_CROSSING_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.186F))
                        .with(ItemEntry.builder(ModItems.MITHRIL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 5.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(STRONGHOLD_CROSSING_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.12F))
                        .with(ItemEntry.builder(ModItems.ADAMANTITE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // Underwater Ruins ----------------------------------------------------------------------------------------
            if(UNDERWATER_RUIN_BIG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.22F))
                        .with(ItemEntry.builder(ModItems.BRONZE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(UNDERWATER_RUIN_BIG_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15F))
                        .with(ItemEntry.builder(ModItems.MITHRIL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(UNDERWATER_RUIN_SMALL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.22F))
                        .with(ItemEntry.builder(ModItems.BRONZE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(UNDERWATER_RUIN_SMALL_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15F))
                        .with(ItemEntry.builder(ModItems.MITHRIL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            // Woodland Mansion ----------------------------------------------------------------------------------------
            if(WOODLAND_MANSION_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.28F))
                        .with(ItemEntry.builder(ModItems.BRONZE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(WOODLAND_MANSION_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(4))
                        .conditionally(RandomChanceLootCondition.builder(0.18F))
                        .with(ItemEntry.builder(ModItems.BRONZE_HELMET))
                        .with(ItemEntry.builder(ModItems.BRONZE_CHESTPLATE))
                        .with(ItemEntry.builder(ModItems.BRONZE_LEGGINGS))
                        .with(ItemEntry.builder(ModItems.BRONZE_BOOTS))
                        .with(ItemEntry.builder(ModItems.BRONZE_SWORD))
                        .with(ItemEntry.builder(ModItems.BRONZE_PICKAXE))
                        .with(ItemEntry.builder(ModItems.BRONZE_AXE))
                        .with(ItemEntry.builder(ModItems.BRONZE_SHOVEL))
                        .with(ItemEntry.builder(ModItems.BRONZE_HOE))
                        .apply(EnchantWithLevelsLootFunction.builder(UniformLootNumberProvider.create(10.0F, 20.0F)))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(WOODLAND_MANSION_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15F))
                        .with(ItemEntry.builder(ModItems.MITHRIL_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 4.0F)).build());

                tableBuilder.pool(poolBuilder.build());

            }
            if(WOODLAND_MANSION_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25F))
                        .with(ItemEntry.builder(ModItems.BLACK_AXE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());

            }
            // Village -------------------------------------------------------------------------------------------------
            if(VILLAGER_ARMORER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.9F))
                        .with(ItemEntry.builder(ModItems.BRONZE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(VILLAGER_ARMORER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(2))
                        .conditionally(RandomChanceLootCondition.builder(0.5F))
                        .with(ItemEntry.builder(ModItems.BRONZE_HELMET))
                        .with(ItemEntry.builder(ModItems.BRONZE_CHESTPLATE))
                        .with(ItemEntry.builder(ModItems.BRONZE_LEGGINGS))
                        .with(ItemEntry.builder(ModItems.BRONZE_BOOTS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(VILLAGER_TOOLSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.9F))
                        .with(ItemEntry.builder(ModItems.BRONZE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(VILLAGER_TOOLSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(2))
                        .conditionally(RandomChanceLootCondition.builder(0.5F))
                        .with(ItemEntry.builder(ModItems.BRONZE_PICKAXE))
                        .with(ItemEntry.builder(ModItems.BRONZE_AXE))
                        .with(ItemEntry.builder(ModItems.BRONZE_SHOVEL))
                        .with(ItemEntry.builder(ModItems.BRONZE_HOE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(VILLAGER_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.9F))
                        .with(ItemEntry.builder(ModItems.BRONZE_INGOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 6.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(VILLAGER_WEAPONSMITH_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.9F))
                        .with(ItemEntry.builder(ModItems.BRONZE_SWORD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)).build());

                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}