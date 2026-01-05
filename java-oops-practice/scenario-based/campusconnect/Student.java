package campusconnect;
import java.util.ArrayList;





//Student inherits Person and implements course actions
public class Student extends Person implements ICourseActions {

 private ArrayList<Integer> grades;   // grades must be private
 private ArrayList<Course> courses;

 public Student(int id, String name, String email) {
     super(id, name, email);
     grades = new ArrayList<>();
     courses = new ArrayList<>();
 }

 public void addGrade(int grade) {
     grades.add(grade);
 }

 // GPA calculation using operators
 public double calculateGPA() {
     int sum = 0;
     for (int g : grades) {
         sum += g;
     }
     return grades.size() == 0 ? 0 : (double) sum / grades.size();
 }

 @Override
 public void enrollCourse(Course course) {
     courses.add(course);
     course.addStudent(this);
 }

 @Override
 public void dropCourse(Course course) {
     courses.remove(course);
 }

 // Polymorphism
 @Override
 public void printDetails() {
     System.out.println("Student: " + name + ", GPA: " + calculateGPA());
 }
}
