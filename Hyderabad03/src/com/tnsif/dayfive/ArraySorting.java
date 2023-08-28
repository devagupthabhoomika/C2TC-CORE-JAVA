package com.tnsif.dayfive;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
	
		int[] arr= {15,89,45,15,75,25,35,11,10,9};
		System.out.println("Entered Array is =");
		
		for(int num:arr)
		{
			System.out.println(num+" ");
		}
		Arrays.sort(arr);

System.out.println("Here is your sorted Array is =");
		
		for(int num:arr)
		{
			System.out.println(num+" ");
		}
		
		System.out.println("Length of the array arr is ="+arr.length);
	}

}
