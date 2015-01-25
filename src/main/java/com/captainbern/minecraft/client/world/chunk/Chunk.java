package com.captainbern.minecraft.client.world.chunk;

import com.captainbern.minecraft.client.world.World;

public interface Chunk {

    public World getWorld();

    public int getX();

    public int getZ();
}
