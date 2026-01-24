package com.regex.replaceandmodifyproblems;

public class Replace {

public static void main(String args[]) {
	
	String input = "This   is    an   example";

	// Replace 2 or more spaces with one space
	String output = input.replaceAll("\\s{2,}", " ");

	System.out.println(output);

	
	// Remove Bad words
	String text = "This is a damn bad example with stupid words";

	//Bad words list
	String badWords = "\\b(damn|stupid)\\b";

	//Replace bad words with ****
	String cleanText = text.replaceAll(badWords, "****");

	System.out.println(cleanText);
	
}


}
