package com.captainbern.minecraft.client.world;

import com.captainbern.minecraft.client.Client;
import com.captainbern.minecraft.client.world.chunk.Chunk;
import com.captainbern.minecraft.client.world.chunk.ChunkManager;
import com.captainbern.minecraft.game.Difficulty;
import com.captainbern.minecraft.net.packet.play.server.PacketChunkData;
import com.captainbern.minecraft.net.packet.play.server.PacketMapChunkBulk;

import java.util.List;

public class WorldImpl implements World {

    private final Client client;

    private ChunkManager chunkManager;

    private Dimension dimension;

    private WorldType worldType;

    private Difficulty difficulty;

    private long worldTime;

    private long worldAge;

    private int height;

    public WorldImpl(Client client, Dimension dimension, WorldType worldType, Difficulty difficulty) {
        this.client = client;
        this.chunkManager = new ChunkManager(this);
        this.dimension = dimension;
        this.worldType = worldType;
        this.difficulty = difficulty;
    }

    public Client getClient() {
        return this.client;
    }

    @Override
    public Dimension getDimension() {
        return this.dimension;
    }

    @Override
    public WorldType getWorldType() {
        return this.worldType;
    }

    @Override
    public List<Chunk> getChunks() {
        return null;
    }

    @Override
    public long getWorldTime() {
        return this.worldTime;
    }

    @Override
    public long getWorldAge() {
        return this.worldAge;
    }

    @Override
    public int getMaxHeight() {
        return this.height;
    }

    public void load(PacketMapChunkBulk chunkBulk) {
        for (PacketChunkData chunkData : chunkBulk.getChunkData()) {
            this.load(chunkData, chunkBulk.hasSkylight());
        }
    }

    public void load(PacketChunkData chunkData, boolean hasSkyLight) {
        // TODO: load it :o
    }
}
