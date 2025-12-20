import java.util.Scanner;

public class Division{
	
    // method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int n,int d){
        return new int[]{n/d,n%d};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] r=findRemainderAndQuotient(n,d);
		
        // print values
        System.out.println("Quotient = "+r[0]);
        System.out.println("Remainder = "+r[1]); 
    }
}
