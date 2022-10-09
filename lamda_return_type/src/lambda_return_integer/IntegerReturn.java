package lambda_return_integer;

import java.util.Scanner;

public class IntegerReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
//        IntegerInterface i1 = new IntrImpl();
//        String res = i1.printResult(age);
//
//        System.out.println(res);


        IntegerInterface i2 = i -> i>=18 ? "Eligible" : "Not Eligible";
        System.out.println(i2.printResult(age));
    }
}
