package com.Constructor;

public class DefaultConstructor 
{
	//instance Variable
	String a;
	int b;
	Integer c;
	
	/*DefaultConstructor()
	{
		
	}*/
	
	public static void main(String[] args)
	{
		//classname obj name = new classname
		DefaultConstructor def = new DefaultConstructor();
		System.out.println(def.a);
		System.out.println(def.b);
		System.out.println(def.c);
		
	}

}
