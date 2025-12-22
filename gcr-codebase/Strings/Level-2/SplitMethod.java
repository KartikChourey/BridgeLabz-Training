import java.util.*;

public class SplitMethod{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter text:");
		String text=sc.nextLine();

	
		String manual[]=manualSplit(text);

		
		String builtIn[]=text.split(" ");

		// Comparing both results
		boolean result=compareArrays(manual,builtIn);

		// Displaying result
		System.out.println("Comparison Result: "+result);
	}

	// Method to find string length without using length()
	static int getLength(String text){
		int count=0;
		try{
			while(true){
				text.charAt(count);
				count++;
			}
		}catch(RuntimeException e){}
		return count;
	}

	// Method to split text into words using charAt()
	static String[] manualSplit(String text){
		int len=getLength(text);
		int spaceCount=0;

		// Counting number of spaces
		for(int i=0;i<len;i++){
			if(text.charAt(i)==' ')
				spaceCount++;
		}

		// Number of words = spaces + 1
		String words[]=new String[spaceCount+1];
		int start=0,wordIndex=0;

		// Extracting words using indexes
		for(int i=0;i<len;i++){
			if(text.charAt(i)==' '){
				words[wordIndex++]=extractWord(text,start,i);
				start=i+1;
			}
		}
		words[wordIndex]=extractWord(text,start,len);
		return words;
	}

	// Method to extract word using charAt()
	static String extractWord(String text,int start,int end){
		String word="";
		for(int i=start;i<end;i++)
			word+=text.charAt(i);
		return word;
	}

	// Method to compare two String arrays
	static boolean compareArrays(String a[],String b[]){
		if(a.length!=b.length)
			return false;
		for(int i=0;i<a.length;i++){
			if(!a[i].equals(b[i]))
				return false;
		}
		return true;
	}
}
