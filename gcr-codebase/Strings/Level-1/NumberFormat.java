import java.util.*;

public class NumberFormat{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter text:");
		String text=sc.nextLine();

		// Calling method to generate exception
		System.out.println("Generating Exception:");
		try{
			generateException(text);
		}catch(NumberFormatException e){
			System.out.println("Program stopped due to NumberFormatException");
		}

		System.out.println("Handling Exception:");
		handleException(text);
	}

	// Method that generates NumberFormatException
	static void generateException(String text){
		int num=Integer.parseInt(text);
		System.out.println(num);
	}

	// Method that handles NumberFormatException
	static void handleException(String text){
		try{
			int num=Integer.parseInt(text);
			System.out.println(num);
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException handled");
		}catch(RuntimeException e){
			System.out.println("RuntimeException handled");
		}
	}
}
