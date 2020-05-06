package com.company.creatures;

import com.company.Saleable;

import java.io.File;
import java.util.Objects;

public abstract class Animal implements Edible, Saleable {
    public String name;
    public final String species;
    private Double weight;
    public File pic;

    static final Double DEFAULT_DOG_WEIGHT = 8.0;
    static final Double DEFAULT_CHICKEN_WEIGHT = 5.0;
    static final Double DEFAULT_MOUSE_WEIGHT = 0.05;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "chicken":
                this.weight = DEFAULT_CHICKEN_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
        }
    }

    public void feed() {
        if (this.weight > 0) {
            this.weight++;
            System.out.println("Thanks, my weight is now " + this.weight);
        } else {
            System.out.println("You can't feed me. I'm dead.");
        }
    }

    public void takeAWalk() {
        if (this.weight > 0) {
            this.weight--;
            System.out.println("Thanks for a walk");
        } else {
            System.out.println("I'm dead - you can't go for a walk with me");
        }
    }

    public String toString() {
        return "Animal " + this.name + " " + this.species + " " + this.weight;
    }

    @Override
    public void beEaten() {
        if (this instanceof Human || this instanceof Pet) {
            System.out.println("You can't eat me.");
        } else {
            System.out.println("Bon appetit.");
            this.weight = 0.0;
        }
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (buyer.getCash() >= price && Objects.nonNull(seller.pet)) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Buyer bought a pet: " + buyer.pet + ". Buyer now has " + buyer.getCash());
            System.out.println("Seller sold a pet, and have nothing: " + seller.pet +
                    ". Seller now has " + seller.getCash());
        } else {
            System.out.println("Seller can't sell a pet and buyer can't buy.");
        }
    }
}
