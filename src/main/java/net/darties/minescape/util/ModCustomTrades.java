package net.darties.minescape.util;

import net.darties.minescape.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {

    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BRONZE_INGOT, 6),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.05F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.BRONZE_HELMET, 1),
                            12, 1, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(ModItems.BRONZE_CHESTPLATE, 1),
                            12, 1, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.BRONZE_LEGGINGS, 1),
                            12, 1, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.BRONZE_BOOTS, 1),
                            12, 1, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MITHRIL_INGOT, 5),
                            new ItemStack(Items.EMERALD, 1),
                            12, 20, 0.05F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.MITHRIL_HELMET, 1),
                            12, 10, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(ModItems.MITHRIL_CHESTPLATE, 1),
                            12, 10, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.MITHRIL_LEGGINGS, 1),
                            12, 10, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.MITHRIL_BOOTS, 1),
                            12, 10, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_INGOT, 4),
                            new ItemStack(Items.EMERALD, 1),
                            12, 15, 0.05F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.ADAMANTITE_HELMET, 1),
                            12, 12, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(ModItems.ADAMANTITE_CHESTPLATE, 1),
                            12, 12, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.ADAMANTITE_LEGGINGS, 1),
                            12, 12, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.ADAMANTITE_BOOTS, 1),
                            12, 12, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(ModItems.RUNITE_INGOT, 1),
                            12, 30, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BRONZE_INGOT, 6),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.05F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.BRONZE_PICKAXE, 1),
                            12, 5, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.BRONZE_AXE, 1),
                            12, 5, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.BRONZE_SHOVEL, 1),
                            12, 5, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.BRONZE_HOE, 1),
                            12, 5, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MITHRIL_INGOT, 5),
                            new ItemStack(Items.EMERALD, 1),
                            12, 20, 0.05F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.MITHRIL_PICKAXE, 1),
                            12, 10, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.MITHRIL_AXE, 1),
                            12, 10, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.MITHRIL_SHOVEL, 1),
                            12, 10, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.MITHRIL_HOE, 1),
                            12, 10, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_INGOT, 4),
                            new ItemStack(Items.EMERALD, 1),
                            12, 30, 0.05F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.ADAMANTITE_PICKAXE, 1),
                            12,15 , 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.ADAMANTITE_AXE, 1),
                            12, 15, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.ADAMANTITE_SHOVEL, 1),
                            12, 15, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.ADAMANTITE_HOE, 1),
                            12, 15, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(ModItems.RUNITE_INGOT, 1),
                            12, 30, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BRONZE_INGOT, 6),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.05F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BRONZE_SWORD, 6),
                            new ItemStack(Items.EMERALD, 1),
                            12, 1, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BRONZE_INGOT, 6),
                            new ItemStack(Items.EMERALD, 1),
                            12, 2, 0.05F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.BRONZE_SWORD, 1),
                            12, 1, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.MITHRIL_INGOT, 5),
                            new ItemStack(Items.EMERALD, 1),
                            12, 10, 0.05F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.MITHRIL_SWORD, 1),
                            12, 5, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.ADAMANTITE_INGOT, 4),
                            new ItemStack(Items.EMERALD, 1),
                            12, 20, 0.05F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.ADAMANTITE_SWORD, 1),
                            12, 10, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(ModItems.RUNITE_INGOT, 1),
                            12, 15, 0.2F));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(ModItems.RUNITE_SWORD, 1),
                            12, 30, 0.2F));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(ModItems.RUNITE_AXE, 1),
                            12, 30, 0.2F));
                });
    }
}
