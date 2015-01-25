package com.captainbern.minecraft.client.util;

import java.util.Arrays;

public class NibbleArray {

    private byte[] data;

    public NibbleArray(int initSize) {
        if (initSize < 0 || initSize % 2 != 0)
            throw new IllegalArgumentException("NibbleArray size must be a positive, even number!");

        this.data = new byte[initSize >> 1];
    }

    public byte[] getNibble() {
        return this.data;
    }

    public int getSize() {
        return this.data.length << 1;
    }

    public void insert(int x, int y, int z, byte value) {
        this.insert(toKey(x, y, z), value);
    }

    public void insert(int key, byte value) {
        int index = key >> 1;
        int previous = key & 0x01;

        if (previous == 0) {
            this.data[index] = (byte) ((previous & 0xf0) | value);
        } else {
            this.data[index] = (byte) ((previous & 0x0f) | (value << 4));
        }
    }

    public byte get(int x, int y, int z) {
        return this.get(toKey(x, y, z));
    }

    public byte get(int key) {
        int index = key >> 1;
        int previous = key & 0x01;

        if (previous == 0) {
            return (byte) (this.data[index] & 0x0f);
        } else {
            return (byte) (this.data[index] >> 4 & 0x0f);
        }
    }

    public void fill(byte data) {
        data &= 0xf;
        Arrays.fill(this.data, (byte) ((data << 4) | data));
    }

    public static int toKey(int x, int y, int z) {
        return (((y & 0x0f) << 8) | (z << 4) | (x));
    }
}
