package com.workintech.models;

public class Lamp {
    private enum LampType {
        STYLE,
    }
    private boolean battery;
    private int globRating;
    private LampType lampType;

    public Lamp(boolean battery, int globRating, LampType lampType) {
        this.battery = battery;
        this.globRating = globRating;
        this.lampType = lampType;
    }

    public void turnOn () {
        System.out.println("Lamp is being turned on.");
    }
    public LampType getStyle () {
        return LampType.STYLE;
    }
    public boolean isBattery (){
        return battery;
    }
    public int getGlobRating () {
        return globRating;
    }
}
