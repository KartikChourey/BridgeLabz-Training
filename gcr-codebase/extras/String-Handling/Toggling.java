import java.util.*;

public class Toggle{
    public static void main(String[] args) {
		// creating scanner object 
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
		String s = sc.nextLine();
		String result = "";
		
		// using for loop to iterate and finding result
		for(char ch : s.toCharArray()){
			if(ch < 97) ch += 32;
			else ch -= 32;
			result += (char)ch;
		}
		
		// Display
		System.out.println("The resultant string " + result);
    }
}