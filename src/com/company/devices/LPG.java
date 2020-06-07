package com.company.devices;

public class LPG extends Car {
    public LPG(String brand, Double engine, String model, Integer yearOfProduction) {
        super(brand, engine, model, yearOfProduction);
    }

    public String toString() {
        return "LPG car: " + this.brand + " " + this.model + " " + this.yearOfProduction;
    }

    @Override
    public void refuel() {
        System.out.println("LPG refueled!");
    }
}
