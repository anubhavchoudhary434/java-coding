package com.thirtydaysofcode.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Binary {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        String b=Integer.toBinaryString(n);
        System.out.println(b);
        String[] c=b.split("^[0]*$");
        System.out.println(c.length);
        System.out.println(c.toString());
        
        int max =0;
        if(c.length == 1) max = c[0].length();
        for(int i =0;i<c.length;i++)
        {
            if(i+1>=c.length) continue;
            if(c[i].length()>c[i+1].length())   
            {
                max=c[i].length();
            }
            else
            {
            	max=c[i+1].length();
            }
        }
        System.out.println(max);
    }
}

