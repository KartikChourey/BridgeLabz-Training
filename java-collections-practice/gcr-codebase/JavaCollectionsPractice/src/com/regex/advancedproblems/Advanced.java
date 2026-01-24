package com.regex.advancedproblems;
import java.util.*;
import java.util.regex.*;
public class Advanced {
 public static void main (String args[]) {
	 String ip = "192.168.1.1";

	// 10 . Validate IPv4 address
	System.out.println(ip.matches(
	"^((25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)\\.){3}" +
	"(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)$"));

	
	String card = "4111111111111111";

	// Visa
	String visaRegex = "^4\\d{15}$";

	// MasterCard
	String masterRegex = "^5\\d{15}$";

	System.out.println(card.matches(visaRegex) || card.matches(masterRegex));

	
	String text = "I love Java, Python, JavaScript, and Go";

	// Regex for known languages
	Pattern pattern1 = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b");

	Matcher matcher1 = pattern1.matcher(text);

	while (matcher1.find()) {
	    System.out.println(matcher1.group());
	}

	String text1 = "The price is $45.99 and discount is 10.50";

	// Regex for currency values
	Pattern pattern2 = Pattern.compile("\\$?\\d+\\.\\d{2}");

	Matcher matcher2 = pattern2.matcher(text);

	while (matcher2.find()) {
	    System.out.println(matcher2.group());
	}

	
	String text2 = "The price is $45.99 and discount is 10.50";

	// Regex for currency values
	Pattern pattern3 = Pattern.compile("\\$?\\d+\\.\\d{2}");

	Matcher matcher3 = pattern3.matcher(text);

	while (matcher3.find()) {
	    System.out.println(matcher3.group());
	}

	
	String sentence = "This is is a repeated repeated word";

	// Detect repeated words
	Pattern pattern4 = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE);

	Matcher matcher4 = pattern4.matcher(sentence);

	while (matcher4.find()) {
	    System.out.println(matcher4.group(1));
	}

	String ssn = "123-45-6789";

	// Validate SSN format
	System.out.println(ssn.matches("\\b\\d{3}-\\d{2}-\\d{4}\\b"));

	
 }
}
