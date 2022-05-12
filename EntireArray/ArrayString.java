package com.ArrayString;

import java.util.Arrays;

public class ArrayString {
	
	//Funcion to find the length of the longest 
	//String from the given array of Strings
	

 static int maxLength(String[] arr) {
	 int len=Integer.MIN_VALUE;
	 int N = arr.length;
	 
	 //Traverse the array
	 for(int i =0;i<N;i++)
	 {
		 //Store the length
		 //of current String
		 
		 int l=arr[i].length();
		 
		  // Update maximum length
	        if (len < l)
	        {
	            len = l;
	        }
	    }
	 
	    // Return the maximum length
	    return len;
	}
	 
	// Function to print the
	// longest Strings from the array
	static void maxStrings(String []arr, int len)
	{
	    int N = arr.length;
	    Vector<String> ans = new Vector<String>();
	 
	    // Find the Strings having length
	    // equals to len
	    for(int i = 0; i < N; i++)
	    {
	        if (len == arr[i].length())
	        {
	            ans.add(arr[i]);
	        }
	    }
	 
	    // Print the resultant
	    // vector of Strings
	    for(int i = 0; i < ans.size(); i++)
	    {
	        System.out.print(ans.get(i) + " ");
	    }
	}
	 
	// Function to print all the
	// longest Strings from the array
	static void printStrings(String [] arr)
	{
	     
	    // Find the length of longest String
	    int max = maxLength(arr);
	 
	    // Find and print all the Strings
	    // having length equals to max
	    maxStrings(arr, max);
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	    String []arr = { "Monday", "Tuesday", "Wednesday",
	                     "Thursday", "Friday" };
	                      
	    printStrings(arr);
	}
	}
	 


