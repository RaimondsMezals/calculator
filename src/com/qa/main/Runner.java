package com.qa.main;

public class Runner {

	static int c;
	
	public static int addition() {
		
		int a = 10;
		int b = 20;
		
		
		c = a + b;
		return c;
	}
	
	public static int subtraction() {
		
		int a = 10;
		int b = 20;
		
		
		c = a - b;
		return c;
	}
	
	public static int multiplication() {
		
		int a = 10;
		int b = 20;
		
		
		c = a * b;
		return c;
	}
public static int division() {
		
		int a = 10;
		int b = 20;
		
		
		c = a / b;
		return c;
	}
	
	public static void main(String[] args) {
		
		System.out.println(addition());
		System.out.println(subtraction());
		System.out.println(multiplication());
		System.out.println((double) division());
		
		
	}

}
