import java.util.Scanner;
public class Triangle{
	
    // method to calculate rounds
    public static double calculateRounds(double a,double b,double c){
        double perimeter=a+b+c;
        return 5000/perimeter;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
        // input sides of triangle
        System.out.print("Enter three sides: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
		
		
        // display rounds
        System.out.println("Rounds needed = "+calculateRounds(a,b,c));
       
    }
}
