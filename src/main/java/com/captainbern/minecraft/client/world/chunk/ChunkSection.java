package com.captainbern.minecraft.client.world.chunk;

import com.captainbern.minecraft.client.util.NibbleArray;

public class ChunkSection {

    private char[] blocks;
    private NibbleArray skyLight;
    private NibbleArray blockLight;

    private int blockCount;

    public ChunkSection() {
        this.blocks = new char[ChunkImpl.SIZE];
        this.skyLight = new NibbleArray(ChunkImpl.SIZE);
        this.blockLight = new NibbleArray(ChunkImpl.SIZE);

        this.skyLight.fill((byte) 0x0f);
    }

    public void count() {
        this.blockCount = 0;
        for (char block : this.blocks) {
            if (block != 0)
                this.blockCount++;
        }
    }

    public int getBlockCount() {
        this.count();
        return this.blockCount;
    }

    public boolean isEmpty() {
        this.count();
        return this.getBlockCount() == 0;
    }

    public int getType(int x, int y, int z) {
        return this.blocks[toIndex(x, y, z)] & 0xFF;
    }

    public static int toIndex(int x, int y, int z) {
        return (((y & 0x0f) << 8) | (z << 4) | (x));
    }
}
