package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Pet("dog");
        dog.name = "Akita";

        Animal chicken = new FarmAnimal("chicken");
        chicken.name = "Koko";

        Human me = new Human();

        me.firstName = "Ewa";
        me.lastName = "Tryniszewska";
        me.pet = new FarmAnimal("chicken");

        me.pet = dog;
        me.pet.feed();
        me.pet.takeAWalk();

        Car myCar = new Car("Opel", 1000.0, "Astra");
        myCar.registrationNumber = "GD9785";
        myCar.color = "Red";
        myCar.price = 1500.0;

        me.setCar(myCar);

        Human myHusband = new Human();
        myHusband.firstName = "Imie meza";
        myHusband.lastName = "Nazwisko meza";
        myHusband.setCar(myCar);

        System.out.println(me);
        System.out.println(myHusband);
        System.out.println(dog);
        System.out.println(myCar);

        Human person = new Human();
        person.firstName = "Buyer";
        me.pet.sell(person, me, 600.0);
        person.pet.sell(person, me, 600.0);
        me.sell(person, me, 1500.0);

        me.phone = new Phone("Samsung", "Galaxy");
        me.phone.sell(person, me, 1500.0);

        myHusband.getCar().sell(person, myHusband, 800.0);
        person.getCar().sell(person, myHusband, 800.0);

        person.beEaten();
        person.pet.beEaten();
        chicken.beEaten();
    }
}
