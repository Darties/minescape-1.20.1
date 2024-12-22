package net.darties.minescape.datagen;

import net.darties.minescape.block.ModBlocks;
import net.darties.minescape.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static final List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE);
    private static final List<ItemConvertible> BRONZE_SMELTABLES = List.of(ModItems.BRONZE_ALLOY);
    private static final List<ItemConvertible> MITHRIL_SMELTABLES = List.of(ModItems.RAW_MITHRIL, ModBlocks.MITHRIL_ORE, ModBlocks.DEEPSLATE_MITHRIL_ORE);
    private static final List<ItemConvertible> ADAMANTITE_SMELTABLES = List.of(ModItems.RAW_ADAMANTITE, ModBlocks.ADAMANTITE_ORE, ModBlocks.DEEPSLATE_ADAMANTITE_ORE, ModBlocks.NETHER_ADAMANTITE_ORE);
    private static final List<ItemConvertible> RUNITE_SMELTABLES = List.of(ModItems.RAW_RUNITE, ModBlocks.RUNITE_ORE, ModBlocks.DEEPSLATE_RUNITE_ORE, ModBlocks.NETHER_RUNITE_ORE);
    private static final List<ItemConvertible> DRAGON_SMELTABLES = List.of(ModItems.DRAGON_METAL_LUMP);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    private static void SwordToolGenerator(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private static void PickaxeToolGenerator(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("###")
                .pattern(" X ")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private static void AxeToolGenerator(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("## ")
                .pattern("#X ")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private static void ShovelToolGenerator(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern(" # ")
                .pattern(" X ")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private static void HoeToolGenerator(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("## ")
                .pattern(" X ")
                .pattern(" X ")
                .input('X', Items.STICK)
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private static void HelmetArmorGenerator(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("XXX")
                .pattern("X X")
                .pattern("   ")
                .input('X', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private static void ChestplateArmorGenerator(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private static void LeggingsArmorGenerator(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private static void BootsArmorGenerator(Item input, Item output, Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("   ")
                .pattern("X X")
                .pattern("X X")
                .input('X', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }


    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {



        FabricRecipeProviderFix.offerSmelting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT,
                0.2F, 160, "tin_ingot");
        FabricRecipeProviderFix.offerBlasting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT,
                0.2F, 80, "tin_ingot");
        FabricRecipeProviderFix.offerSmelting(exporter, BRONZE_SMELTABLES, RecipeCategory.MISC, ModItems.BRONZE_ALLOY,
                0.3F, 200, "bronze_ingot");
        FabricRecipeProviderFix.offerBlasting(exporter, BRONZE_SMELTABLES, RecipeCategory.MISC, ModItems.BRONZE_ALLOY,
                0.3F, 100, "bronze_ingot");
        FabricRecipeProviderFix.offerSmelting(exporter, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_INGOT,
                0.6F, 200, "mithril_ingot");
        FabricRecipeProviderFix.offerBlasting(exporter, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_INGOT,
                0.6F, 100, "mithril_ingot");
        FabricRecipeProviderFix.offerSmelting(exporter, ADAMANTITE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT,
                1.3F, 200, "adamantite_ingot");
        FabricRecipeProviderFix.offerBlasting(exporter, ADAMANTITE_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT,
                1.3F, 100, "runite_ingot");
        FabricRecipeProviderFix.offerSmelting(exporter, RUNITE_SMELTABLES, RecipeCategory.MISC, ModItems.RUNITE_INGOT,
                1.7F, 200, "runite_ingot");
        FabricRecipeProviderFix.offerBlasting(exporter, RUNITE_SMELTABLES, RecipeCategory.MISC, ModItems.RUNITE_INGOT,
                1.7F, 100, "runite_ingot");
        FabricRecipeProviderFix.offerBlasting(exporter, DRAGON_SMELTABLES, RecipeCategory.MISC, ModItems.DRAGON_METAL_LUMP,
                4.0F, 350, "dragon_ingot");

        FabricRecipeProviderFix.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN, RecipeCategory.DECORATIONS, ModBlocks.RAW_TIN_BLOCK);
        FabricRecipeProviderFix.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TIN_BLOCK);
        FabricRecipeProviderFix.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BRONZE_BLOCK);
        FabricRecipeProviderFix.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLACK_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLACK_BLOCK);
        FabricRecipeProviderFix.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_MITHRIL, RecipeCategory.DECORATIONS, ModBlocks.RAW_MITHRIL_BLOCK);
        FabricRecipeProviderFix.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MITHRIL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.MITHRIL_BLOCK);
        FabricRecipeProviderFix.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ADAMANTITE, RecipeCategory.DECORATIONS, ModBlocks.RAW_ADAMANTITE_BLOCK);
        FabricRecipeProviderFix.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ADAMANTITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ADAMANTITE_BLOCK);
        FabricRecipeProviderFix.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUNITE, RecipeCategory.DECORATIONS, ModBlocks.RAW_RUNITE_BLOCK);
        FabricRecipeProviderFix.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUNITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.RUNITE_BLOCK);
        FabricRecipeProviderFix.offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DRAGON_INGOT, RecipeCategory.DECORATIONS, ModBlocks.DRAGON_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BRONZE_ALLOY, 1)
                .pattern("CC")
                .pattern("CT")
                .input('C', Items.RAW_COPPER)
                .input('T', ModItems.RAW_TIN)
                .criterion(hasItem(Items.RAW_COPPER), conditionsFromItem(Items.RAW_COPPER))
                .criterion(hasItem(ModItems.RAW_TIN), conditionsFromItem(ModItems.RAW_TIN))
                .offerTo(exporter);

        SwordToolGenerator(ModItems.BRONZE_INGOT, ModItems.BRONZE_SWORD, exporter);
        SwordToolGenerator(ModItems.BLACK_INGOT, ModItems.BLACK_SWORD, exporter);
        SwordToolGenerator(ModItems.MITHRIL_INGOT, ModItems.MITHRIL_SWORD, exporter);
        SwordToolGenerator(ModItems.ADAMANTITE_INGOT, ModItems.ADAMANTITE_SWORD, exporter);
        SwordToolGenerator(ModItems.RUNITE_INGOT, ModItems.RUNITE_SWORD, exporter);
        SwordToolGenerator(ModItems.DRAGON_INGOT, ModItems.DRAGON_SWORD, exporter);

        PickaxeToolGenerator(ModItems.BRONZE_INGOT, ModItems.BRONZE_PICKAXE, exporter);
        PickaxeToolGenerator(ModItems.BLACK_INGOT, ModItems.BLACK_PICKAXE, exporter);
        PickaxeToolGenerator(ModItems.MITHRIL_INGOT, ModItems.MITHRIL_PICKAXE, exporter);
        PickaxeToolGenerator(ModItems.ADAMANTITE_INGOT, ModItems.ADAMANTITE_PICKAXE, exporter);
        PickaxeToolGenerator(ModItems.RUNITE_INGOT, ModItems.RUNITE_PICKAXE, exporter);
        PickaxeToolGenerator(ModItems.DRAGON_INGOT, ModItems.DRAGON_PICKAXE, exporter);

        AxeToolGenerator(ModItems.BRONZE_INGOT, ModItems.BRONZE_AXE, exporter);
        AxeToolGenerator(ModItems.BLACK_INGOT, ModItems.BLACK_AXE, exporter);
        AxeToolGenerator(ModItems.MITHRIL_INGOT, ModItems.MITHRIL_AXE, exporter);
        AxeToolGenerator(ModItems.ADAMANTITE_INGOT, ModItems.ADAMANTITE_AXE, exporter);
        AxeToolGenerator(ModItems.RUNITE_INGOT, ModItems.RUNITE_AXE, exporter);
        AxeToolGenerator(ModItems.DRAGON_INGOT, ModItems.DRAGON_AXE, exporter);

        ShovelToolGenerator(ModItems.BRONZE_INGOT, ModItems.BRONZE_SHOVEL, exporter);
        ShovelToolGenerator(ModItems.BLACK_INGOT, ModItems.BLACK_SHOVEL, exporter);
        ShovelToolGenerator(ModItems.MITHRIL_INGOT, ModItems.MITHRIL_SHOVEL, exporter);
        ShovelToolGenerator(ModItems.ADAMANTITE_INGOT, ModItems.ADAMANTITE_SHOVEL, exporter);
        ShovelToolGenerator(ModItems.RUNITE_INGOT, ModItems.RUNITE_SHOVEL, exporter);
        ShovelToolGenerator(ModItems.DRAGON_INGOT, ModItems.DRAGON_SHOVEL, exporter);

        HoeToolGenerator(ModItems.BRONZE_INGOT, ModItems.BRONZE_HOE, exporter);
        HoeToolGenerator(ModItems.BLACK_INGOT, ModItems.BLACK_HOE, exporter);
        HoeToolGenerator(ModItems.MITHRIL_INGOT, ModItems.MITHRIL_HOE, exporter);
        HoeToolGenerator(ModItems.ADAMANTITE_INGOT, ModItems.ADAMANTITE_HOE, exporter);
        HoeToolGenerator(ModItems.RUNITE_INGOT, ModItems.RUNITE_HOE, exporter);
        HoeToolGenerator(ModItems.DRAGON_INGOT, ModItems.DRAGON_HOE, exporter);

        HelmetArmorGenerator(ModItems.BRONZE_INGOT, ModItems.BRONZE_HELMET, exporter);
        HelmetArmorGenerator(ModItems.BLACK_INGOT, ModItems.BLACK_HELMET, exporter);
        HelmetArmorGenerator(ModItems.MITHRIL_INGOT, ModItems.MITHRIL_HELMET, exporter);
        HelmetArmorGenerator(ModItems.ADAMANTITE_INGOT, ModItems.ADAMANTITE_HELMET, exporter);
        HelmetArmorGenerator(ModItems.RUNITE_INGOT, ModItems.RUNITE_HELMET, exporter);
        HelmetArmorGenerator(ModItems.DRAGON_INGOT, ModItems.DRAGON_HELMET, exporter);

        ChestplateArmorGenerator(ModItems.BRONZE_INGOT, ModItems.BRONZE_CHESTPLATE, exporter);
        ChestplateArmorGenerator(ModItems.BLACK_INGOT, ModItems.BLACK_CHESTPLATE, exporter);
        ChestplateArmorGenerator(ModItems.MITHRIL_INGOT, ModItems.MITHRIL_CHESTPLATE, exporter);
        ChestplateArmorGenerator(ModItems.ADAMANTITE_INGOT, ModItems.ADAMANTITE_CHESTPLATE, exporter);
        ChestplateArmorGenerator(ModItems.RUNITE_INGOT, ModItems.RUNITE_CHESTPLATE, exporter);
        ChestplateArmorGenerator(ModItems.DRAGON_INGOT, ModItems.DRAGON_CHESTPLATE, exporter);

        LeggingsArmorGenerator(ModItems.BRONZE_INGOT, ModItems.BRONZE_LEGGINGS, exporter);
        LeggingsArmorGenerator(ModItems.BLACK_INGOT, ModItems.BLACK_LEGGINGS, exporter);
        LeggingsArmorGenerator(ModItems.MITHRIL_INGOT, ModItems.MITHRIL_LEGGINGS, exporter);
        LeggingsArmorGenerator(ModItems.ADAMANTITE_INGOT, ModItems.ADAMANTITE_LEGGINGS, exporter);
        LeggingsArmorGenerator(ModItems.RUNITE_INGOT, ModItems.RUNITE_LEGGINGS, exporter);
        LeggingsArmorGenerator(ModItems.DRAGON_INGOT, ModItems.DRAGON_LEGGINGS, exporter);

        BootsArmorGenerator(ModItems.BRONZE_INGOT, ModItems.BRONZE_BOOTS, exporter);
        BootsArmorGenerator(ModItems.BLACK_INGOT, ModItems.BLACK_BOOTS, exporter);
        BootsArmorGenerator(ModItems.MITHRIL_INGOT, ModItems.MITHRIL_BOOTS, exporter);
        BootsArmorGenerator(ModItems.ADAMANTITE_INGOT, ModItems.ADAMANTITE_BOOTS, exporter);
        BootsArmorGenerator(ModItems.RUNITE_INGOT, ModItems.RUNITE_BOOTS, exporter);
        BootsArmorGenerator(ModItems.DRAGON_INGOT, ModItems.DRAGON_BOOTS, exporter);

    }
}
