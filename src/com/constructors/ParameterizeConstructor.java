package com.constructors;

public class ParameterizeConstructor {
	
	String city;
	
	ParameterizeConstructor() {
		 city = "Pune";
		 System.out.println(city);
	}
	
	ParameterizeConstructor( int a){
		
		System.out.println(a);
		
	}
	
	ParameterizeConstructor(String name){
		
		System.out.println(name);
	}
	
	public static void main (String []args) {
		
		
		ParameterizeConstructor a = new ParameterizeConstructor();
		
		ParameterizeConstructor b = new ParameterizeConstructor(1234);
		ParameterizeConstructor c = new ParameterizeConstructor("Kalyani");
	
	}

}
