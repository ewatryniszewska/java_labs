package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable, Comparable<Device> {
    public final String brand;
    public final String model;
    public final Integer yearOfProduction;
    public String color;
    public Double price;

    public Device(String brand, String model, Integer yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract String toString();

    public abstract void turnOn();

    @Override
    public int compareTo(Device o) {
        return this.yearOfProduction - o.yearOfProduction;
    }
}
