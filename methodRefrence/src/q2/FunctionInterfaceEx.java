package q2;

import java.util.function.Function;

public class FunctionInterfaceEx {
    static String sayHello(String s){
        return "Hello "+s;
    };
    public static void main(String[] args) {
        Function<String,String> fun1 = s -> "Hello "+s;
        System.out.println(fun1.apply("Gopal"));
    }
}
