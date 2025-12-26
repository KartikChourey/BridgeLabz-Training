import java.util.Scanner;

public class BodyMassIndex{
	public static void main(String[] args){
		// Creating scanner object 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height : ");
		double height = sc.nextDouble();
		System.out.print("Enter weight : ");
		double weight = sc.nextDouble();
		
		// Calculating 
		double bmi = weight / (height * height);
		String status;
		if(bmi <= 18.4) status = "Underweight";
        else if(bmi <= 24.9) status = "Normal";
        else if(bmi <= 39.9) status = "Overweight";
        else status = "Obese";
		
		// Display the result 
		System.out.println("Bmi is " + bmi + " and category of it is " + status);
		
	
	}
}