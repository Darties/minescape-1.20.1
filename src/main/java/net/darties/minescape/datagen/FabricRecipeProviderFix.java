package net.darties.minescape.datagen;

import net.minecraft.data.DataOutput;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public class FabricRecipeProviderFix extends RecipeProvider {

    public FabricRecipeProviderFix(DataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

    }

    public static void offerSmelting(
            Consumer<RecipeJsonProvider> exporter,
            List<ItemConvertible> inputs,
            RecipeCategory category,
            ItemConvertible output,
            float experience,
            int cookingTime,
            String group
    ) {
        offerMultipleOptions(exporter, RecipeSerializer.SMELTING, inputs, category, output, experience, cookingTime, group, "_from_smelting");
    }

    public static void offerBlasting(
            Consumer<RecipeJsonProvider> exporter,
            List<ItemConvertible> inputs,
            RecipeCategory category,
            ItemConvertible output,
            float experience,
            int cookingTime,
            String group
    ) {
        offerMultipleOptions(exporter, RecipeSerializer.BLASTING, inputs, category, output, experience, cookingTime, group, "_from_blasting");
    }

    public static void offerReversibleCompactingRecipes(
            Consumer<RecipeJsonProvider> exporter,
            RecipeCategory reverseCategory,
            ItemConvertible baseItem,
            RecipeCategory compactingCategory,
            ItemConvertible compactItem
    ) {
        offerReversibleCompactingRecipes(
                exporter, reverseCategory, baseItem, compactingCategory, compactItem, getRecipeName(compactItem), null, getRecipeName(baseItem), null
        );
    }

    public static void offerMultipleOptions(
            Consumer<RecipeJsonProvider> exporter,
            RecipeSerializer<? extends AbstractCookingRecipe> serializer,
            List<ItemConvertible> inputs,
            RecipeCategory category,
            ItemConvertible output,
            float experience,
            int cookingTime,
            String group,
            String method
    ) {
        for (ItemConvertible itemConvertible : inputs) {
            CookingRecipeJsonBuilder.create(Ingredient.ofItems(itemConvertible), category, output, experience, cookingTime, serializer)
                    .group(group)
                    .criterion(hasItem(itemConvertible), conditionsFromItem(itemConvertible))
                    .offerTo(exporter, "minescape:" + getItemPath(output) + method + "_" + getItemPath(itemConvertible));
        }
    }

    public static void offerReversibleCompactingRecipes(
            Consumer<RecipeJsonProvider> exporter,
            RecipeCategory reverseCategory,
            ItemConvertible baseItem,
            RecipeCategory compactingCategory,
            ItemConvertible compactItem,
            String compactingId,
            @Nullable String compactingGroup,
            String reverseId,
            @Nullable String reverseGroup
    ) {

        ShapelessRecipeJsonBuilder.create(reverseCategory, baseItem, 9)
                .input(compactItem)
                .group(reverseGroup)
                .criterion(hasItem(compactItem), conditionsFromItem(compactItem))
                .offerTo(exporter, new Identifier("minescape:" + reverseId));
        ShapedRecipeJsonBuilder.create(compactingCategory, compactItem)
                .input('#', baseItem)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(compactingGroup)
                .criterion(hasItem(baseItem), conditionsFromItem(baseItem))
                .offerTo(exporter, new Identifier("minescape:" + compactingId));

    }
}