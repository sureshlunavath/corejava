package com.test;

public class Staticdemo1 {

	void show() {
		System.out.println("hloo");
	}
	
	static void print() {
		System.out.println("happy");
	}
	
	static {
		System.out.println("always runs");  //static block executes even before the main method.{no need to call/no need any object}
	}
	
	static {
		System.out.println("always runs2");  //any number of static blocks are allowed.
	}

	{
		System.out.println("lets see"); //init block (or) instance block.
	}
	
	public static void main(String[] args) {
		print();             //to call a static method,no object is needed.
		Staticdemo1 obj=new Staticdemo1(); //new object creation.
		obj.show(); ////to call a non-static method (or) instance method,object is needed.
	}

}
