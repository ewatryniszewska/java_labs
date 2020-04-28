package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable {
    public final String brand;
    public final String model;
    public String color;
    public Double price;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract String toString();

    public abstract void turnOn();

    public void sell() {
        System.out.println("You sold " + toString());
    }
}
