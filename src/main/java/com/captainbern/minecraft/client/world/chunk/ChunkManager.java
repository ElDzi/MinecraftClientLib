package com.captainbern.minecraft.client.world.chunk;

import com.captainbern.minecraft.client.world.WorldImpl;
import com.google.common.collect.Maps;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ChunkManager {

    private final WorldImpl world;

    private Map<ChunkKey, Chunk> chunks = Maps.newConcurrentMap();

    public ChunkManager(WorldImpl world) {
        this.world = world;
    }

    public WorldImpl getWorld() {
        return this.world;
    }

    public Collection<Chunk> getChunks() {
        return this.chunks.values();
    }

    public Chunk getChunk(int x, int z) {
        ChunkKey key = new ChunkKey(x, z);
        return this.chunks.get(key);
    }
}
