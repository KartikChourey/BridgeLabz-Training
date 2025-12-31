public class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        System.out.println(name + " enrolled in " + c.name);
    }
}
