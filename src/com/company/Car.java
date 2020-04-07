package com.company;

public class Car {
    public final String brand;
    public final Double engine;
    public final String model;

    public String color;
    public String registrationNumber;
    public Double price = 2500.0;

    public Car(String brand, Double engine, String model) {
        this.brand = brand;
        this.engine = engine;
        this.model = model;
    }

    public String toString() {
        return "Car " + this.brand + " " + this.model + " " + this.engine + " "
                + this.registrationNumber + " " + this.color;
    }
}
