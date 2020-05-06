package com.company;

import com.company.creatures.Human;

public interface Saleable {
    void sell(Human buyer, Human seller, Double price);
}
