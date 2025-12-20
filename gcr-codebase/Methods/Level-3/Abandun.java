import java.util.Scanner;

public class Abandun{

    // method to calculate sum of proper divisors
    public static int sumOfDivisors(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
                sum+=i;
        }
        return sum;
    }

    // checks if number is perfect
    public static boolean isPerfect(int num){
        return sumOfDivisors(num)==num;
    }

    // checks if number is abundant
    public static boolean isAbundant(int num){
        return sumOfDivisors(num)>num;
    }

    // checks if number is deficient
    public static boolean isDeficient(int num){
        return sumOfDivisors(num)<num;
    }

    // method to calculate factorial of a digit
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        return fact;
    }

    // checks if number is strong
    public static boolean isStrong(int num){
        int temp=num,sum=0;
        while(temp>0){
            int digit=temp%10;
            sum+=factorial(digit);
            temp/=10;
        }
        return sum==num;
    }
}

public class NumberCheckerDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // input number
        int num=sc.nextInt();

       // Showing Output 
        System.out.println("Perfect Number: "+NumberChecker.isPerfect(num));
        System.out.println("Abundant Number: "+NumberChecker.isAbundant(num));
        System.out.println("Deficient Number: "+NumberChecker.isDeficient(num));
        System.out.println("Strong Number: "+NumberChecker.isStrong(num));

      
    }
}
