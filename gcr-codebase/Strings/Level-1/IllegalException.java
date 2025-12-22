import java.util.*;

public class IllegalException{
	public static void main (String args[]) {
		
		// Creating Scanner Object 
		Scanner sc = new Scanner(System.in);
		
		// taking input 
		String string = sc.nextLine();
		
		// Handling the exception 
		try{
			GenerateException(string);
		} catch (StringIndexOutOfBoundsException e ){
			System.out.println(" IllegalArgumentException handled ! ");
		}
		
	}
	
	// Method To Generate Exception 
	static void GenerateException(String string){
		string.substring(0,string.length()+1);
	}
}