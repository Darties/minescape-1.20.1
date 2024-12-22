package net.darties.minescape.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.function.Supplier;

@Mixin(ToolMaterials.class)
public class ToolMaterialModifier {

    @WrapOperation(method = "<clinit>",
    at = @At(value = "NEW", target = "net/minecraft/item/ToolMaterials")
    )
    private static ToolMaterials modifyMaterial(@NotNull String name, int ordinal, int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> ingredient, Operation<ToolMaterials> original) {

        switch (name) {
            case ("WOOD"):
                miningSpeed = 1.5F;
                enchantability = 8;
                break;
            case ("STONE"):
                itemDurability = 104;
                miningSpeed = 2F;
                break;
            case ("IRON"):
                miningSpeed = 4;
                enchantability = 12;
                break;
            case ("DIAMOND"):
                miningSpeed = 7.0F;
                break;
            default:
                break;
        }

        return original.call(name, ordinal, miningLevel, itemDurability, miningSpeed, attackDamage, enchantability, ingredient);
    }

}
