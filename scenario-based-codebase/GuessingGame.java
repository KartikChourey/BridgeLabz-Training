import java.util.*;

public class GuessingGame{
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Welcome To Online Guessing Game  ");
		 int guess = (int) (Math.random() *100) +1;
		 
		 
		 int number;
		 int chances =0;
		 do{
			 System.out.println("Enter Your Number that you Guessed : " );
			 number=sc.nextInt();
			 chances++;
			 if(number>guess) System.out.println("Too High");
			 else if(number < guess) System.out.println("Too Low");
			 else {
				 System.out.println("You guessed The Correct Number ");
				 break;
			 }
			 
		 } while(chances<5); 
			 if(guess!=number) {
				 System.out.println("Game Over ");
				 System.out.println("The number was : "+ guess);
			 }
		 
			 
		 
	
	}
}