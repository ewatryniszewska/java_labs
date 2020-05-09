package com.company.creatures;

public class Pet extends Animal implements Feedable {
    static final Double DEFAULT_PET_FOOD_WEIGHT = 0.5;

    public Pet(String species) {
        super(species);
    }

    @Override
    public void feed() {
        System.out.println("Feeding pet...");
        this.feed(DEFAULT_PET_FOOD_WEIGHT);
        System.out.println("Pet fed");
    }
}
