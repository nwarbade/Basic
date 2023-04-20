package com.typesOfVariables;

public class LocalVariable {   //  These are the variables that are declared inside a method, constructor, 
	                          //or block have a method-level or block-level scope and cannot be accessed outside in which it is defined.

	
	public static void main(String[] args) {
		
		
		LocalVariable a = new LocalVariable();
		a.test1();
		a.test();
	}
	
	public static void test () {
		
		int d= 120;             // local variable
		System.out.println(d);
	}
	
	public void test1 () {
		
		char c = 'f';
		System.out.println(c);
	}
}
