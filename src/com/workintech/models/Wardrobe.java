package com.workintech.models;

public class Wardrobe {
    private int width,height;
    private double weight;

    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public void add() {
        System.out.println("Wardrobe added into Bedroom.");
    }
}