import java.util.ArrayList;

public class Student {

    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);   // association
    }

    void viewCourses() {
        System.out.println(name + "'s Courses:");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}
