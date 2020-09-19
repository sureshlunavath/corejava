package com.test;

public class Seconddemo {
	static int x=50;
	int y=50;
	
	void add() {
		x=x+10;
		y=y+10;
	}
	
	public static void main(String[] args) {
		Seconddemo obj1=new Seconddemo();
		System.out.println("x="+x+"\ty="+obj1.y);
		obj1.add();
		System.out.println("x="+x+"\ty="+obj1.y);
		
		Seconddemo obj2=new Seconddemo();
		System.out.println("x="+x+"\ty="+obj2.y);
		obj2.add();
		System.out.println("x="+x+"\ty="+obj2.y);
		
	}
}
