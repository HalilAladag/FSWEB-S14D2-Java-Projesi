package com.workintech.models;

public class Bedroom {
    private String name;
    private Wall wall1,wall2,wall3,wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }
    public void addWall(Wall wall) {
        if (wall1 == null) {
            wall1 = wall;
        }else if (wall2 == null) {
            wall2 = wall;
        }else if (wall3 == null) {
            wall3 = wall;
        }else if (wall4 == null) {
            wall4 = wall;
        }
    }
    public void removeWall(Wall wall) {
        if (wall1 == wall) {
            wall1 = null;
        } else if (wall2 == wall) {
            wall2 = null;
        } else if (wall3 == wall) {
            wall3 = null;
        } else if (wall4 == wall) {
            wall4 = null;
        }
    }
}

