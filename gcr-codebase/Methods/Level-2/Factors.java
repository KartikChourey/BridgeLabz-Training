import java.util.Scanner;
public class Factor{
	
    // method to find factors and return array
    public static int[] findFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++)
            if(n%i==0) count++;
        int[] factors=new int[count];
        int idx=0;
        for(int i=1;i<=n;i++)
            if(n%i==0) factors[idx++]=i;
        return factors;
    }
    // method to find sum
    public static int findSum(int[] arr){
        int sum=0;
        for(int x:arr) sum+=x;
        return sum;
    }
    // method to find product
    public static long findProduct(int[] arr){
        long prod=1;
        for(int x:arr) prod*=x;
        return prod;
    }
    // method to find sum of squares
    public static double findSumOfSquares(int[] arr){
        double sum=0;
        for(int x:arr) sum+=Math.pow(x,2);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] factors=findFactors(n);
        System.out.println("Factors:");
        for(int x:factors) System.out.print(x+" ");
		
		// Display Outputs 
        System.out.println("\nSum = "+findSum(factors));
        System.out.println("Product = "+findProduct(factors));
        System.out.println("Sum of Squares = "+findSumOfSquares(factors));
        sc.close();
    }
}
