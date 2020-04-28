package com.company.devices;

public class Phone extends Device {
    public Phone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String toString() {
        return "Phone" + this.brand + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is on.");
    }
}
