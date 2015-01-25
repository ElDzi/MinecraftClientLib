package com.captainbern.minecraft.client.world;

import com.google.common.collect.Maps;

import java.util.Map;

public enum WorldType {

    DEFAULT("DEFAULT"),
    FLAT("FLAT"),
    LARGE_BIOMES("LARGEBIOMES"),
    AMPLIFIED("AMPLIFIED"),
    DEFAULT_1_1("DEFAULT_1_1");

    private final String worldType;

    private static final Map<String, WorldType> BY_NAME = Maps.newHashMap();
    static {
        for (WorldType worldType : WorldType.values()) {
            BY_NAME.put(worldType.getName(), worldType);
        }
    }

    private WorldType(String worldType) {
        this.worldType = worldType;
    }

    public String getName() {
        return this.worldType;
    }

    public static WorldType getByName(String name) {
        return BY_NAME.get(name.toUpperCase());
    }
}
