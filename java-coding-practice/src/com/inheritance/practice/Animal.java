package com.inheritance.practice;

public class Animal {

	private String color;
	private String Weight;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String color, String weight) {
		super();
		this.color = color;
		Weight = weight;
	}
	
	public String getWeight()
	{
		return this.Weight;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	protected void eat()
	{
		System.out.println("Animal is eating");
	}

}
