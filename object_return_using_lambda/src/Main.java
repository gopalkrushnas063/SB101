public class Main {
    public static void main(String[] args) {

        //Interface Implementation
       Intr i1 = new IntrImpl();
       Student s = i1.printStudentDetails(10,"Hari",785);
       System.out.println(s);

        //Lambda Expression
        Intr i2 = (roll,name,marks) -> new Student(roll,name,marks);

        System.out.println(i2.printStudentDetails(12,"Rani",754));

       //Method Reference
        Intr i3 = Student::new;

        System.out.println(i3.printStudentDetails(12,"Rani",754));

    }
}