import java.util.Scanner;

public class FibonacciSeries{
	


// Method to find fibonacci 	
	private static void printFibo(int n){
		int prev = 1;
		int prevPrev = 0;
		System.out.print(prevPrev + " ");
		if(n >= 2) System.out.print(prev + " ");
		
		for(int i = 3; i <= n; i++){
			int curr = prev + prevPrev;
			System.out.print(curr + " ");
			prevPrev = prev;
			prev = curr;
		}
	}
	public static void main(String[] args){
		// creating scanner class object and taking input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
// Displaying the output 
		if(n <= 0) System.out.println("Enter number greater than 0 ");
		else printFibo(n);
		
	}
}