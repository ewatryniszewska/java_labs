package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device {
    public final Double engine;

    public String registrationNumber;

    public Car(String brand, Double engine, String model, Integer yearOfProduction) {
        super(brand, model, yearOfProduction);
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

    public void sell(Human buyer, Human seller, Double price) throws Exception {
        Integer carsPlace = seller.carsPlaceInGarage(this);
        Integer emptyPlace = buyer.firstEmptyPlace();

        if (carsPlace == null) {
            throw new Exception("Seller doesn't have this car for sale.");
        }

        if (emptyPlace == null) {
            throw new Exception("Buyer has no place for the car.");
        }

        if (buyer.getCash() < price) {
            throw new Exception("Buyer has not enough money.");
        }

        seller.setCar(null, carsPlace);
        buyer.setCar(this, emptyPlace);

        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);

        System.out.println("Transaction successfully completed.");
    }

    public abstract void refuel();
}
