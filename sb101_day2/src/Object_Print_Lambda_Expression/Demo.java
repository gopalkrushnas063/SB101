package Object_Print_Lambda_Expression;

public class Demo {
    public static void main(String[] args) {
        Intr i1 = new IntrImpl();
        i1.printStudentDetails(new Student(10,"Rajendra",780));

        System.out.println("Lambda Expression ");
        Intr i2 = s -> {
            System.out.println("Roll is "+s.getRoll());
            System.out.println("Name is "+s.getName());
            System.out.println("Marks is "+s.getMarks());
        };
        i2.printStudentDetails(new Student(10,"Shree",396));
    }
}
