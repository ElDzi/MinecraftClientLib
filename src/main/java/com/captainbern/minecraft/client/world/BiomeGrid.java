package com.captainbern.minecraft.client.world;

import com.captainbern.minecraft.client.world.chunk.Chunk;

public class BiomeGrid {

    private final byte[] biomes = new byte[256];

    public BiomeGrid() {}

    public void setBiome(int x, int z, Biome biome) {
        this.biomes[z * Chunk.WIDTH + x] = ((byte) biome.getId());
    }

    public Biome get(int x, int z) {
        return Biome.getById(this.biomes[z * Chunk.WIDTH + x] & 0xFF);
    }
}
