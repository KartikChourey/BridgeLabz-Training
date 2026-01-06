package edumentor;

//Instructor class
public class Instructor extends User {

 private String specialization;

 public Instructor(String name, String email, int userId, String specialization) {
     super(name, email, userId);
     this.specialization = specialization;
 }
}
