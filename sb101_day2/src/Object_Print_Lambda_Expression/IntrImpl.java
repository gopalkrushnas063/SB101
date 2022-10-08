package Object_Print_Lambda_Expression;

public class IntrImpl implements Intr{
    @Override
    public void printStudentDetails(Student student) {
        System.out.println("Roll is "+student.getRoll());
        System.out.println("Name is "+student.getName());
        System.out.println("Marks is "+student.getMarks());
    }
}
