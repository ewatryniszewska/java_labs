package com.company.devices;

public class Electric extends Car {
    public Electric(String brand, Double engine, String model) {
        super(brand, engine, model);
    }

    public String toString() {
        return "Electric car: " + this.brand + this.model + this.engine;
    }

    @Override
    public void refuel() {
        System.out.println("Charging done!");
    }
}
