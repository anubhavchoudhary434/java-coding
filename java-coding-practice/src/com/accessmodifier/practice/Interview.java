package com.accessmodifier.practice;

import java.util.ArrayList;
import java.util.List;

public class Interview {

	public static void main(String[] args) {
		int[] intArr = new int[] { 1, 5, 8, 3 };
		int targetSum = 11;
		getPair(intArr, targetSum);
	}

	public static void getPair(int[] intArr, int targetSum) {
		int secNum = 0;
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		for (int i = 0; i < intArr.length - 1; i++) {
			secNum = targetSum - intArr[i];
			
			list.add(intArr[i]);
			list2.add(secNum);

			//boolean flag = list.contains(secNum);

		}
		list2.
	}
	

}
