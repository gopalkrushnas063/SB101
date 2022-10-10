package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(4, "Pen", 5, 210));
		products.add(new Product(5, "Notebook", 2, 520));
		products.add(new Product(78, "Diary", 4, 480));
		products.add(new Product(7, "Sketch", 7, 110));
		products.add(new Product(15, "Paper Sheet", 9, 380));
		
		Collections.sort(products, new ProductPriceComp());
		
		System.out.println("Using Comparator");
		System.out.println("------------------");
		for (Product product : products) {
			System.out.println(product);
		}
		
		//Using LE
		Collections.sort(products,(p1,p2) -> p1.getPrice() > p2.getPrice() ? -1 : +1);
		System.out.println("Using LE");
		System.out.println("------------------");

		for (Product product : products) {
			System.out.println(product);
		}
		
	}
}
