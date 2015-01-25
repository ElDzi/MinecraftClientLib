package com.captainbern.minecraft.client.world;

import com.google.common.collect.Maps;

import java.util.Map;

public enum Dimension {

    NETHER(-1),
    OVERWORLD(0),
    END(1);

    private final int id;

    private static final Map<Integer, Dimension> BY_ID = Maps.newHashMap();
    static {
        for (Dimension dimension : Dimension.values()) {
            BY_ID.put(dimension.getId(), dimension);
        }
    }

    private Dimension(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Dimension getById(int id) {
        return BY_ID.get(id);
    }
}
