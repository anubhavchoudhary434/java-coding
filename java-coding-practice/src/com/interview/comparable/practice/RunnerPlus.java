package com.interview.comparable.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerPlus {

	public static void main(String[] args) {
		
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell", 4, 800));
		laps.add(new Laptop("Apple", 8, 400));
		laps.add(new Laptop("Acer", 16, 500)); 
		laps.add(new Laptop("Acer", 16, 700));
		laps.add(new Laptop("Acer", 16, 400));
		laps.add(new Laptop("Apple", 12, 400));
		
		Collections.sort(laps);
		
		for(Laptop l : laps)
		{
			System.out.println(l);
		}	
	}

}
