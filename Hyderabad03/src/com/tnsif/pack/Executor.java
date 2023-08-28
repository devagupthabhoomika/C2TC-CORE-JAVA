package com.tnsif.pack;

public class Executor {

	public static void main(String[] args) {
		Base b1 = new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		
		//b1.varPrivate can't access private data members
		b1.varDefault = 11;
		b1.methodDefault();
		
	}

}
