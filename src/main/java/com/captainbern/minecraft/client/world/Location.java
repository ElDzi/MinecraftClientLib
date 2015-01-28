package com.captainbern.minecraft.client.world;

public class Location {

    /**
     * TODO:
     *  - Add getBlock() method
     *  - Add getBlockX(), getBlockY() and getBlockZ() methods
     *  - Some math methods
     */

    private double x;
    private double y;
    private double z;

    private float pitch;
    private float yaw;

    public World world;

    public Location(World world, int x, int y, int z) {
        this(world, ((double) x), ((double) y), ((double) z), 0, 0);
    }

    public Location(World world, double x, double y, double z, float pitch, float yaw) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
        this.pitch = pitch;
        this.yaw = yaw;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public float getPitch() {
        return this.pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }

    public float getYaw() {
        return this.yaw;
    }

    public void setYaw(float yaw) {
        this.yaw = yaw;
    }

    public World getWorld() {
        return this.world;
    }
}
