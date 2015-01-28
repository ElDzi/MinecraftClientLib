package com.captainbern.minecraft.client.world.block;

import com.captainbern.minecraft.client.world.World;
import com.captainbern.minecraft.client.world.chunk.Chunk;
import com.captainbern.minecraft.game.BlockVector;

public interface Block {

    /**
     * TODO:
     *  - Add getRelativeBlock() methods
     *  - Add getBiome() method
     *  - getMaterial() (?)
     *  - break() (?)
     *  - getDurability() (<- used to calculate how long we need to mine this block)
     */

    public World getWorld();

    public Chunk getChunk();

    public BlockVector getLocation();

    public int getType();

    public byte getData();

    public void setType(int id);

    public void setData(byte data);

    public void setTypeAndData(int id, byte data);
}
