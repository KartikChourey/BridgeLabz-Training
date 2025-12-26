import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date{
    public static void main(String[] args) {
		
		// taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (dd-MM-yyyy): ");
		String inputDate = sc.nextLine();
		

// Date time formatter 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(inputDate, formatter);
		
// date operations 
		date = date.plusDays(7);
		date = date.plusMonths(1);	
		date = date.plusYears(2);
		date = date.minusWeeks(3);
	
	
	// Display output 
		System.out.println("Date after performing operations is " + date);
		
    }
}