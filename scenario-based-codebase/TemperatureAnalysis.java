import java.util.*;

public class TemperatureAnalysis {

    public static void main(String[] args) {

        // Days of the week
        String[] days = {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"
        };

        double[] temp = new double[7];
        Scanner sc = new Scanner(System.in);

        // Taking temperature input
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Enter the recorded temperature for " + days[i] + ": ");
            temp[i] = sc.nextDouble();
        }

        double sum = 0;
        double maxTemp = temp[0];

        // Calculating average and maximum temperature
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i];
            maxTemp = Math.max(maxTemp, temp[i]);
        }

        double average = sum / temp.length;

        System.out.println("Average Temperature of the week: " + average);
        System.out.println("Maximum Temperature of the week: " + maxTemp);

        sc.close();
    }
}
