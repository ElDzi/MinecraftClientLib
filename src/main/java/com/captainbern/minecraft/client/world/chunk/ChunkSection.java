package com.captainbern.minecraft.client.world.chunk;

import com.captainbern.minecraft.client.util.NibbleArray;

public class ChunkSection {

    /**
     * Blocks bitmask:
     *
     * FFF0 = id
     * 000F = metadata
     *
     * 12 bits -> ID
     * 4 bits -> meta
     * -> 16 bits total
     */
    private char[] blocks;
    private NibbleArray skyLight;
    private NibbleArray blockLight;

    public ChunkSection() {
        this.blocks = new char[Chunk.SIZE];
        this.skyLight = new NibbleArray(Chunk.SIZE);
        this.blockLight = new NibbleArray(Chunk.SIZE);

        this.skyLight.fill((byte) 0x0f);
    }

    public int getType(int x, int y, int z) {
        return this.blocks[toIndex(x, y, z)] >> 4;
    }

    public void setType(int x, int y, int z, int type) {
        this.blocks[toIndex(x, y, z)] = (char) (type << 4);
    }

    public int getMetadata(int x, int y, int z) {
        return this.blocks[toIndex(x, y, z)] & 0xf;
    }

    public void setMetadata(int x, int y, int z, int metadata) {
        int type = getType(x, y, z);
        if (type == 0)
            return;
        this.blocks[toIndex(x, y, z)] = (char) ((type & 0xfff0) | (metadata));
    }

    public byte getSkyLight(int x, int y, int z) {
        return this.skyLight.get(toIndex(x, y, z));
    }

    public void setSkyLight(int x, int y, int z, int lightLevel) {
        this.skyLight.insert(toIndex(x, y, z), (byte) lightLevel);
    }

    public byte getBlockLight(int x, int y, int z) {
        return this.blockLight.get(toIndex(x, y, z));
    }

    public void setBlockLight(int x, int y, int z, int lightLevel) {
        this.blockLight.insert(toIndex(x, y, z), (byte) lightLevel);
    }

    public static int toIndex(int x, int y, int z) {
        return (((y & 0x0f) << 8) | (z << 4) | (x));
    }
}
