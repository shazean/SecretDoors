package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, SecretDoors.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get(), "Secret Oak Plank Door");
        add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get(), "Secret Dark Oak Plank Door");
        add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get(), "Secret Birch Plank Door");
        add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get(), "Secret Acacia Plank Door");
        add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get(), "Secret Spruce Plank Door");
        add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get(), "Secret Jungle Plank Door");

        add(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get(), "Secret Oak Log Door");
        add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get(), "Secret Dark Oak Log Door");
        add(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get(), "Secret Birch Log Door");
        add(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get(), "Secret Acacia Log Door");
        add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get(), "Secret Spruce Log Door");
        add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get(), "Secret Jungle Log Door");

        add(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_DOOR.get(), "Secret Stripped Oak Log Door");
        add(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_DOOR.get(), "Secret Stripped Horizontal Dark Oak Log Door");
        add(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_DOOR.get(), "Secret Stripped Horizontal Birch Log Door");
        add(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_DOOR.get(), "Secret Stripped Horizontal Acacia Log Door");
        add(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_DOOR.get(), "Secret Stripped Horizontal Spruce Log Door");
        add(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_DOOR.get(), "Secret Stripped Horizontal Jungle Log Door");

        add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_OAK_LOG_DOOR.get(), "Secret Stripped Horizontal Oak Log Door");
        add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), "Secret Stripped Horizontal Dark Oak Log Door");
        add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_BIRCH_LOG_DOOR.get(), "Secret Stripped Horizontal Birch Log Door");
        add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_ACACIA_LOG_DOOR.get(), "Secret Stripped Horizontal Acacia Log Door");
        add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_SPRUCE_LOG_DOOR.get(), "Secret Stripped Horizontal Spruce Log Door");
        add(SecretDoorsRegistry.SECRET_STRIPPED_HORIZONTAL_JUNGLE_LOG_DOOR.get(), "Secret Stripped Horizontal Jungle Log Door");

        add(SecretDoorsRegistry.SECRET_HORIZONTAL_OAK_LOG_DOOR.get(), "Secret Horizontal Oak Log Door");
        add(SecretDoorsRegistry.SECRET_HORIZONTAL_DARK_OAK_LOG_DOOR.get(), "Secret Horizontal Dark Oak Log Door");
        add(SecretDoorsRegistry.SECRET_HORIZONTAL_BIRCH_LOG_DOOR.get(), "Secret Horizontal Birch Log Door");
        add(SecretDoorsRegistry.SECRET_HORIZONTAL_ACACIA_LOG_DOOR.get(), "Secret Horizontal Acacia Log Door");
        add(SecretDoorsRegistry.SECRET_HORIZONTAL_SPRUCE_LOG_DOOR.get(), "Secret Horizontal Spruce Log Door");
        add(SecretDoorsRegistry.SECRET_HORIZONTAL_JUNGLE_LOG_DOOR.get(), "Secret Horizontal Jungle Log Door");


        add(SecretDoorsRegistry.SECRET_STONE_DOOR.get(), "Secret Stone Door");
        add(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR.get(), "Secret Cobblestone Door");
        add(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR.get(), "Secret Stone Bricks Door");
        add(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR.get(), "Secret Deepslate Door");
        add(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR.get(), "Secret Cobbled Deepslate Door");
        add(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR.get(), "Secret Deepslate Bricks Door");

        add(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR.get(), "Secret Polished Deepslate Door");
        add(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR.get(), "Secret Deepslate Tile Door");

        add(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR.get(), "Secret Bookshelf Door");

        add(SecretDoorsRegistry.SECRET_NETHERRACK_DOOR.get(), "Secret Netherrack Door");
        add(SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR.get(), "Secret Nether Brick Door");
        add(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR.get(), "Secret Polished Blackstone Door");
        add(SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR.get(), "Secret Polished Basalt Door");

        add(SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR.get(), "Secret Blackstone Door");
        add(SecretDoorsRegistry.SECRET_ANDESITE_DOOR.get(), "Secret Andesite Door");
        add(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR.get(), "Secret Polished Andesite Door");
        add(SecretDoorsRegistry.SECRET_DIORITE_DOOR.get(), "Secret Diorite Door");
        add(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR.get(), "Secret Polished Diorite Door");
        add(SecretDoorsRegistry.SECRET_GRANITE_DOOR.get(), "Secret Granite Door");
        add(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR.get(), "Secret Polished Granite Door");

        add(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_DOOR.get(), "Secret Block of Quartz Door");
        add(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_DOOR.get(), "Secret Smooth Quartz Door");
        add(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_DOOR.get(), "Secret Quartz Bricks Door");
        add(SecretDoorsRegistry.SECRET_SANDSTONE_DOOR.get(), "Secret Sandstone Door");
        add(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_DOOR.get(), "Secret Cut Sandstone Door");
        add(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_DOOR.get(), "Secret Smooth Sandstone Door");
        add(SecretDoorsRegistry.SECRET_RED_SANDSTONE_DOOR.get(), "Secret Red Sandstone Door");
        add(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_DOOR.get(), "Secret Cut Red Sandstone Door");
        add(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_DOOR.get(), "Secret Smooth Red Sandstone Door");
        add(SecretDoorsRegistry.SECRET_BRICKS_DOOR.get(), "Secret Bricks Door");
        add(SecretDoorsRegistry.SECRET_PURPUR_DOOR.get(), "Secret Purpur Door");
        add(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_DOOR.get(), "Secret End Stone Bricks Door");
        add(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_DOOR.get(), "Secret Prismarine Bricks Door");
        add(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_DOOR.get(), "Secret Dark Prismarine Door");


        /*
         * TRAPDOORs
         */
        add(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get(), "Secret Oak Plank Trapdoor");
        add(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), "Secret Dark Oak Plank Trapdoor");
        add(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get(), "Secret Birch Plank Trapdoor");
        add(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get(), "Secret Acacia Plank Trapdoor");
        add(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), "Secret Spruce Plank Trapdoor");
        add(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), "Secret Jungle Plank Trapdoor");

        add(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get(), "Secret Oak Log Trapdoor");
        add(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), "Secret Dark Oak Log Trapdoor");
        add(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get(), "Secret Birch Log Trapdoor");
        add(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get(), "Secret Acacia Log Trapdoor");
        add(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get(), "Secret Spruce Log Trapdoor");
        add(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get(), "Secret Jungle Log Trapdoor");

        add(SecretDoorsRegistry.SECRET_STRIPPED_OAK_LOG_TRAPDOOR.get(), "Secret Stripped Oak Log Trapdoor");
        add(SecretDoorsRegistry.SECRET_STRIPPED_DARK_OAK_LOG_TRAPDOOR.get(), "Secret Stripped Horizontal Dark Oak Log Trapdoor");
        add(SecretDoorsRegistry.SECRET_STRIPPED_BIRCH_LOG_TRAPDOOR.get(), "Secret Stripped Horizontal Birch Log Trapdoor");
        add(SecretDoorsRegistry.SECRET_STRIPPED_ACACIA_LOG_TRAPDOOR.get(), "Secret Stripped Horizontal Acacia Log Trapdoor");
        add(SecretDoorsRegistry.SECRET_STRIPPED_SPRUCE_LOG_TRAPDOOR.get(), "Secret Stripped Horizontal Spruce Log Trapdoor");
        add(SecretDoorsRegistry.SECRET_STRIPPED_JUNGLE_LOG_TRAPDOOR.get(), "Secret Stripped Horizontal Jungle Log Trapdoor");

        add(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR.get(), "Secret Stone Trapdoor");
        add(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR.get(), "Secret Cobblestone Trapdoor");
        add(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR.get(), "Secret Stone Bricks Trapdoor");
        add(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR.get(), "Secret Deepslate Trapdoor");
        add(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), "Secret Cobbled Deepslate Trapdoor");
        add(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), "Secret Deepslate Bricks Trapdoor");

        add(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), "Secret Polished Deepslate Trapdoor");
        add(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), "Secret Deepslate Tile Trapdoor");

        add(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR.get(), "Secret Bookshelf Trapdoor");

        add(SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR.get(), "Secret Netherrack Trapdoor");
        add(SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR.get(), "Secret Nether Brick Trapdoor");
        add(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), "Secret Polished Blackstone Trapdoor");
        add(SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR.get(), "Secret Polished Basalt Trapdoor");

        add(SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR.get(), "Secret Blackstone Trapdoor");
        add(SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR.get(), "Secret Andesite Trapdoor");
        add(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), "Secret Polished Andesite Trapdoor");
        add(SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR.get(), "Secret Diorite Trapdoor");
        add(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), "Secret Polished Diorite Trapdoor");
        add(SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR.get(), "Secret Granite Trapdoor");
        add(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), "Secret Polished Granite Trapdoor");

        add(SecretDoorsRegistry.SECRET_QUARTZ_BLOCK_TRAPDOOR.get(), "Secret Block of Quartz Trapdoor");
        add(SecretDoorsRegistry.SECRET_SMOOTH_QUARTZ_TRAPDOOR.get(), "Secret Smooth Quartz Trapdoor");
        add(SecretDoorsRegistry.SECRET_QUARTZ_BRICKS_TRAPDOOR.get(), "Secret Quartz Bricks Trapdoor");
        add(SecretDoorsRegistry.SECRET_SANDSTONE_TRAPDOOR.get(), "Secret Sandstone Trapdoor");
        add(SecretDoorsRegistry.SECRET_CUT_SANDSTONE_TRAPDOOR.get(), "Secret Cut Sandstone Trapdoor");
        add(SecretDoorsRegistry.SECRET_SMOOTH_SANDSTONE_TRAPDOOR.get(), "Secret Smooth Sandstone Trapdoor");
        add(SecretDoorsRegistry.SECRET_RED_SANDSTONE_TRAPDOOR.get(), "Secret Red Sandstone Trapdoor");
        add(SecretDoorsRegistry.SECRET_CUT_RED_SANDSTONE_TRAPDOOR.get(), "Secret Cut Red Sandstone Trapdoor");
        add(SecretDoorsRegistry.SECRET_SMOOTH_RED_SANDSTONE_TRAPDOOR.get(), "Secret Smooth Red Sandstone Trapdoor");
        add(SecretDoorsRegistry.SECRET_BRICKS_TRAPDOOR.get(), "Secret Bricks Trapdoor");
        add(SecretDoorsRegistry.SECRET_PURPUR_TRAPDOOR.get(), "Secret Purpur Trapdoor");
        add(SecretDoorsRegistry.SECRET_END_STONE_BRICKS_TRAPDOOR.get(), "Secret End Stone Bricks Trapdoor");
        add(SecretDoorsRegistry.SECRET_PRISMARINE_BRICKS_TRAPDOOR.get(), "Secret Prismarine Bricks Trapdoor");
        add(SecretDoorsRegistry.SECRET_DARK_PRISMARINE_TRAPDOOR.get(), "Secret Dark Prismarine Trapdoor");
        
    }
}
