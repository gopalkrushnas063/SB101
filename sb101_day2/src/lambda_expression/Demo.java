package lambda_expression;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        Inter i1 = (n,a) ->System.out.println("Name : "+n+" , Age : "+a);
        i1.printUserDetails(name,age);
    }
}
