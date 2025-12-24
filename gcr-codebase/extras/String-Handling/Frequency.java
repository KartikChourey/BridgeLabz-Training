import java.util.*;

public class Frequency{
    public static void main(String[] args) {
		
		// creating scanner object and taking input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
		String s = sc.next();
		int[] freq = new int[256];
		int max = 0;
		char result = 'a';
		
		// Traversing the array 
		for(char ch : s.toCharArray()){
			freq[ch]++;
			if(freq[ch] > max){
				max = freq[ch];
				result = ch;
			}
		}
		
		System.out.println("The most frequent char is " + result);
		
    }
}