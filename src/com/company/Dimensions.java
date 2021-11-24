package com.company;

public class Dimensions {
    private int Height;
    private int Width;
    private int Depth;

    public Dimensions(int height, int width, int depth) {
        Height = height;
        Width = width;
        Depth = depth;
    }

    public int getHeight() {
        return Height;
    }

    public int getWidth() {
        return Width;
    }

    public int getDepth() {
        return Depth;
    }
}
