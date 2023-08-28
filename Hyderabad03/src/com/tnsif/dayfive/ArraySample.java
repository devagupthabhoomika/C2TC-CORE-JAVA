package com.tnsif.dayfive;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
	int size;
	System.out.println("Enter thensize of the Array=");
	
	Scanner s=new Scanner(System.in);
	size=s.nextInt();
	
	int[] arr=new int[100];
	System.out.println("Enter the element of the Array=");
	
	for(int i=0; i<size;i++)
	{
		arr[i]=s.nextInt();//Take input from the user
	}
	System.out.println("Here is the Array:");
	for(int i=0;i<size;i++)
	{
System.out.println(arr[i]);
	}

}
}
