package evaluation_1.question1;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student marks :");
        int marks = sc.nextInt();
        Predicate<Integer> studentMarks = i -> (i<500);
        System.out.println(studentMarks.test(marks));
    }
}
