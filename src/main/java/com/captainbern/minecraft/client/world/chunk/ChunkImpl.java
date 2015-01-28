package com.captainbern.minecraft.client.world.chunk;

import com.captainbern.minecraft.client.world.BiomeGrid;
import com.captainbern.minecraft.client.world.World;
import com.captainbern.minecraft.client.world.block.BlockImpl;
import com.captainbern.minecraft.game.BlockVector;

public class ChunkImpl implements Chunk {

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
