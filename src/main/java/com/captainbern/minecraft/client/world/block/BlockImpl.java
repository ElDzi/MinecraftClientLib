package com.captainbern.minecraft.client.world.block;

import com.captainbern.minecraft.client.world.World;
import com.captainbern.minecraft.client.world.chunk.Chunk;
import com.captainbern.minecraft.game.BlockVector;

public class BlockImpl implements Block {

    private final Chunk chunk;
    private final int x;
    private final int y;
    private final int z;

    public BlockImpl(Chunk chunk, int x, int y, int z) {
        this.chunk = chunk;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public World getWorld() {
        return this.chunk.getWorld();
    }

    @Override
    public Chunk getChunk() {
        return this.chunk;
    }

    @Override
    public BlockVector getLocation() {
        return new BlockVector(this.x, this.y, this.z);
    }

    @Override
    public int getType() {
        return 0;
    }

    @Override
    public byte getData() {
        return 0;
    }

    @Override
    public void setType(int id) {

    }

    @Override
    public void setData(byte data) {

    }

    @Override
    public void setTypeAndData(int id, byte data) {

    }
}
