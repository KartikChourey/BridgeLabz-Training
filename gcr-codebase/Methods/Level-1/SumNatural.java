import java.util.Scanner;
public class SumNatural{
	
    // method to find sum using loop
    public static int findSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++) sum+=i;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
		
		
        // display sum
        System.out.println("Sum = "+findSum(n));
      
    }
}
