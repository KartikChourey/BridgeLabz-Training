import java.util.Scanner;

public class BMI {

    // Method to calculate BMI and Status for a single person
    static String[] calculateBMI(double weight, double heightCm) {

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // BMI formula
        double bmi = weight / (heightMeter * heightMeter);

        // Round BMI to 2 decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        // Decide BMI status based on chart
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        // Return BMI and status as String array
        return new String[] {String.valueOf(bmi), status};
    }

    // Method to prepare final BMI report
    static String[][] prepareBMIReport(double[][] data) {

        String[][] report = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            // Call BMI calculation method
            String[] bmiResult = calculateBMI(weight, height);

            report[i][0] = String.valueOf(height);
            report[i][1] = String.valueOf(weight); 
            report[i][2] = bmiResult[0];           
            report[i][3] = bmiResult[1];            
        }
        return report;
    }

    // Method to display BMI report in tabular format
    static void displayReport(String[][] report) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < report.length; i++) {
            System.out.println(
                report[i][0] + "\t\t" +
                report[i][1] + "\t\t" +
                report[i][2] + "\t" +
                report[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store weight and height of 10 persons
        double[][] personData = new double[10][2];

        // Take user input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details of Person " + (i + 1));

            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        // Generate BMI report
        String[][] bmiReport = prepareBMIReport(personData);

        // Display result
        displayReport(bmiReport);
    }
}
