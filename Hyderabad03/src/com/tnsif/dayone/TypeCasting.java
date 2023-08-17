package com.tnsif.dayone;

public class TypeCasting {

	public static void main(String[] args) {
    //implicit TypeCasting-------->widening
		byte b=10;
		int i=b;
		System.out.println(i);//10
		
		float f=22.5f;
		double d=f;
		System.out.println(d);//22.5
		
		char ch='A';
		int i2=ch;
		System.out.println(i2);//65
		
		char var1='\u00A7';
		int i3=var1;
		System.out.println(i3);//some symbol
		
		//Explicit type casting--------narrowing
		double f1=10.3f;
		int i5=(int)f1;
		System.out.println(i5);//compile time error
		
		long l1=7042710092l;
		int i4=(int)l1;
		System.out.println(i4);//compile time error
		
	}

}
