package com.company.devices;

import com.company.creatures.Human;

import java.util.Objects;

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

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if ((buyer.getCash() >= price) && Objects.nonNull(seller.phone)) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println("Buyer bought a phone: " + buyer.phone + ". Buyer now has " + buyer.getCash());
            System.out.println("Seller sold a phone, and have nothing: " + seller.phone +
                    ". Seller now has " + seller.getCash());
        } else {
            System.out.println("Seller can't sell a phone and buyer can't buy.");
        }
    }
}
