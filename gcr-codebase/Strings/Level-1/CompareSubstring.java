import java.util.*;

public class CompareSubstring{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter text:");
		String text=sc.next();

		System.out.println("Enter start index:");
		int start=sc.nextInt();

		System.out.println("Enter end index:");
		int end=sc.nextInt();

		String manual=createSubstring(text,start,end);

		String builtIn=text.substring(start,end);

		boolean result=compareStrings(manual,builtIn);

		System.out.println("Manual Substring: "+manual);
		System.out.println("Built-in Substring: "+builtIn);
		System.out.println("Comparison Result: "+result);
	}

	// Method to create substring using charAt()
	static String createSubstring(String text,int start,int end){
		String result="";
		for(int i=start;i<end;i++)
			result+=text.charAt(i);
		return result;
	}

	// Method to compare two strings using charAt()
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
