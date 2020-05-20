package com.company.devices;

public class Diesel extends Car {
    public Diesel(String brand, Double engine, String model, Integer yearOfProduction) {
        super(brand, engine, model, yearOfProduction);
    }

    public String toString() {
        return "Diesel car: " + this.brand + " " + this.model + " " + this.yearOfProduction;
    }

    @Override
    public void refuel() {
        System.out.println("Diesel refueled!");
    }
}
