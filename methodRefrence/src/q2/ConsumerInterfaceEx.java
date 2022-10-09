package q2;

import java.util.function.Consumer;

public class ConsumerInterfaceEx {

    static void printMsg(String msg){
        System.out.println("Gopal "+msg);
    }

    static void printRes(int val){
        System.out.println("Number is "+val);
    }
    public static void main(String[] args) {
        Consumer<String> c1 = msg -> System.out.println("Gopal , "+msg);
        c1.accept("Good Night");

        Consumer<Integer> c2 = n -> System.out.println("Entered number is "+n);
        c2.accept(11);
    }
}
