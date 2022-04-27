package com.Constructor;

public class ConstructorOverloading {
	String a;
	
	ConstructorOverloading()
	{
		System.out.println("Overloading");
	}
	
	ConstructorOverloading(String name)
	{
		a=name; //this
		System.out.println("Overloading"+a);
	}
	public static void main(String[] args)
	{
		ConstructorOverloading def = new ConstructorOverloading();
		ConstructorOverloading def1 = new ConstructorOverloading("PD");
}
	
}
