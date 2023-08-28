package com.tnsif.pack;

public class Base
{
//variable attribute properties 
	int varDefault=10;
	public int varPublic =20;
	private int varPrivate= 30;
	protected int varProtected = 40;
	
	//methods behaviour
void methodDefault()
{
	System.out.println("Default access Bae Class");System.out.println(varDefault);  
}
public void methodPublic()
{
	System.out.println("Default access Bae Class");System.out.println(varPublic);
	
}
private void methodPrivate()
{
	System.out.println("Default access Bae Class");System.out.println(varPrivate);
} 
protected void methodProtected()
{
	System.out.println("Default access Bae Class");System.out.println(varProtected);
}
}