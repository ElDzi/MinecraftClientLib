package com.captainbern.minecraft.client.world;

import com.captainbern.minecraft.client.world.chunk.Chunk;
import java.util.List;

public interface World {

    public Dimension getDimension();

    public WorldType getWorldType();

    public List<Chunk> getChunks();

    public long getWorldTime();

    public long getWorldAge();

    public int getMaxHeight();
}
