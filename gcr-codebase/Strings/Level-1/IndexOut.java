public class IndexOut{
	public static void main (String args[]) {
		String string = "CapGemini";
		
		// Handling the exception 
		try{
			GenerateException(string);
		} catch (StringIndexOutOfBoundsException e ){
			System.out.println("StringIndexOutOfBoundsException handled ! ");
		}
		
	}
	
	// Method To Generate Exception 
	static void GenerateException(String string){
		string.charAt(string.length());
	}
}