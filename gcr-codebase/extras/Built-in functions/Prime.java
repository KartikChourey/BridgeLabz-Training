import java.util.Scanner;

public class Prime{
	private static boolean isPrime(int n){
		if(n <= 2) return false;
		for(int i = 2; i < n; i++){
			if(n%i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
		System.out.println("Is n prime ? " + isPrime(n));
		
	}
}