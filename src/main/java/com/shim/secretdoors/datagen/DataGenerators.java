package com.shim.secretdoors.datagen;


import com.shim.secretdoors.SecretDoors;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;

@EventBusSubscriber(modid = SecretDoors.MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createProvider((output, lookupProvider) ->
                new LootTableProvider(output, Set.of(), List.of(new LootTableProvider.SubProviderEntry(SDLootTables::new, LootContextParamSets.BLOCK)), lookupProvider));

        event.createProvider(Recipes.Runner::new);
        event.createProvider(SDLanguageProvider::new);
        event.createProvider(SDModelProvider::new);

        event.createBlockAndItemTags(SDBlockTags::new, SDItemTags::new);

    }
}