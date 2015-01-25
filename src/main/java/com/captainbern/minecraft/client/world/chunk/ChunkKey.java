package com.captainbern.minecraft.client.world.chunk;

import com.captainbern.minecraft.game.BlockVector;

public class ChunkKey {

    private int x;
    private int z;

    public ChunkKey(BlockVector blockVector) {
        this(blockVector.getX() >> 4, blockVector.getZ() >> 4);
    }

    public ChunkKey(int x, int z) {
        this.x = x;
        this.z = z;
    }

    public int getX() {
        return this.x;
    }

    public int getZ() {
        return this.z;
    }

    @Override
    public String toString() {
        return "ChunkKey{x=" + this.x + ", z=" + this.z + "}";
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 31 * hash + this.x;
        hash = 31 * hash + this.z;
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ChunkKey))
            return false;

        if (other == this)
            return true;

        ChunkKey chunkKey = ((ChunkKey) other);

        return chunkKey.getX() == this.x && chunkKey.getZ() == this.z;
    }
}
