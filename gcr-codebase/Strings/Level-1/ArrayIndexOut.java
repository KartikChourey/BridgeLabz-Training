import java.util.*;

public class ArrayIndexOut{
	public static void main(String args[]){
		// Scanner object for input
		Scanner sc=new Scanner(System.in);
		String names[]=new String[3];
		System.out.println("Enter 3 names:");
		for(int i=0;i<3;i++)
			names[i]=sc.nextLine();

		// Calling method to generate exception
		System.out.println("Generating Exception:");
		try{
			System.out.println(names[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			// Handles array index error
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}catch(RuntimeException e){
			// Handles any runtime exception
			System.out.println("RuntimeException handled");
		}

	
	}

	// Method that generates ArrayIndexOutOfBoundsException
	static void generateException(String names[]){
		System.out.println(names[5]);
	}

	
}
