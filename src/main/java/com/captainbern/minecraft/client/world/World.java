package com.captainbern.minecraft.client.world;

import com.captainbern.minecraft.client.world.chunk.Chunk;

import java.util.Collection;
import java.util.List;

public interface World {

    /**
     * TODO:
     *  - Add getBlockAt(loc);
     *  - Add getChunk(x, z);
     *  - Add weather methods
     *  - Add block-breaker + blockdropper code
     *  - Add getEntities()
     *  - Add getPlayers()
     *  - Add a* pathfinding
     *  - Possibly add an option to save the world to disk
     *  - getBiome(x, z);
     *  -
     */

    public Dimension getDimension();

    public WorldType getWorldType();

    public Collection<Chunk> getChunks();

    public long getWorldTime();

    public long getWorldAge();

    public int getMaxHeight();
}
