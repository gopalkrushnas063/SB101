package evaluation_1.question1;

import java.util.function.Function;

public class FunctionEx {
    static int printInt(int i){
        return i;
    }

    public static void main(String[] args) {
        Function<String , Integer> f1 = s -> Integer.valueOf(s);
        System.out.println(f1.apply("10")+1);
    }
}
