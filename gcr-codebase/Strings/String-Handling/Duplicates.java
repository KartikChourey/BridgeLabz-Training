import java.util.*;

public class Duplicates{
    public static void main(String[] args) {
		
		
		// creating scanner object 
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
		String s = sc.next();
		
		// Check the presence of duplicates
		boolean[] isPresent = new boolean[256];
		String result = "";
		for(char ch : s.toCharArray()){
			if(!isPresent[ch]){
				isPresent[ch] = true;
				result += ch;
			}
		}
		System.out.println("String with no duplicates : " + result);
    }
}