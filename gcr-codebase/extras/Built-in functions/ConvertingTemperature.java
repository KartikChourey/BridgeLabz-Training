import java.util.Scanner;

public class ConvertingTemperature{
	
	
	// Method to convert 
	private static double celsiusToFahrenheit(double celsius){
		return (celsius * 9.0 / 5.0) + 32.0;
	}
	
	
	private static double fahrenheiToCelsius(double fahrenheit){
		return (fahrenheit - 32.0) * 5.0 / 9.0;
	}
	public static void main(String[] args){
		// creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in celsius and fahrenheit : ");
		double celsius = sc.nextDouble();
		double fahrenheit = sc.nextDouble();
		
// Displaying result 
		System.out.println(fahrenheit + " in celsius is " + fahrenheiToCelsius(fahrenheit));
		System.out.println(celsius + " in fahrenheit is " + celsiusToFahrenheit(celsius));
		
		
	}
}