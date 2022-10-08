package collectionapp;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        students.add(new Student(10,"N1",580));
        students.add(new Student(17,"N6",680));
        students.add(new Student(19,"N2",780));
        students.add(new Student(16,"N7",880));
        students.add(new Student(11,"N4",380));

        Collections.sort(students,new StudentMarkComp());
        for (Student student: students
             ) {
            System.out.println(student);
        }

        //Using Lambda Method


    }
}
