import java.util.*;

public class CharArrayCompare{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter text:");
		String text=sc.next();

		// User-defined character array
		char manual[]=getCharacters(text);

		// Built-in character array
		char builtIn[]=text.toCharArray();

		// Comparing both arrays
		boolean result=compareArrays(manual,builtIn);

		System.out.println("Comparison Result: "+result);
	}

	// Method to return characters without toCharArray()
	static char[] getCharacters(String text){
		char arr[]=new char[text.length()];
		for(int i=0;i<text.length();i++)
			arr[i]=text.charAt(i);
		return arr;
	}

	// Method to compare two char arrays
	static boolean compareArrays(char a[],char b[]){
		if(a.length!=b.length)
			return false;
		for(int i=0;i<a.length;i++){
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}
}
