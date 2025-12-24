import java.util.*;

public class Palindrome{
    public static void main(String[] args) {
		
		
		// creating scanner object 
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
		String s = sc.next();
		
	    // traversing array from first and last 
		boolean isPalindrome = true;
		int st = 0;
		int end = s.length()-1;
		while(st < end){
			if(s.charAt(st++) != s.charAt(end--)){
				isPalindrome = false;
				break;
			}
		}
		System.out.println("Is palindrome " + isPalindrome);
    }
}