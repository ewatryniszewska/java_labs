package com.company.devices;

public class Electric extends Car {
    public Electric(String brand, Double engine, String model, Integer yearOfProduction) {
        super(brand, engine, model, yearOfProduction);
    }

    public String toString() {
        return "Electric car: " + this.brand + " " + this.model + " " + this.yearOfProduction;
    }

    @Override
    public void refuel() {
        System.out.println("Charging done!");
    }
}
