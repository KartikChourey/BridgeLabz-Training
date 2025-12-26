import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ComparingTheDates{
    public static void main(String[] args) {
		
		
		//taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date 1 (dd-MM-yyyy): ");
		String inputDate1 = sc.nextLine();
		System.out.print("Enter a date 2 (dd-MM-yyyy): ");
		String inputDate2 = sc.nextLine();
		
		//  DateTimeFormatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date1 = LocalDate.parse(inputDate1, formatter);
		LocalDate date2 = LocalDate.parse(inputDate2, formatter);
		
		
		// Display the output 
		if(date1.isBefore(date2)) System.out.println("Date 1 is before date 2");
		else if(date1.isAfter(date2)) System.out.println("Date 1 is afer date 2");
		else System.out.println("Date 1 and date 2 is equal");
    }
}