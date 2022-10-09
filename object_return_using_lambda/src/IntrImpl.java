public class IntrImpl implements Intr{

    @Override
    public Student printStudentDetails(int roll, String name, int marks) {
        return new Student(roll,name,marks);
    }
}
