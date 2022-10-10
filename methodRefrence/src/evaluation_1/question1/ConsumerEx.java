package evaluation_1.question1;

import java.util.function.Consumer;

public class ConsumerEx {
    static void printStudentDetails(Student s){
        System.out.println("Name :"+s.getName());
        System.out.println("Roll : "+s.getRoll());
        System.out.println("Marks : "+s.getMarks());
    }

    public static void main(String[] args) {
        Consumer<Student> c1 = s -> {
            System.out.println("Name is : "+s.getName());
            System.out.println("Roll is : "+s.getRoll());
            System.out.println("Marks is : "+s.getMarks());
        };
        c1.accept(new Student(10,"Gopal",500));
    }
}
