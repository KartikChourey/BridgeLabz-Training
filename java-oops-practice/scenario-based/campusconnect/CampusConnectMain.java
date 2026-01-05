package campusconnect;

public class CampusConnectMain {

    public static void main(String[] args) {

        Faculty f1 = new Faculty(101, "Dr. Sharma", "sharma@uni.edu", "CSE");

        Student s1 = new Student(1, "Kartik", "kartik@uni.edu");
        s1.addGrade(8);
        s1.addGrade(9);

        Course c1 = new Course("Data Structures", f1);

        s1.enrollCourse(c1);

        s1.printDetails();
        f1.printDetails();
    }
}
