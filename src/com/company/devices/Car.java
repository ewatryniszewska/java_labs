package com.company.devices;

public class Car extends Device{
    public final Double engine;

    public String registrationNumber;

    public Car(String brand, Double engine, String model) {
        super(brand, model);
        this.engine = engine;
    }

    public String toString() {
        return "Car " + this.brand + " " + this.model + " " + this.engine + " "
                + this.registrationNumber + " " + this.color;
    }
}
