import java.util.*;

public class CompareStrings{
	public static void main (String args[]){
		
		// Scanner object 
		Scanner sc = new Scanner(System.in);
		
		// taking input 
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		
		// Display Output 
		if(s1.equals(s2) == Compare(s1,s2) ) System.out.println("Both Strings are same");
		else System.out.println("Both Strings are same");
	
	}
	
	// Compare method 
	static boolean Compare(String s1,String s2){
		Boolean flag = true;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)) return false;
		}
		
		// Display output 
		return true;
	}
	
}