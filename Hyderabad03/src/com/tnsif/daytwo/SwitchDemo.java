package com.tnsif.daytwo;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char x = 'z';
		switch (x)//Possible DataTypes
		{
		case 'l' :
		case 'L' :
			System.out.println(x+" is a Letter");
			break;
		case 'd' :
		case 'D' :
			System.out.println(x+" is a Digit");
			break;
		case 'w' :
		case 'W' :
			System.out.println(x+" is a White space");
			break;
		case 's' :
		case 'S' :
			System.out.println(x+" is a Special Symbol");
		default:
			System.out.println(x+" is other than letter,digit,space or special symbol");
			break;
		
			}

	}

}
