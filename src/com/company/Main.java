package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
	    dog.name = "Akita";

	    Animal lion = new Animal("lion");
	    lion.name = "Leo";

	    Human me = new Human();
	    me.firstName = "Ewa";
	    me.lastName = "Tryniszewska";
	    me.pet = new Animal("lion");

	    me.pet.feed();

		me.pet = dog;
		me.pet.feed();
		me.pet.takeAWalk();
		me.pet.takeAWalk();
		me.pet.takeAWalk();
		me.pet.feed();
		me.pet.feed();
		me.pet.takeAWalk();
		me.pet.takeAWalk();
		me.pet.takeAWalk();
		me.pet.takeAWalk();
		me.pet.takeAWalk();
		me.pet.takeAWalk();
		me.pet.takeAWalk();
		me.pet.takeAWalk();
		me.pet.takeAWalk();






		System.out.println(me.pet.name);


    }
}
