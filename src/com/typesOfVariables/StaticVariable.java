package com.typesOfVariables;

public class StaticVariable {          //Class Variable
	
	static char e = 's';
	
	public static void main(String[] args) {
		
		StaticVariable a = new StaticVariable();
		
		a.test();
		a.test2();
	}
	
	public static void test ()
	{
		
		System.out.println(e);
	}
	
	public void test2() {
		
		System.out.println(e);
	}

}
