import java.util.ArrayList;

public class School {

    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}
