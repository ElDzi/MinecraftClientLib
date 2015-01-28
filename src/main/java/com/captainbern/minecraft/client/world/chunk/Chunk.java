package com.captainbern.minecraft.client.world.chunk;

import com.captainbern.minecraft.client.world.World;
import com.captainbern.minecraft.client.world.block.BlockImpl;

public interface Chunk {

    public static final int WIDTH = 16;
    public static final int HEIGHT = 16;
    public static final int DEPTH = 256;

    public static final int SECTION_DEPTH = 16;

    public static final int SIZE = WIDTH * HEIGHT * SECTION_DEPTH;

    public World getWorld();

    public int getX();

    public int getZ();

    public BlockImpl getBlock(int x, int y, int z);
}
