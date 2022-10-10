package com.masai;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Goa","Bhubaneswar","Jaipur","Adipur","Hariyana","Delhi","Pune");
		
		
		cities.sort(Comparator.comparing(s -> s));
		cities.forEach(System.out::println);
		
	}
}
