import java.util.*;

public class PrintOddEven{
public static void main (String args[]){
	
	System.out.println("Enter A Number : ");

// Creating Scanner Object 
Scanner sc = new Scanner(System.in);

// Taking Input 
int number = sc.nextInt();

// Loop
for(int i=1;i<=number;i++){

// Checking Number is even or odd 
if(i%2==0) {

// Printing whether number is even or odd 
System.out.println(i + " is a Even Number");

}
else  System.out.println(i + " is a Odd Number");
}
}
}