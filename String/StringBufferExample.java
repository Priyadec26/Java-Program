package com.String;

public class StringBufferExample {
	public static void main(String[] args)
	{
		//To demonstrate the String Buffer is Mutable
		
		System.out.println("String is Immutable");
		String name = "PRIYA";
		System.out.println("Appending a name to original : " +name.concat("DHARSINI"));
		System.out.println("Original name :" +name);
		System.out.println("************************************");
		
		System.out.println("String is Mutable");
		StringBuffer name1 = new StringBuffer("PRIYA");
		System.out.println("Appending a name to original : " +name1.append("DHARSINI"));
		System.out.println("Original name :" +name1);
		System.out.println("************************************");	
		
		//StringBuffer Methods
		
		//Reverse
		System.out.println("Reversed Name : " + name1.reverse());
		
		//Replace
		StringBuffer replacethis=new StringBuffer("YALINI");
		System.out.println(replacethis.replace(0, 3, "PRI"));
		
		//delete
		StringBuffer delete=new StringBuffer("YALINI");
		System.out.println(delete.delete(0,3));
		
		//Insert
		StringBuffer insert=new StringBuffer("YALINI");
		System.out.println(insert.insert(0,"PRI"));
		
		//capacity
		System.out.println(insert.capacity());
		
	}
	

}
