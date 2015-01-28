package com.captainbern.minecraft.client.world.chunk;

import com.captainbern.minecraft.client.world.BiomeGrid;
import com.captainbern.minecraft.client.world.World;
import com.captainbern.minecraft.client.world.block.BlockImpl;
import com.captainbern.minecraft.game.BlockVector;

public class ChunkImpl implements Chunk {

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

    private BiomeGrid biomeGrid;

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

    @Override
    public BlockImpl getBlock(int x, int y, int z) {
        return new BlockImpl(this, (this.x << 4) | (x & 0xf), y & 0xff, (this.z << 4) | (z & 0xf));
    }

    public ChunkSection getSectionAt(int y) {
        return this.chunkSections[y << 4];
    }

    public int getTypeIdAt(int x, int y, int z) {
        ChunkSection section = this.getSectionAt(y);
        if (section != null)
            return section.getType(x, y, z) ;
        return 0;
    }

    public void setTypeIdAt(int x, int y, int z, int typeId) {
        ChunkSection section = getSectionAt(y);

        if (section != null) {
            section.setType(x, y, z, typeId);
        } else {
            // TODO: throw exception
        }
    }

    public void unload() {
        this.chunkSections = null;
        this.biomeGrid = null;
        this.heightMap = null;
    }
}
