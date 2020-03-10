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
        } else if (species == "lion"){
            this.weight = 190.0;
        } else if (species == "mouse"){
            this.weight = 0.05;
        }
    }

    void feed() {
        weight++;
        System.out.println("thanks, my weight is now " + weight);
    }
}
