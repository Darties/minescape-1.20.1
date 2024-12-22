package net.darties.minescape.datagen;

import net.darties.minescape.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(
                        ModItems.BRONZE_HELMET,
                        ModItems.BRONZE_CHESTPLATE,
                        ModItems.BRONZE_LEGGINGS,
                        ModItems.BRONZE_BOOTS,
                        ModItems.BLACK_HELMET,
                        ModItems.BLACK_CHESTPLATE,
                        ModItems.BLACK_LEGGINGS,
                        ModItems.BLACK_BOOTS,
                        ModItems.MITHRIL_HELMET,
                        ModItems.MITHRIL_CHESTPLATE,
                        ModItems.MITHRIL_LEGGINGS,
                        ModItems.MITHRIL_BOOTS,
                        ModItems.ADAMANTITE_HELMET,
                        ModItems.ADAMANTITE_CHESTPLATE,
                        ModItems.ADAMANTITE_LEGGINGS,
                        ModItems.ADAMANTITE_BOOTS,
                        ModItems.RUNITE_HELMET,
                        ModItems.RUNITE_CHESTPLATE,
                        ModItems.RUNITE_LEGGINGS,
                        ModItems.RUNITE_BOOTS,
                        ModItems.DRAGON_HELMET,
                        ModItems.DRAGON_CHESTPLATE,
                        ModItems.DRAGON_LEGGINGS,
                        ModItems.DRAGON_BOOTS);

    }
}
