package com.boxpgmstatic;

public class ClassDemoforstatic
{
	int length; //instance variables
	int breadth;
	int height;
	
	ClassDemoforstatic(int l,int b,int h)//constructor
	{
		length=l;
		breadth=b;
		height=h;
	}
	
	/*void setDim(int l,int b,int h) //this pointer
	{
		length=l;    //this.length=l; //this denote instance variables
		breadth=b;   //this.breadth=b;
		height=h;    //thi.height=h;
		
	}*/
	 int volume()
	{
		return length*breadth*height;
	}
	
	
	//Method- carries out a specific task
	//Method Input-arguments

	static void boxvolume(int length,int breadth,int height) //Method header
	{
		int vol;//Method body
		vol = length*breadth*height; 
		System.out.println("Volume is:" +vol);
	}
	static int boxvolume1(int length,int breadth,int height) //Method header
	{
		int vol;//Method body
		vol = length*breadth*height; 
		System.out.println("Volume is:" +vol);
		return vol;
	}
	static void printLine()
	{
		System.out.println("Print Only : Not Return");
		
	}
	
	public static void main(String[] args)
	{
		ClassDemoforstatic blackBox = new ClassDemoforstatic(10,2,33);
		ClassDemoforstatic woodBox = new ClassDemoforstatic(10, 8,33);
		ClassDemoforstatic GreenBox = new ClassDemoforstatic(10, 2,33);
		ClassDemoforstatic CardBoardBox = new ClassDemoforstatic(10, 2,33);
		
		boxvolume1(12,12,12);
		boxvolume(10,4,2); //Call Method-we are ordering work..passing arguments 
		boxvolume(12,15,14);// Reusuable ..diff inputs
		printLine();
		
		
		/*blackBox.length=10;
		blackBox.breadth=20;
		blackBox.height=90;*/
		//blackBox.setDim(10, 2,33);
		
		System.out.println("Vol of BlackBox is " +blackBox.volume());//invoke
		
		
		System.out.println(blackBox.length);
		System.out.println(blackBox.breadth);
		
		
		
		System.out.println(woodBox.length);
		System.out.println(woodBox.breadth);
		
		GreenBox.length=10;
		GreenBox.breadth=20;
		
		System.out.println(GreenBox.length);
		System.out.println(GreenBox.breadth);

		CardBoardBox.length=10;
		CardBoardBox.breadth=20;
		
		System.out.println(CardBoardBox.length);
		System.out.println(CardBoardBox.breadth);
		
		
		
		
		
	}
	
}

	/*
	public static Object blackBox;
	
	Box(int l,int b) //Constructor
	{
		length = l;
		breadth = b;
		boxCount++;
	}
	Box()
	{
		length=-1;
		breadth=-1;
		boxCount++;
	}
	Box(int l)
	{
		length=length=breadth=1;
	}
	static
	{
		
		System.out.println("Static Block executed");
		boxCount=0;

	}
	Box(int l)
	{
		length = breadth = 1;
		boxCount++;
	}
	Box(Box b) //copy constructor
	{
		length=b.length;
		breadth=b.breadth;
		boxCount++;
		}
	void setDim(int l,int b)
	{
		length=l;
		breadth=b;
	}
	int volume()
	{
		return length+breadth;
	}
	boolean isEqual(Box b)
	{
		if(length==breadth)
			return true;
		return false;
	}
	}
public class Boxstatic
{
	public static void main(String[] args) {
		System.out.println("Main Method Starts Here...");
		Box blackBox;
		System.out.println("Before Creating Box Obj");
		blackBox = new Box(5,4);
		System.out.println("After Creating Box Obj");
		blackBox.setDim(6,4);
		//blackBox.volume();//invoke
		System.out.println("Vol of bloack box" +blackBox.volume());//invoke
		
		Box woodBox = new Box(30,24);
		System.out.println("Vol of wood box" +woodBox.volume());
		woodBox.setDim(56,45);
		
		Box b1 = new Box(6,5);
		
		System.out.println("blackBox == b1"+ blackBox.isEqual(b1));
		
		Box b2 = new Box(b1);
		
		b2.length=10;
		
		System.out.println(Box.boxCount);
		}

}
*/