package com.interview.interfaceandabstract.practice;

public interface StudentService {
	
	
	public int sum(int a, int b);
	
	public static int avg(int a, int b)
	{
		int avg = (a + b)/2;
		return avg;
	}

}
