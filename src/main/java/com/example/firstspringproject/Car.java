package com.example.firstspringproject;

public class Car {
   private String manufacturName;
   private int numberOfWheels;
   private boolean plakette;

    public Car(String manufacturName, int numberOfWheels, boolean plakette) {
        this.manufacturName = manufacturName;
        this.numberOfWheels = numberOfWheels;
        this.plakette = plakette;
    }

    public String getManufacturName() {
        return manufacturName;
    }

    public void setManufacturName(String manufacturName) {
        this.manufacturName = manufacturName;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isPlakette() {
        return plakette;
    }

    public void setPlakette(boolean plakette) {
        this.plakette = plakette;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturName='" + manufacturName + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", plakette=" + plakette +
                '}';
    }
}
