package net.darties.minescape.world;

import net.darties.minescape.MineScape;
import net.darties.minescape.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MITHRIL_ORE_KEY = registerKey("mithril_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_MITHRIL_ORE_KEY = registerKey("deepslate_mithril_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ADAMANTITE_ORE_KEY = registerKey("adamantite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_ADAMANTITE_ORE_KEY = registerKey("deepslate_adamantite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_ADAMANTITE_ORE_KEY = registerKey("nether_adamantite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUNITE_ORE_KEY = registerKey("runite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_RUNITE_ORE_KEY = registerKey("deepslate_runite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_RUNITE_ORE_KEY = registerKey("nether_runite_ore");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplacables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);

        List<OreFeatureConfig.Target> overworldTinOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.TIN_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldMithrilOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.MITHRIL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_MITHRIL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAdamantiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.ADAMANTITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_ADAMANTITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherAdamantiteOres =
                List.of(OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHER_ADAMANTITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRuniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.RUNITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_RUNITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherRuniteOres =
                List.of(OreFeatureConfig.createTarget(netherReplacables, ModBlocks.NETHER_RUNITE_ORE.getDefaultState()));

        register(context, TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTinOres, 8));
        register(context, MITHRIL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMithrilOres,6));
        register(context, DEEPSLATE_MITHRIL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMithrilOres, 8));
        register(context, ADAMANTITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAdamantiteOres, 4));
        register(context, DEEPSLATE_ADAMANTITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAdamantiteOres, 6));
        register(context, NETHER_ADAMANTITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherAdamantiteOres, 8));
        register(context, RUNITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRuniteOres, 3));
        register(context, DEEPSLATE_RUNITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRuniteOres, 5));
        register(context, NETHER_RUNITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRuniteOres, 6));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MineScape.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
