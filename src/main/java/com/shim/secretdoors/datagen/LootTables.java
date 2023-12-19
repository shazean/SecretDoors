package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.SecretDoorsRegistry;
import net.minecraft.data.DataGenerator;

public class LootTables  extends BaseLootTableProvider {

    public LootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get(), createSimpleTable("secret_oak_plank_door", SecretDoorsRegistry.SECRET_OAK_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get(), createSimpleTable("secret_dark_oak_plank_door", SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get(), createSimpleTable("secret_birch_plank_door", SecretDoorsRegistry.SECRET_BIRCH_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get(), createSimpleTable("secret_acacia_plank_door", SecretDoorsRegistry.SECRET_ACACIA_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get(), createSimpleTable("secret_spruce_plank_door", SecretDoorsRegistry.SECRET_SPRUCE_PLANK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get(), createSimpleTable("secret_jungle_plank_door", SecretDoorsRegistry.SECRET_JUNGLE_PLANK_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get(), createSimpleTable("secret_oak_log_door", SecretDoorsRegistry.SECRET_OAK_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get(), createSimpleTable("secret_dark_oak_log_door", SecretDoorsRegistry.SECRET_DARK_OAK_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get(), createSimpleTable("secret_birch_log_door", SecretDoorsRegistry.SECRET_BIRCH_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get(), createSimpleTable("secret_acacia_log_door", SecretDoorsRegistry.SECRET_ACACIA_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get(), createSimpleTable("secret_spruce_log_door", SecretDoorsRegistry.SECRET_SPRUCE_LOG_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get(), createSimpleTable("secret_jungle_log_door", SecretDoorsRegistry.SECRET_JUNGLE_LOG_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_STONE_DOOR.get(), createSimpleTable("secret_stone_door", SecretDoorsRegistry.SECRET_STONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR.get(), createSimpleTable("secret_cobblestone_door", SecretDoorsRegistry.SECRET_COBBLESTONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR.get(), createSimpleTable("secret_stone_bricks_door", SecretDoorsRegistry.SECRET_STONE_BRICKS_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR.get(), createSimpleTable("secret_deepslate_door", SecretDoorsRegistry.SECRET_DEEPSLATE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR.get(), createSimpleTable("secret_cobbled_deepslate_door", SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR.get(), createSimpleTable("secret_deepslate_bricks_door", SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR.get(), createSimpleTable("secret_deepslate_tiles_door", SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR.get(), createSimpleTable("secret_polished_deepslate_door", SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR.get(), createSimpleTable("secret_bookshelf_door", SecretDoorsRegistry.SECRET_BOOKSHELF_DOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_NETHERRACK_DOOR.get(), createSimpleTable("secret_netherrack_door", SecretDoorsRegistry.SECRET_NETHERRACK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR.get(), createSimpleTable("secret_nether_brick_door", SecretDoorsRegistry.SECRET_NETHER_BRICK_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR.get(), createSimpleTable("secret_polished_blackstone_door", SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR.get(), createSimpleTable("secret_polished_basalt_door", SecretDoorsRegistry.SECRET_POLISHED_BASALT_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR.get(), createSimpleTable("secret_blackstone_door", SecretDoorsRegistry.SECRET_BLACKSTONE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ANDESITE_DOOR.get(), createSimpleTable("secret_andesite_door", SecretDoorsRegistry.SECRET_ANDESITE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR.get(), createSimpleTable("secret_polished_andesite_door", SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DIORITE_DOOR.get(), createSimpleTable("secret_diorite_door", SecretDoorsRegistry.SECRET_DIORITE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR.get(), createSimpleTable("secret_polished_diorite_door", SecretDoorsRegistry.SECRET_POLISHED_DIORITE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_GRANITE_DOOR.get(), createSimpleTable("secret_granite_door", SecretDoorsRegistry.SECRET_GRANITE_DOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR.get(), createSimpleTable("secret_polished_granite_door", SecretDoorsRegistry.SECRET_POLISHED_GRANITE_DOOR.get()));

        /*
         * TRAPDOORS
         */

        lootTables.put(SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get(), createSimpleTable("secret_oak_plank_trapdoor", SecretDoorsRegistry.SECRET_OAK_PLANK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get(), createSimpleTable("secret_dark_oak_plank_trapdoor", SecretDoorsRegistry.SECRET_DARK_OAK_PLANK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get(), createSimpleTable("secret_birch_plank_trapdoor", SecretDoorsRegistry.SECRET_BIRCH_PLANK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get(), createSimpleTable("secret_acacia_plank_trapdoor", SecretDoorsRegistry.SECRET_ACACIA_PLANK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get(), createSimpleTable("secret_spruce_plank_trapdoor", SecretDoorsRegistry.SECRET_SPRUCE_PLANK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get(), createSimpleTable("secret_jungle_plank_trapdoor", SecretDoorsRegistry.SECRET_JUNGLE_PLANK_TRAPDOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get(), createSimpleTable("secret_oak_log_trapdoor", SecretDoorsRegistry.SECRET_OAK_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get(), createSimpleTable("secret_dark_oak_log_trapdoor", SecretDoorsRegistry.SECRET_DARK_OAK_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get(), createSimpleTable("secret_birch_log_trapdoor", SecretDoorsRegistry.SECRET_BIRCH_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get(), createSimpleTable("secret_acacia_log_trapdoor", SecretDoorsRegistry.SECRET_ACACIA_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get(), createSimpleTable("secret_spruce_log_trapdoor", SecretDoorsRegistry.SECRET_SPRUCE_LOG_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get(), createSimpleTable("secret_jungle_log_trapdoor", SecretDoorsRegistry.SECRET_JUNGLE_LOG_TRAPDOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_STONE_TRAPDOOR.get(), createSimpleTable("secret_stone_trapdoor", SecretDoorsRegistry.SECRET_STONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR.get(), createSimpleTable("secret_cobblestone_trapdoor", SecretDoorsRegistry.SECRET_COBBLESTONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_stone_bricks_trapdoor", SecretDoorsRegistry.SECRET_STONE_BRICKS_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_deepslate_trapdoor", SecretDoorsRegistry.SECRET_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_cobbled_deepslate_trapdoor", SecretDoorsRegistry.SECRET_COBBLED_DEEPSLATE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get(), createSimpleTable("secret_deepslate_bricks_trapdoor", SecretDoorsRegistry.SECRET_DEEPSLATE_BRICKS_TRAPDOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR.get(), createSimpleTable("secret_deepslate_tiles_trapdoor", SecretDoorsRegistry.SECRET_DEEPSLATE_TILES_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get(), createSimpleTable("secret_polished_deepslate_trapdoor", SecretDoorsRegistry.SECRET_POLISHED_DEEPSLATE_TRAPDOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR.get(), createSimpleTable("secret_bookshelf_trapdoor", SecretDoorsRegistry.SECRET_BOOKSHELF_TRAPDOOR.get()));

        lootTables.put(SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR.get(), createSimpleTable("secret_netherrack_trapdoor", SecretDoorsRegistry.SECRET_NETHERRACK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR.get(), createSimpleTable("secret_nether_brick_trapdoor", SecretDoorsRegistry.SECRET_NETHER_BRICK_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get(), createSimpleTable("secret_polished_blackstone_trapdoor", SecretDoorsRegistry.SECRET_POLISHED_BLACKSTONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR.get(), createSimpleTable("secret_polished_basalt_trapdoor", SecretDoorsRegistry.SECRET_POLISHED_BASALT_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR.get(), createSimpleTable("secret_blackstone_trapdoor", SecretDoorsRegistry.SECRET_BLACKSTONE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR.get(), createSimpleTable("secret_andesite_trapdoor", SecretDoorsRegistry.SECRET_ANDESITE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR.get(), createSimpleTable("secret_polished_andesite_trapdoor", SecretDoorsRegistry.SECRET_POLISHED_ANDESITE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR.get(), createSimpleTable("secret_diorite_trapdoor", SecretDoorsRegistry.SECRET_DIORITE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR.get(), createSimpleTable("secret_polished_diorite_trapdoor", SecretDoorsRegistry.SECRET_POLISHED_DIORITE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR.get(), createSimpleTable("secret_granite_trapdoor", SecretDoorsRegistry.SECRET_GRANITE_TRAPDOOR.get()));
        lootTables.put(SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR.get(), createSimpleTable("secret_polished_granite_trapdoor", SecretDoorsRegistry.SECRET_POLISHED_GRANITE_TRAPDOOR.get()));


    }
}