import java.util.*;

public class SpringSeason {
    public static void main(String[] args) {
	// Create Scanner Object
   Scanner sc = new Scanner(System.in);
   
   
        // Convert first command line argument to integer (month)
        int month = sc.nextInt();

        // Convert second command line argument to integer (day)
        int day = sc.nextInt();

        // Check if the given date in Spring Season
        if ((month == 3 && day >= 20) ||
            (month > 3 && month < 6) ||
            (month == 6 && day <= 20)) {

            // Print message if it is Spring Season
            System.out.println("Its a Spring Season");
        } else {

            // Print message if it is not Spring Season
            System.out.println("Not a Spring Season");
        }
    }
}
