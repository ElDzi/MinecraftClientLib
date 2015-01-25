package com.captainbern.minecraft.client.world.chunk;

import com.captainbern.minecraft.client.world.World;
import com.captainbern.minecraft.game.BlockVector;

public class ChunkImpl implements Chunk {

    public static final int WIDTH = 16;
    public static final int HEIGHT = 16;
    public static final int DEPTH = 256;

    private static final int SECTION_DEPTH = 16;

    public static final int SIZE = WIDTH * HEIGHT * SECTION_DEPTH;

    public static int locToIndex(int x, int y, int z) {
        return ((x << 12) | (z << 8) | (y));
    }

    public static BlockVector indexToLoc(int index) {
        int x = index >> 12 & 0xF;
        int y = index >> 8 & 0xF;
        int z = index & 0xFF;

        return new BlockVector(x, y, z);
    }

    /**
     * Actual Chunk code
     */

    private final World world;

    private final int x;

    private final int z;

    private ChunkSection[] chunkSections;

    private byte[] heightMap;

    private byte[] biomes;

    public ChunkImpl(World world, int x, int z) {
        this.world = world;
        this.x = x;
        this.z = z;
    }

    @Override
    public World getWorld() {
        return this.world;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getZ() {
        return this.z;
    }

    public ChunkSection SectionAt(int y) {
        return this.chunkSections[y << 4];
    }

    public void unload() {
        this.chunkSections = null;
        this.biomes = null;
        this.heightMap = null;
    }
}
