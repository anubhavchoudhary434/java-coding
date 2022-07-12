package com.interview.interfaceandabstract.practice;

public interface StudentService {
	
	
	public int sum(int a, int b);
	
	// static and default methods allowed in interface from java 8
	public static int avg(int a, int b)
	{
		int avg = (a + b)/2;
		return avg;
	}

}
