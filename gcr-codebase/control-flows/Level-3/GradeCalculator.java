import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Physics marks:");
        
        double physics = sc.nextDouble();

        System.out.println("Enter Chemistry marks:");
        
        // Store Chemistry marks
        double chemistry = sc.nextDouble();

        System.out.println("Enter Maths marks:");
        
        // Store Maths marks
        double maths = sc.nextDouble();

        // Calculate total marks
        double total = physics + chemistry + maths;

        // Calculate average percentage
        double percentage = total / 3;

        // Declare variables for grade and remarks
        String grade;
        String remarks;

        // Check for Grade A
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        }
        // Check for Grade B
        else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        }
        // Check for Grade C
        else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching standards";
        }
        // Check for Grade D
        else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below standards";
        }
        // Check for Grade E
        else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below standards";
        }
        else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Print the average percentage
        System.out.println("Average Percentage: " + percentage + "%");

        // Print the grade
        System.out.println("Grade: " + grade);

        // Print the remarks
        System.out.println("Remarks: " + remarks);

      
    }
}
