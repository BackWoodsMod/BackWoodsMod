package com.chaka.thebackwoods.block;

import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockDeadWood extends BlockTBW {

    public BlockDeadWood() {

        super(Material.wood);
        this.setBlockName("deadWood");
        this.setStepSound(soundTypeWood);
        this.setHardness(1.0F);
    }

    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z) {

        return false;
    }
}