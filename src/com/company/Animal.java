package com.company;

import java.io.File;

public class Animal {
    String name;
    final String species;
    private Double weight;
    File pic;

    static final Double DEFAULT_DOG_WEIGHT = 8.0;

    public Animal(String species) {
        this.species = species;
        if(species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        }
    }

    void feed() {
        weight++;
        System.out.println("thanks, my weight is now " + weight);
    }
}
