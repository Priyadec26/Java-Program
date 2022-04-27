package com.EntireArray;

import java.util.Arrays;

public class Entirearray {

	public static void main(String[] args) {
	
	String s1 = new String("PRIYA");
String s2=new String("priya");
	
		String[] daysOfWeek = {"MONDAY","TUESDAY","WEDNESDAY",
				"THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
		
	//	System.out.println(mon.length());
		//System.out.println(s1[1].length());
		
		String dayWithMostCharacters="";
		for(String day: daysOfWeek)
		{
			if(day.length()>dayWithMostCharacters.length())
			{
				dayWithMostCharacters=day;
			}
			}

		System.out.println("The Longest Word in the array : " +dayWithMostCharacters);
		for(int i=0;i<daysOfWeek.length;i++)
		{
			System.out.println(daysOfWeek[i]);
		}
		for(int i=daysOfWeek.length-1;i>=0;i--)
		{
			System.out.println(daysOfWeek[i]);
		}

		
/*	 String s1 = new String(" ");
	 String s2=new String(" ");    
	 
	  isBlank and isEmpty difference */
	
	// Comparison of Two String 
	
	if(s1==s2)
	{
		System.out.println("==");
	}
	else
	{
		System.out.println("Not Equal");
	}
	boolean result=s1.equals(s2);
	{
		System.out.println(result);
			
	}
	boolean result1=s1.equalsIgnoreCase(s2);
	{
		System.out.println(result1);
			
	}
	boolean result2=s1.isBlank();
	{
		System.out.println(result2);
			
	}
	boolean result3=s1.isEmpty();
	{
		System.out.println(result3);
			
	}
	}
}
 /*System.out.println(Arrays.toString(s1));
	

}}*/
