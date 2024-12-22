package net.darties.minescape.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    BRONZE(1, 176, 3.0F, 1.0F, 10,
            () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    BLACK (2, 322, 4.0F, 2.0F, 14,
            () -> Ingredient.ofItems(ModItems.BLACK_INGOT)),
    MITHRIL(2,435, 5.0F,2.0F,14,
            () -> Ingredient.ofItems(ModItems.MITHRIL_INGOT)),
    ADAMANTITE(3,777, 6.0F,2.0F,12,
            () -> Ingredient.ofItems(ModItems.ADAMANTITE_INGOT)),
    RUNITE(3,1996, 8.0F, 3.0F,16,
            () -> Ingredient.ofItems(ModItems.RUNITE_INGOT)),
    DRAGON(4, 2018, 10.0F, 5.0F, 20,
            () -> Ingredient.ofItems(ModItems.DRAGON_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}