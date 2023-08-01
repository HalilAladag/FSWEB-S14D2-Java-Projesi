package com.workintech.models;

public class Carpet {
    private int width,height;
    private PaintColor color;

    public enum PaintColor {
        GRAY,
    }

    public Carpet(int width, int height, PaintColor color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void setColor(PaintColor color) {
        this.color = color;
    }
    public void lying() {
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}

