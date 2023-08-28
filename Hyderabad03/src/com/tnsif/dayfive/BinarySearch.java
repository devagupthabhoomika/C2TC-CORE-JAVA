package com.tnsif.dayfive;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int size;
		System.out.println("Enter the size of the array=");
		
		Scanner s=new Scanner(System.in);
		size = s.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the element of the array=");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();//Take input from the user
		}
		
		System.out.println("Here is the Array :");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		//sort
		Arrays.sort(arr);
		
		System.out.println("Enter the key=");
		int key=s.nextInt();
		
		System.out.println(key+"found at index="+Arrays.binarySearch(arr,key));
	}
}


