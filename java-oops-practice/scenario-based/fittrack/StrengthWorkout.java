package fittrack;

//Strength workout burns moderate calories
public class StrengthWorkout extends Workout {

 public StrengthWorkout(int duration) {
     super("Strength", duration);
 }

 @Override
 public void calculateCalories() {
     caloriesBurned = duration * 5;
 }
}

