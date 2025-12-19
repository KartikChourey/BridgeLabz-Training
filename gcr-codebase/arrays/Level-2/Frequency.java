import java.util.*;

public class Frequency{
	
	public static void main(String args[]){
		
		// Creating Scanner Object 
		Scanner sc = new Scanner(System.in);
		
		// ask user for input 
		int number = sc.nextInt();
		int temp = number;
		int count =0 ;
		
		// Counting Digits
		while(temp!=0){
			count++;
			temp/=10;
		}
		
		temp = number;
		int digits[] = new int [count];
		int index=0;
		
		// Storing Digits
		while(temp!=0){
			digits[index++]=temp%10;
			temp/=10;
		}
		
		// Creating Frequency Array
		int frequency[]= new int [10];
		
		// Updating Frequency
		for(int j=0;j<digits.length;j++){
			frequency[digits[j]]++;
		}
		
		//Displaying Frequency
		for(int k=0;k<frequency.length;k++){
			System.out.println("The Frequency of "+k+" is "+frequency[k]);
		}
	}
}