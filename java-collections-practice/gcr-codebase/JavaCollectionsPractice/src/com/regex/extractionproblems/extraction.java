package com.regex.extractionproblems;
import java.util.*;
import java.util.regex.*;
public class extraction {

	public static void main (String args []) {
		String text = "Contact us at support@example.com and info@company.org";

		// Regex for email extraction
		Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,}");

		
		Matcher matcher = pattern.matcher(text);

		
		while (matcher.find()) {
		    System.out.println(matcher.group());
		}
		
		String sentence = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York";

		// Regex for capitalized words
		Pattern pattern1 = Pattern.compile("\\b[A-Z][a-z]+\\b");

		Matcher matcher1 = pattern.matcher(sentence);

		// Print each capitalized word
		while (matcher1.find()) {
		    System.out.println(matcher1.group());
		}

		
		String text1 = "Events on 12/05/2023 and 15/08/2024";

		// Regex for date format
		Pattern pattern2 = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b");

		Matcher matcher2 = pattern.matcher(text);

		while (matcher2.find()) {
		    System.out.println(matcher2.group());
		}

		
		
		String page = "Visit https://www.google.com and http://example.org";

		// Regex for URLs
		Pattern pattern3 = Pattern.compile("https?://[^\\s]+");

		Matcher matcher3 = pattern.matcher(page);

		while (matcher3.find()) {
		    System.out.println(matcher.group());
		}


	}
}
