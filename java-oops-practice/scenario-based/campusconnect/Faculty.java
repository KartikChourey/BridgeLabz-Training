package campusconnect;

//Faculty class extending Person
public class Faculty extends Person {

 private String department;

 public Faculty(int id, String name, String email, String department) {
     super(id, name, email);
     this.department = department;
 }

 // Polymorphic behavior
 @Override
 public void printDetails() {
     System.out.println("Faculty: " + name + ", Dept: " + department);
 }
}
