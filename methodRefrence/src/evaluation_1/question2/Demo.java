package evaluation_1.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(2,"Pen",235,2));
        products.add(new Product(7,"Pencil",147,1));
        products.add(new Product(9,"Rubber",344,2));
        products.add(new Product(6,"Sharpener",653,2));
        products.add(new Product(4,"Scale",867,1));
        products.add(new Product(1,"Compass",311,1));

       products.stream().filter(p -> p.getQuantity()<2).forEach(System.out::println);
       Collections.sort(products,(p1,p2)-> p1.getPrice() > p2.getPrice() ? -1 :+1);
       //Sort the List of Products by using the price in descending order.
        //Note: For Sorting make use of Lambda Expression.
        System.out.println("Sort the List of Products by using the price in descending order. Using LE");
        for (Product product: products
             ) {
            System.out.println(product);
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Print each element from the List by using Method Reference");
        products.forEach(System.out::println);

    }
}
