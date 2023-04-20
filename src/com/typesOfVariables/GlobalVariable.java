package com.typesOfVariables;

public class GlobalVariable {            
	
	float f = 89.56f;
	
	public static void main(String[] args) {
		
		GlobalVariable a = new GlobalVariable();
		a.test();
	}
	
	public void test () {
		
		System.out.println(f);
	}
	


}
