package com.inheritance.practice;

public class DriverClass {

	public static void main(String[] args) {
		
		Animal theAnimal = new Animal();
		
		Animal theAnimal2 = new Animal("black", "50kg");
		
		Animal theAnimal3 = new Dog();
		
		Dog theDog = new Dog();
		
		//Dog theDog2 = new Animal();  not possible
		
		theAnimal.eat();
		System.out.println(theAnimal2.getColor());
		
		theAnimal3.eat();
		//theAnimal3.bark(); wrong
		
		theDog.eat();
		theDog.bark();

	}

}
