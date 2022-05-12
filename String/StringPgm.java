package com.String;

public class StringPgm
{
	public static void main(String[] args)
	{
		//String Literal
		String Name = " INDIA ";
		int number = 5;
		
		
		//returns character value for the particular index
		System.out.println(Name.charAt(1));

		//returns string length
		System.out.println(Name.length());

		//checks the equality of string with the given object
		System.out.println(Name.equals("PD"));
		
		//checks the equality of string with the given object without case sensitivity
		System.out.println(Name.equalsIgnoreCase("india"));
		
		//checks if string is empty or not
		System.out.println(Name.isEmpty());
		
		//returns true or false based on the given value is present or not
		System.out.println(Name.contains("N"));

		//take a particular portion of the string
		System.out.println("SubString :" +Name.substring(2));
		
		//take a particular portion of the string from begin to end
		System.out.println(Name.substring(1,3));
		
		//appends the string to the given string
		System.out.println(Name.concat(" IS MYCOUNTRY"));
		
		//replaces the existing char with given char
		System.out.println(Name.replace("I","P"));
		System.out.println(Name.replace("INDIA","MY"));
		
		//find the position of a character specified from the index of  in the string
		System.out.println(Name.indexOf("D"));
		
		//find the position of a character in the string with position
		System.out.println(Name.indexOf("I",2));
		
		//Trim will remove the white space before and after
		System.out.println(Name.trim());
		
		//convert the given data type to string
		System.out.println(String.valueOf(number));
		
		//convert Uppercase to lowercase
		String uppercase = "PRIYA";
		System.out.println(uppercase.toLowerCase());
		
		//convert lowercase to Uppercase
		String lowercase = "priya";
		System.out.println(lowercase.toUpperCase());
		
		//Returns a Joined String with Given delimiter..
		System.out.println(String.join("-","I","LOVE","MY COUNTRY"));
		System.out.println(String.join("/","30","05","1982"));
		
		//Spilt
		String splitthis="I, LOVE, MY COUNTRY";
		String [] spilttedWords=splitthis.split(",");
		for(String string: spilttedWords)
		{
			System.out.println(string);
		}
	}
	
}
