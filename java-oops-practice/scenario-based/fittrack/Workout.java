package fittrack;

//Abstract base class for workouts
public abstract class Workout implements ITrackable {

 protected String type;
 protected int duration;        // in minutes
 protected double caloriesBurned;

 public Workout(String type, int duration) {
     this.type = type;
     this.duration = duration;
 }

 // Polymorphic calorie calculation
 public abstract void calculateCalories();

 @Override
 public void startWorkout() {
     System.out.println(type + " workout started...");
 }

 @Override
 public void stopWorkout() {
     System.out.println(type + " workout completed.");
 }

 public double getCaloriesBurned() {
     return caloriesBurned;
 }
}
