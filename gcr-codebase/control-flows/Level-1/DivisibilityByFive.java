import java.util.*;
public class DivisibilityByFive{
public static void main (String args[]){
      
	  // Creating Scanner Object
     Scanner input = new Scanner(System.in);
	 
	 // Taking Number Input
	 int number = input.nextInt();
	 
	 // Checking whether the number is divisible by 5 or not 
	 if(number%5==0) {
	 
	 // Displaying whether it is divisible or not 
	 System.out.println("Is the number "+ number+" divisible by 5? Yes");
	 }
	 else  {
	  System.out.println("Is the number "+ number+" divisible by 5? No");
	  }
	  
	  // Closing Scanner
	   input.close();
}

}