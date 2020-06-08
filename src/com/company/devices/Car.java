package com.company.devices;

import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {
    public final Double engine;

    public List<Human> owners = new ArrayList<>();

    public String registrationNumber;

    public Car(String brand, Double engine, String model, Integer yearOfProduction) {
        super(brand, model, yearOfProduction);
        this.engine = engine;
    }

    public String toString() {
        return "Car " + this.brand + " " + this.model + " " + this.engine + " "
                + this.registrationNumber + " " + this.color;
    }

    public void addOwner(Human owner) {
        owners.add(owner);
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

        if (owners.get(owners.size() - 1) != seller) {
            throw new Exception("Seller isn't owner of this car.");
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
        System.out.println("Owners after transaction: " + owners);
    }

    public void ownerOnAList(Human human) {
        if (owners.contains(human)) {
            System.out.println("This human is on the list with owner of this car.");
        } else {
            System.out.println("This human isn't on the list yet.");
        }
    }

    public void soldACar(Human seller, Human buyer) {
        for (int i = 0; i < owners.size() - 1; i++) {
            if (owners.get(i) == seller && owners.get(i + 1) == buyer) {
                System.out.println(seller + " sold this car to " + buyer);
                return;
            }
        }
        System.out.println(seller + " did not sell this car to " + buyer);
    }

    public Integer numberOfTransaction() {
        return owners.size() > 0 ? owners.size() - 1 : 0;
    }

    public abstract void refuel();
}
