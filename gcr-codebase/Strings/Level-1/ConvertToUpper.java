import java.util.*;

public class ConvertToUpper{
	public static void main(String args[]){
		// Scanner object for input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text:");
		String text=sc.nextLine();

		
		String builtIn=text.toUpperCase();

		String manual=Convert(text);

		// Comparing both results
		boolean result=compareStrings(builtIn,manual);

		// Displaying result
		System.out.println("Uppercase Text: "+manual);
		System.out.println("Comparison Result: "+result);
		
	}
	
	static String  Convert(String s){
		String ans = "";
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch<= 'z' && ch >='a') {
				ans+=(char)(ch-32);
			}
			else ans+=ch;
		}
		return ans;
	}
	static boolean compareStrings(String s1,String s2){
		if(s1.length()!=s2.length())
			return false;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
		}
		return true;
	}

	
}
