import java.util.Scanner;

class BMI {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        // Ask user for weight
        System.out.println("Enter your weight in kg:");
        // Store weight
        double weight = sc.nextDouble();
        // Ask user for height
        System.out.println("Enter your height in cm:");
        // Store height in cm
        double heightCm = sc.nextDouble();
        // Convert height to meters
        double heightMeter = heightCm / 100;
        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);
        // Display BMI value
        System.out.println("Your BMI is: " + bmi);

        // Check for Underweight
        if (bmi <= 18.4) {
            // Print status
            System.out.println("Status: Underweight");
        }
        // Check for Normal weight
        else if (bmi >= 18.5 && bmi <= 24.9) {
            // Print status
            System.out.println("Status: Normal");
        }
        // Check for Overweight
        else if (bmi >= 25.0 && bmi <= 39.9) {
            // Print status
            System.out.println("Status: Overweight");
        }
        else {
            // Print status
            System.out.println("Status: Obese");
        }

     
    }
}
