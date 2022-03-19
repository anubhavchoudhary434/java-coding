package com.thirtydaysofcode.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TwoDArray {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        
        
        Set<Integer> set = new TreeSet<>();
        
        for(int i=0;i<4;i++)
        {
        	for(int j=0;j<4;j++)
        	{
        		int sum = sumHologram(arr,i,j);
        		set.add(sum);
        	}
        }
        
        Integer[] sumArr = set.toArray( new Integer[set.size()] );
        
        System.out.println(sumArr[sumArr.length-1]);
        
        bufferedReader.close();
        
        
    }
	
	private static int sumHologram(List<List<Integer>> arr,int i,int j)
	{
		int sum = 0;
		int k = i;
		int l = j;
		while(k<i+3)
		{
			while(l<j+3)
			{
				if(k==i+1 && l==j+1)
				{
					sum = sum + arr.get(i+1).get(j+1);
				}
				else if(k!=i+1)
				{
					sum = sum + arr.get(k).get(l);
				}
				l++;
			}
			k++;
			l=j;
		}
		return sum;
	}

}
