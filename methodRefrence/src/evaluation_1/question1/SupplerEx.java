package evaluation_1.question1;

import java.util.function.Supplier;

public class SupplerEx {
    static String print(Student s){
        return ("Name :"+s.getName() +" "+"Roll : "+s.getRoll()+" Marks : "+s.getMarks());

    }
    public static void main(String[] args) {
        Supplier<Student> s1 = () ->{

            return new Student(25,"Gopal",540);
        };
        System.out.println(s1.get());
    }
}
