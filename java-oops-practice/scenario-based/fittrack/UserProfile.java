package fittrack;

//Stores basic user profile details
public class UserProfile {

 private String name;
 private int age;
 private double weight;   // private health data
 private String goal;

 // Constructor with custom goal
 public UserProfile(String name, int age, double weight, String goal) {
     this.name = name;
     this.age = age;
     this.weight = weight;
     this.goal = goal;
 }

 // Encapsulation: only getter allowed
 public double getWeight() {
     return weight;
 }

 public String getName() {
     return name;
 }
}
