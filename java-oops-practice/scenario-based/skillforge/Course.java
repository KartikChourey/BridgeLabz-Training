package skillforge;

//Course class
public class Course implements ICertifiable {

 private String title;
 private Instructor instructor;
 private String[] modules;

 // Rating logic must be protected
 private double rating;

 public Course(String title, Instructor instructor) {
     this(title, instructor, new String[]{"Intro", "Basics"});
 }

 public Course(String title, Instructor instructor, String[] modules) {
     this.title = title;
     this.instructor = instructor;
     this.modules = modules;
 }

 // Read-only reviews
 public double getRating() {
     return rating;
 }

 protected void updateRating(double newRating) {
     rating = newRating;
 }

 @Override
 public void generateCertificate() {
     if (modules.length > 5) {
         System.out.println("Advanced Course Certificate issued.");
     } else {
         System.out.println("Basic Course Certificate issued.");
     }
 }
}
