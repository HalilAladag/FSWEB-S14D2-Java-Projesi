package com.workintech.models;

public class Ceiling {
    private int height;
    private Carpet.PaintColor paintedColor;

    public Ceiling(int height, Carpet.PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public Carpet.PaintColor getPaintedColor() {
        return paintedColor;
    }
    public void create() {
        System.out.println("Height:"+height+"Painted Color:"+paintedColor);
    }
}
