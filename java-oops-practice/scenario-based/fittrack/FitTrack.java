package fittrack;

import java.util.Scanner;

public class FitTrack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

  
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your weight (kg): ");
        double weight = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter your fitness goal: ");
        String goal = sc.nextLine();

        UserProfile user = new UserProfile(name, age, weight, goal);

 
        System.out.println("\nChoose Workout Type:");
        System.out.println("1. Cardio");
        System.out.println("2. Strength");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter workout duration (minutes): ");
        int duration = sc.nextInt();

        Workout workout;

        // Polymorphism: object decided at runtime
        if (choice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

   
        workout.startWorkout();
        workout.calculateCalories();
        workout.stopWorkout();

  
        int dailyTarget = 500;
        double remainingCalories = dailyTarget - workout.getCaloriesBurned();

        System.out.println("\n--- Daily Fitness Report ---");
        System.out.println("User: " + user.getName());
        System.out.println("Calories Burned: " + workout.getCaloriesBurned());
        System.out.println("Remaining Calories to Target: " + remainingCalories);

        sc.close();
    }
}
