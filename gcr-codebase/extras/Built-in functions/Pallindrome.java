import java.util.Scanner;

public class Pallindrome{
	
// Methods 
	private static boolean isPalindrome(String str){
		int i = 0;
		int j = str.length()-1;
		
		while(i <= j){
			if(str.charAt(i++) != str.charAt(j--)) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.next();
		
		// Display Output 
		System.out.println(isPalindrome(str));
		
	}
}