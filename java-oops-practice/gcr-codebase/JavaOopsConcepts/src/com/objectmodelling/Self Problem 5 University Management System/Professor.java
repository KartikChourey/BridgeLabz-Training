public class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course c) {
        System.out.println(name + " is teaching " + c.name);
    }
}
