package com.masai;

public class Demo {
	
	public static void fun1(String s) {
		
		System.out.println("inside static fun1 of Demo ");
		System.out.println("The value of s is :"+s);
		
	}
	
	public void fun2(String s) {
		
		System.out.println("inside non-static fun2 of Demo ");
		System.out.println("The value of s is :"+s);
		
	}
	
	
	public Demo(String s) {
		
		System.out.println("inside Constructor of Demo ");
		System.out.println("The value of s is :"+s);
		
		
	}
	public static void main(String[] args) {
		Inter i1 = Demo::fun1; //refering to static method
		
		
		Inter i2 = new Demo("amit")::fun2; // refering to non-static method
		
	
		Inter i3 = Demo::new; //refering to the constructor
		
		i1.sayHello("Welcome to MR");
		i2.sayHello("Welcome to MR");
		i3.sayHello("Welcome to MR");
	}

}
