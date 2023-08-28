package com.tnsif.dayfour;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args)
	{//	METHOD 1
		Person p1 = new Person();
		System.out.println("Enter person details =");
		
		Scanner sc=new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		String city = sc.next();
		
		
//		p1.setPersonName(name);
//		p1.setPersonAge(age);
//		p1.setPersonCity(city);
//				
//		System.out.println(p1.getpersonName());
//		System.out.println(p1.getPersonAge());
//		System.out.println(p1.getPersonCity());
		
		
		//METHOD 2 USING CONSTRUCTORS
		p1 = new Person(name,age,city);
		 System.out.println(p1.getpersonName());
			System.out.println(p1.getPersonAge());
			System.out.println(p1.getPersonCity());
			System.out.println("Parameterized constructor executed");
			sc.close();
		
		
		
		
		
		
		
	}

}
