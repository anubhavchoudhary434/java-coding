package com.interview.comparable.practice;

public class LaptopPlus implements Comparable<LaptopPlus>{

	private String brand;
	private Integer ram;   // Integer implements comparable but int not
	private Integer price;
	
	
	public LaptopPlus(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}

	

	public Integer getRam() {
		return ram;
	}


	public void setRam(Integer ram) {
		this.ram = ram;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	
	// if ram are equal then sort acc to price --> issue in this code? couldnot sort acc to price in case ram is equal
	@Override
	public int compareTo(LaptopPlus lap2) {
		
		if(this.getRam()-lap2.getRam() !=0) return this.getRam() -lap2.getRam();
		else return this.getPrice() - lap2.getPrice();
	}

}
