package com.company;

import java.io.File;

public class Animal {
    String name;
    final String species;
    private Double weight;
    File pic;

    static final Double DEFAULT_DOG_WEIGHT = 8.0;
    static final Double DEFAULT_LION_WEIGHT = 190.0;
    static final Double DEFAULT_MOUSE_WEIGHT = 0.05;

    public Animal(String species) {
        this.species = species;
        if(species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species == "lion"){
            this.weight = DEFAULT_LION_WEIGHT;
        } else if (species == "mouse"){
            this.weight = DEFAULT_MOUSE_WEIGHT;
        }
    }

    void feed() {
        if(weight > 0) {
            weight++;
            System.out.println("thanks, my weight is now " + weight);
        } else {
            System.out.println("You can't feed the dog. Dog'dead.");
        }
    }

    void takeAWalk(){
        if(weight > 0){
            weight--;
            System.out.println("Thanks for a walk");
        }else {
            System.out.println("Dog's dead - you can't go for a walk");
        }
    }
}
