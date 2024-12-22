package net.darties.minescape.item;

import net.darties.minescape.MineScape;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    BRONZE("bronze", 5, new int[] { 1, 2, 3, 1 }, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    BLACK("black", 20, new int[] { 2, 5, 6, 2 }, 14,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> Ingredient.ofItems(ModItems.BLACK_INGOT)),
    MITHRIL("mithril", 20, new int[] { 2, 5, 6, 2 }, 14,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.ofItems(ModItems.MITHRIL_INGOT)),
    ADAMANTITE("adamantite", 27, new int[] { 3, 5, 7, 2 }, 12,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> Ingredient.ofItems(ModItems.ADAMANTITE_INGOT)),
    RUNITE("runite", 35, new int[] { 3, 6, 8, 3 }, 14,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.05F, () -> Ingredient.ofItems(ModItems.RUNITE_INGOT)),
    DRAGON("dragon", 40, new int[] { 3, 6, 8, 3 }, 20,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.12F, () -> Ingredient.ofItems(ModItems.DRAGON_INGOT));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MineScape.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}