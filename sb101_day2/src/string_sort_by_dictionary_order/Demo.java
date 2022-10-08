package string_sort_by_dictionary_order;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("blue","red","yellow","violet","sky","red");
        int result = Collections.frequency(colors,"red");
        System.out.println(result);

        Collections.sort(colors);
        System.out.println(colors);
    }
}
