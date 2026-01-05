package campusconnect;

import java.util.ArrayList;

//Course maintains students and assigned faculty
public class Course {

 private String courseName;
 private Faculty faculty;
 private ArrayList<Student> students;

 public Course(String courseName, Faculty faculty) {
     this.courseName = courseName;
     this.faculty = faculty;
     students = new ArrayList<>();
 }

 public void addStudent(Student student) {
     students.add(student);
 }
}

