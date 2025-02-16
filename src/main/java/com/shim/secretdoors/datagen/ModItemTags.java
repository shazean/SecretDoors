package com.shim.secretdoors.datagen;

import com.shim.secretdoors.SecretDoors;
import com.shim.secretdoors.registry.SDBlocks;
import com.shim.secretdoors.registry.SDTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTags extends ItemTagsProvider {

    public ModItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, SecretDoors.MODID, helper);
    }

    @Override
    protected void addTags() {

        this.copy(SDTags.Blocks.SECRET_WOODEN_PLANK_DOORS, SDTags.Items.SECRET_WOODEN_PLANK_DOORS);
        this.copy(SDTags.Blocks.SECRET_WOODEN_PLANK_TRAPDOORS, SDTags.Items.SECRET_WOODEN_PLANK_TRAPDOORS);

        this.copy(SDTags.Blocks.SECRET_LOG_DOORS, SDTags.Items.SECRET_LOG_DOORS);
        this.copy(SDTags.Blocks.SECRET_LOG_TRAPDOORS, SDTags.Items.SECRET_LOG_TRAPDOORS);

        this.copy(SDTags.Blocks.SECRET_BOOKSHELF_DOORS, SDTags.Items.SECRET_BOOKSHELF_DOORS);
        this.copy(SDTags.Blocks.SECRET_BOOKSHELF_TRAPDOORS, SDTags.Items.SECRET_BOOKSHELF_TRAPDOORS);

        this.copy(SDTags.Blocks.SECRET_WOODEN_DOORS, SDTags.Items.SECRET_WOODEN_DOORS);
        this.copy(SDTags.Blocks.SECRET_WOODEN_TRAPDOORS, SDTags.Items.SECRET_WOODEN_TRAPDOORS);

        this.copy(SDTags.Blocks.SECRET_STONE_DOORS, SDTags.Items.SECRET_STONE_DOORS);
        this.copy(SDTags.Blocks.SECRET_STONE_TRAPDOORS, SDTags.Items.SECRET_STONE_TRAPDOORS);

        this.copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        this.copy(BlockTags.WOODEN_TRAPDOORS, ItemTags.WOODEN_TRAPDOORS);

        this.copy(BlockTags.DOORS, ItemTags.DOORS);
        this.copy(BlockTags.TRAPDOORS, ItemTags.TRAPDOORS);

    }
}
