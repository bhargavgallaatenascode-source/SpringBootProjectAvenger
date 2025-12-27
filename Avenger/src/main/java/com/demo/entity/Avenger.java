package com.demo.entity;

public class Avenger {

    private int avengerId;
    private String avengerName;
    private String power;
    private double strengthLevel;

    public Avenger() {
        // Default constructor
    }

    public Avenger(int avengerId, String avengerName, String power, double strengthLevel) {
        this.avengerId = avengerId;
        this.avengerName = avengerName;
        this.power = power;
        this.strengthLevel = strengthLevel;
    }

    public int getAvengerId() {
        return avengerId;
    }

    public void setAvengerId(int avengerId) {
        this.avengerId = avengerId;
    }

    public String getAvengerName() {
        return avengerName;
    }

    public void setAvengerName(String avengerName) {
        this.avengerName = avengerName;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public double getStrengthLevel() {
        return strengthLevel;
    }

    public void setStrengthLevel(double strengthLevel) {
        this.strengthLevel = strengthLevel;
    }

    @Override
    public String toString() {
        return "Avenger [ID=" + avengerId + ", Name=" + avengerName +
               ", Power=" + power + ", Strength=" + strengthLevel + "]";
    }
}
