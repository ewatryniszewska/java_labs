package com.company.devices;

public class Diesel extends Car {
    public Diesel(String brand, Double engine, String model) {
        super(brand, engine, model);
    }

    public String toString() {
        return "Diesel car: " + this.brand + this.model + this.engine;
    }

    @Override
    public void refuel() {
        System.out.println("Diesel refueled!");
    }
}
