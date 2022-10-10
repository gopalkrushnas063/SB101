package com.masai;

public class Demo {
	public static void main(String[] args) {
		X i1 = n -> Integer.parseInt(n);
		X i2 = Integer::parseInt;
		System.out.println(i2.convetStringToNumber("100")+5);
		System.out.println(i1.convetStringToNumber("200")+48);
	}
}
