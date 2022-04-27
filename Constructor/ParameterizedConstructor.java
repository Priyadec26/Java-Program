package com.Constructor;

public class ParameterizedConstructor 
{
	//instance variable

	String name1;
	String position1;
	
	ParameterizedConstructor(String name,String position)
	{
		name1= name;
		position1= position;
	}
	public void sayaboutme()
	{
		System.out.println("Post : " +position1);
	}

public static void main(String[] args)
{
	ParameterizedConstructor def = new ParameterizedConstructor("PD","QA");
	
	def.sayaboutme();

	ParameterizedConstructor def1 = new ParameterizedConstructor("Senthil","DEV");
	
	def1.sayaboutme();
}
}