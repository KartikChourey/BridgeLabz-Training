import java.util.Scanner;
public class HandShakes{
    // method using combination formula
    public static int calculate(int n){
        return (n*(n-1))/2;
    }
	
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
		
        // display handshakes
        System.out.println("Maximum handshakes = "+calculate(n));
       
    }
}
