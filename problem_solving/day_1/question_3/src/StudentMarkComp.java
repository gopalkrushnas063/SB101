import java.util.Comparator;

public class StudentMarkComp implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getMarks() > s2.getMarks()) {
            return +1;
        }else if(s1.getMarks() < s2.getMarks()) {
            return -1;
        }else {
            return s1.getName().compareTo(s2.getName());
        }
    }

}