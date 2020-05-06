package com.company.devices;

import com.company.Human;

import java.util.Objects;

public class Car extends Device {
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

    @Override
    public void turnOn() {
        System.out.println("Engine turned on.");
    }

    public void sell(Human buyer, Human seller, Double price) {
        if (buyer.getCash() >= price && Objects.nonNull(seller.getCar())) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.setCar(seller.getCar());
            seller.setCar(null);
            System.out.println("Buyer bought a: " + buyer.getCar() + ". Buyer now has " + buyer.getCash());
            System.out.println("Seller sold a car, and have nothing: " + seller.getCar() +
                    ". Seller now has " + seller.getCash());
        } else {
            System.out.println("Seller can't sell a car, buyer can't buy.");
        }
    }
}
