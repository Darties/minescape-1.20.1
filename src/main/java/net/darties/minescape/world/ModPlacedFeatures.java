package net.darties.minescape.world;

import net.darties.minescape.MineScape;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final RegistryKey<PlacedFeature> MITHRIL_ORE_PLACED_KEY_UPPER = registerKey("mithril_ore_placed_upper");
    public static final RegistryKey<PlacedFeature> MITHRIL_ORE_PLACED_KEY_LOWER = registerKey("mithril_ore_placed_lower");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_MITHRIL_ORE_PLACED_KEY = registerKey("deepslate_mithril_ore_placed");
    public static final RegistryKey<PlacedFeature> ADAMANTITE_ORE_PLACED_KEY_UPPER = registerKey("adamantite_ore_placed_upper");
    public static final RegistryKey<PlacedFeature> ADAMANTITE_ORE_PLACED_KEY_LOWER = registerKey("adamantite_ore_placed_lower");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_ADAMANTITE_ORE_PLACED_KEY = registerKey("deepslate_adamantite_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_ADAMANTITE_ORE_PLACED_KEY = registerKey("nether_adamantite_ore_placed");
    public static final RegistryKey<PlacedFeature> RUNITE_ORE_PLACED_KEY = registerKey("runite_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_RUNITE_ORE_PLACED_KEY = registerKey("deepslate_runite_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_RUNITE_ORE_PLACED_KEY = registerKey("nether_runite_ore_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, TIN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TIN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(14, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(164))));

        register(context, MITHRIL_ORE_PLACED_KEY_UPPER, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MITHRIL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(100), YOffset.fixed(384))));

        register(context, MITHRIL_ORE_PLACED_KEY_LOWER, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MITHRIL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-48), YOffset.fixed(32))));

        register(context, DEEPSLATE_MITHRIL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_MITHRIL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-48), YOffset.fixed(32))));

        register(context, ADAMANTITE_ORE_PLACED_KEY_UPPER, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ADAMANTITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(116), YOffset.fixed(384))));

        register(context, ADAMANTITE_ORE_PLACED_KEY_LOWER, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ADAMANTITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-63), YOffset.fixed(20))));

        register(context, DEEPSLATE_ADAMANTITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_ADAMANTITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-63), YOffset.fixed(20))));

        register(context, NETHER_ADAMANTITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_ADAMANTITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(6), YOffset.fixed(119))));

        register(context, RUNITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUNITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(3, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-63), YOffset.fixed(1))));

        register(context, DEEPSLATE_RUNITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DEEPSLATE_RUNITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-63), YOffset.fixed(1))));

        register(context, NETHER_RUNITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_RUNITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(6), YOffset.fixed(119))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MineScape.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
