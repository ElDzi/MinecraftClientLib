package com.captainbern.minecraft.client.world.block;

import com.captainbern.minecraft.client.world.Location;

public class Block {

    private Location location;
    private int id;
    private int metadata;

    public Block(Location location, int id, int metadata) {
        this.location = location;
        this.id = id;
        this.metadata = metadata;
    }

    public Location getLocation() {
        return this.location;
    }

    public int getId() {
        return this.id;
    }

    public int getMetadata() {
        return this.metadata;
    }
}
