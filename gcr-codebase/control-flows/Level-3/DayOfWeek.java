import java.util.*;

public class DayOfWeek {

    public static void main(String[] args) {
	
	// Creating Scanner Object 
         Scanner sc = new Scanner(System.in);
		 
		 // taking input 
        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();

        // Adjust year based on month
        int y0 = y - (14 - m) / 12;
        // Calculate adjusted month
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // Calculate adjusted month value
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        // Calculate day of week using formula
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print the day of the week
        System.out.println("Day of the week is: " + d0);
    }
}
