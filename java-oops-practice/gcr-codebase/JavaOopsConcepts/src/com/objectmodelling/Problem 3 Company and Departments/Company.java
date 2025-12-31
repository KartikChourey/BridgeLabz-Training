import java.util.ArrayList;

public class Company {

    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void closeCompany() {
        departments.clear();
        System.out.println("Company closed. All departments and employees removed.");
    }
}
