package q2;

import java.util.function.Supplier;

public class SupplierInterfaceEx {
    static String product = "Android";
    public static void main(String[] args) {
        Supplier<String> nameInUpper = () -> product.toUpperCase();
        System.out.println(nameInUpper.get());
    }
}
