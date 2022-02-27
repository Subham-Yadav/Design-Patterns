package com.toy;


public class ToyFactory {
	public ToyAnimal getInstance(String animal) {
		if(animal.equalsIgnoreCase("Dog")) {
			return new Dog();
		} else if (animal.equalsIgnoreCase("Cat")) {
			return new Cat();
		} else if(animal.equalsIgnoreCase("Lion")) {
			return new Lion();
		} else {
			return new Fault();
		}
	}
}
