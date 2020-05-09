package com.company.devices;

public class LPG extends Car {
    public LPG(String brand, Double engine, String model) {
        super(brand, engine, model);
    }

    public String toString() {
        return "LPG car: " + this.brand + this.model + this.engine;
    }

    @Override
    public void refuel() {
        System.out.println("LPG refueled!");
    }
}
