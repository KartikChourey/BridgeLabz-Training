package flipkey;



import java.util.Scanner;

public class Program {
public static String CleanseAndInvert(String input) {
	
	if(input.isEmpty() || input.length()<6) return "";
	String temp = input.toLowerCase();
	String resultString ="";
	for(char ch : temp.toCharArray()) {
		if((ch>64 && ch<91) || (ch>96 && ch<123)) {
			if(ch%2!=0) resultString+=ch;
		}
		else return "";
		
	}
	StringBuilder anss = new StringBuilder(resultString);
	anss.reverse();
	String anString="";
	for(int i=0;i<anss.length();i++) {
	 if(i%2==0) anString+=(char)(anss.charAt(i)-32);
		else anString+=anss.charAt(i);
	}
	return anString;
	
}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a String Input : ");
	String inputString =scanner.next();
 String anString=	CleanseAndInvert(inputString);
	if(anString.isEmpty()) System.out.println("Invalid Input");
	else System.out.println("The Generated Key is : "+anString);
}
}
