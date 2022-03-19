package com.thirtydaysofcode.practice;

public class RecursionPractice {
	
	// factorial 5=5*4*3*2*1
	
	public static int factorial(int n)
	{
		if(n<=1) return 1;  // base case -- iteration ends here -- 1 is multiplicative identity
		// 5*factorail(4)
		// 5*4*factorial(3)
		// 5*4*3*factorial(2)
		// 5*4*3*2*factorial(1)
		// 5*4*3*2*1
		else return n*factorial(n-1);  // recursive case
	}
	
	// 5^3 = 5 * 5 * 5 = 125 -- a kind of multiplicative
	public static int power(int n,int p)
	{
		if(p<=0) return 1; // 1 is mult identity
		
		else return n * power(n,p-1);
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(power(5,3));

	}

}
