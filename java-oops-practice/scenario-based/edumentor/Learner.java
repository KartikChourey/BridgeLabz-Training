package edumentor;

//Learner inherits User and implements certification
public class Learner extends User implements ICertifiable {

 private String courseType; // short-course or full-time

 public Learner(String name, String email, int userId, String courseType) {
     super(name, email, userId);
     this.courseType = courseType;
 }


 @Override
 public void generateCertificate() {

     if (courseType.equalsIgnoreCase("short")) {
         System.out.println("Short Course Certificate issued to " + name);
     } else {
         System.out.println("Full-Time Course Certificate issued to " + name);
     }
 }
}
