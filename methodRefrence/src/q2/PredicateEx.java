package q2;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Predicate<Integer> p1 = a->(a>18);
        System.out.println(p1.test(10)); //false
    }
}
