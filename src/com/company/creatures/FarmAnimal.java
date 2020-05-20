package com.company.creatures;

public class FarmAnimal extends Animal implements Edible, Feedable {
    static final Double DEFAULT_FARM_FOOD_WEIGHT = 3.0;

    public FarmAnimal(String species) {
        super(species);
    }

    public FarmAnimal(String species, Double weight) {
        super(species);
        this.weight = weight;
    }

    @Override
    public void beEaten() {
        System.out.println("Bon appetit.");
        this.weight = 0.0;
    }

    @Override
    public void feed() {
        System.out.println("Feeding farm animal...");
        this.feed(DEFAULT_FARM_FOOD_WEIGHT);
        System.out.println("Farm animal fed");
    }
}
