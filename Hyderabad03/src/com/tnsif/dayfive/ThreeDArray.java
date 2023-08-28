package com.tnsif.dayfive;

public class ThreeDArray {

	public static void main(String[] args) {
		
		int[][][]x= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		
		System.out.println(x[0][1][2]);//60
		
		System.out.println(x[1][0][1]);//80
		
		System.out.println(x[1][2][0]);
		
		System.out.println(x[1][1][1]);
		
		System.out.println(x[2][1][0]);
		

	}

}
