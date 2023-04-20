package com.constructors;

public class ZeroArgument {       // non argument constructor
	
	// declaration
	// initialization

	ZeroArgument () {
		
		System.out.println("zero constructor");
	}
	
	public static void main (String[]args) {
		
		
		new ZeroArgument();                  // by using new keyword we can call constructor in main method
		
		ZeroArgument a = new ZeroArgument();  // or by creating object we can call constructor in  main method
	}
}
