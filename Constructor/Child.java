package com.Constructor;

public class Child extends Parent {
	public Child()
	{
		super();
		System.out.println("Child Class Constructor");
	}
	public static void main(String[] args)
	{
		Child childclass = new Child();
}
}
