import java.util.ArrayList;

public class Course {

    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}
