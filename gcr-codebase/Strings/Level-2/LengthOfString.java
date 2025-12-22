public class LengthOfString {
	public static void main (Strings args[]){
		
		// Scanner object 
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int builtin = s.length();
         int manual = count(s);
		 
		 // Displaying the output 
		 System.out.println("Length using user-defined method: "+manual);
		System.out.println("Length using built-in method: "+builtIn);
		
	}
	
	 // Method for counting the length 
	static int count(String s ){
		int count  =0;
		try{
			while(true){
			s.charAt(count);
			count++;
		}
		
		} catch (RuntimeException e){}
		return count ;
	}
}