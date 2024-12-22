package net.darties.minescape.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Slice;


@Mixin(Items.class)
public abstract class ToolItemModifier {

    @WrapOperation(method = "<clinit>",
    slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=wooden_sword")),
    at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;IFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/SwordItem;", ordinal = 0))
    private static SwordItem modifyWoodSword(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings, Operation<SwordItem> original) {
        return original.call(material, 1, attackSpeed, settings);
    }
    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=wooden_pickaxe")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;IFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/PickaxeItem;", ordinal = 0))
    private static PickaxeItem modifyWoodPickAxe(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings, Operation<PickaxeItem> original) {
        return original.call(material, 0, attackSpeed, settings);
    }
    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=wooden_axe")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;FFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/AxeItem;", ordinal = 0))
    private static AxeItem modifyWoodAxe(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings, Operation<AxeItem> original) {
        return original.call(material, 3.0F, attackSpeed, settings);
    }
    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=wooden_shovel")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;FFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/ShovelItem;", ordinal = 0)
    )
    private static ShovelItem modifyWoodShovel(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings, Operation<ShovelItem> original) {
        return original.call(material, 0.0F, attackSpeed, settings);
    }

    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=stone_sword")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;IFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/SwordItem;", ordinal = 0))
    private static SwordItem modifyStoneSword(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings, Operation<SwordItem> original) {
        return original.call(material, 1, attackSpeed, settings);
    }
    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=stone_pickaxe")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;IFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/PickaxeItem;", ordinal = 0))
    private static PickaxeItem modifyStonePickAxe(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings, Operation<PickaxeItem> original) {
        return original.call(material, 0, attackSpeed, settings);
    }
    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=stone_axe")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;FFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/AxeItem;", ordinal = 0))
    private static AxeItem modifyStoneAxe(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings, Operation<AxeItem> original) {
        return original.call(material, 3.0F, attackSpeed, settings);
    }
    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=stone_shovel")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;FFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/ShovelItem;", ordinal = 0)
    )
    private static ShovelItem modifyStoneShovel(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings, Operation<ShovelItem> original) {
        return original.call(material, 0.0F, attackSpeed, settings);
    }

    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=iron_sword")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;IFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/SwordItem;", ordinal = 0))
    private static SwordItem modifyIronSword(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings, Operation<SwordItem> original) {
        return original.call(material, 2, attackSpeed, settings);
    }
    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=iron_pickaxe")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;IFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/PickaxeItem;", ordinal = 0))
    private static PickaxeItem modifyIronPickAxe(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings, Operation<PickaxeItem> original) {
        return original.call(material, 1, attackSpeed, settings);
    }
    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=iron_axe")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;FFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/AxeItem;", ordinal = 0))
    private static AxeItem modifyIronAxe(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings, Operation<AxeItem> original) {
        return original.call(material, 4.0F, attackSpeed, settings);
    }
    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=iron_shovel")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;FFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/ShovelItem;", ordinal = 0)
    )
    private static ShovelItem modifyIronShovel(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings, Operation<ShovelItem> original) {
        return original.call(material, 1.0F, attackSpeed, settings);
    }

    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=netherite_sword")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;IFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/SwordItem;", ordinal = 0))
    private static SwordItem modifyNetheriteSword(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings, Operation<SwordItem> original) {
        return original.call(material, 4, attackSpeed, settings);
    }
    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=netherite_pickaxe")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;IFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/PickaxeItem;", ordinal = 0))
    private static PickaxeItem modifyNetheritePickAxe(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings, Operation<PickaxeItem> original) {
        return original.call(material, 1, attackSpeed, settings);
    }
    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=netherite_axe")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;FFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/AxeItem;", ordinal = 0))
    private static AxeItem modifyNetheriteAxe(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings, Operation<AxeItem> original) {
        return original.call(material, 6.0F, attackSpeed, settings);
    }
    @WrapOperation(method = "<clinit>",
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=netherite_shovel")),
            at = @At(value = "NEW", target = "(Lnet/minecraft/item/ToolMaterial;FFLnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/ShovelItem;", ordinal = 0)
    )
    private static ShovelItem modifyNetheriteShovel(ToolMaterial material, float attackDamage, float attackSpeed, Item.Settings settings, Operation<ShovelItem> original) {
        return original.call(material, 1.0F, attackSpeed, settings);
    }



}
