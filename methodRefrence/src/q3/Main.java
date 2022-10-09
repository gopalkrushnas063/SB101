package q3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Student> mymap = new HashMap<>();
        mymap.put("India",new Student(10,"Nitesh","nit@gmail.com",570));
        mymap.put("Nepal",new Student(17,"Ranjan","ndaft@gmail.com",850));
        mymap.put("Russia",new Student(18,"Akash","gfsgf@gmail.com",670));
        mymap.put("USA",new Student(13,"Sharma","naf@gmail.com",370));
        mymap.put("Ukrain",new Student(16,"Ritu","afgat@gmail.com",770));


        Main obj = new Main();
        Map<String,Student> ans = obj.sortMapUsingStudentName(mymap);


        ans.forEach((key,value)-> System.out.println(key+" : "+value));

    }


    public Map<String, Student> sortMapUsingStudentName(Map<String, Student> mymap){

        List<Map<String,Student>> li = new ArrayList<>();

        mymap.forEach((key,value)->{
           Map<String,Student> m = new HashMap<>();
           m.put(key,value);
           li.add(m);
        });
        //System.out.println(li);
        Collections.sort(li,(s1,s2)->{

            String x = s1.keySet().iterator().next();
            String y = s2.keySet().iterator().next();
            //System.out.println(x);
            //System.out.println(y);
            return s1.get(x).getName().compareTo(s2.get(y).getName());

        });
        //System.out.println(li);
        LinkedHashMap<String,Student> m1 = new LinkedHashMap<>();

        for (Map<String,Student> f:li){
            m1.putAll(f);
        }
        return m1;
    };

}
