package com.thirtydaysofcode.practice;

public class PallindromeTwoPointerTechnique {

	public static void main(String[] args) {
		
		System.out.println(checkPallindrome("abbc"));
		System.out.println(reverseString("Anamika"));
		System.out.println(reverseWords("I Love Program Very much"));

	}
	
	public static boolean checkPallindrome(String str)
	{
		int i=0;
		int j=str.length()-1;
		
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static String reverseString(String str)
	{
		String revStr = "";
		for(int j = str.length()-1;j>=0;j--)
		{
			revStr = revStr + str.charAt(j);
		}
		return revStr;
	}
	
	public static String reverseWords(String str)
	{
		String [] strArr = str.split(" ");
		
		String revWords = "";
		for(int j = strArr.length-1;j>=0;j--)
		{
			revWords = revWords + " " + strArr[j];
		}
		return revWords;

		
	}

}
