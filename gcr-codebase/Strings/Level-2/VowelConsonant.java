import java.util.*;

public class VowelConsonant{
	public static void main(String args[]){
		// Scanner for input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text:");
		String text=sc.nextLine();

		// Count vowels and consonants
		int res[]=countVC(text);

		System.out.println("Vowels: "+res[0]);
		System.out.println("Consonants: "+res[1]);
	}

	// Method to check character type
	static String checkChar(char ch){
		// Convert uppercase to lowercase using ASCII
		if(ch>='A' && ch<='Z') ch=(char)(ch+32);

		if(ch<'a' || ch>'z') return "NA";

		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return "V";
		return "C";
	}

	// Method to count vowels and consonants
	static int[] countVC(String text){
		int v=0,c=0;
		for(int i=0;i<text.length();i++){
			String r=checkChar(text.charAt(i));
			if(r.equals("V")) v++;
			else if(r.equals("C")) c++;
