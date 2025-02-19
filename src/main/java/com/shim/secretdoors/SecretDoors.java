package com.shim.secretdoors;

import com.shim.secretdoors.registry.SDBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SecretDoors.MODID)
public class SecretDoors {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "secretdoors";

    public SecretDoors(IEventBus modEventBus) {

        SDBlocks.BLOCKS.register(modEventBus);
        SDBlocks.ITEMS.register(modEventBus);

        modEventBus.addListener(SDBlocks::addCreative);
//        modEventBus.addListener(DataGenerators::gatherData);

//        NeoForge.EVENT_BUS.register(this);
    }

    public static String key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).getPath();
    }

    public static String key(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).getPath();
    }
}