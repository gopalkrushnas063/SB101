package com.masai;

import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Pune","Goa","Jaipur","Patna","Puri");
		
		PrintList print = (c) -> System.out.println(c);
		print.display(cities);
	}
}
