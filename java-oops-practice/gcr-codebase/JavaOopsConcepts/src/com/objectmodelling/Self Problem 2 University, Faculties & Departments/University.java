import java.util.ArrayList;

public class University {

    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void closeUniversity() {
        departments.clear();  
        System.out.println("University closed, departments removed.");
    }
}
