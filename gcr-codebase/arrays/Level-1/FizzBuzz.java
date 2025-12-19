import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args){
        // scanner object
        Scanner sc=new Scanner(System.in);
        // ask number
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        // check positive
        if(n<=0){
            System.out.println("Invalid input");
            return;
        }
        // string array
        String[] arr=new String[n+1];
        // fizzbuzz logic
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0)
                arr[i]="FizzBuzz";
            else if(i%3==0)
                arr[i]="Fizz";
            else if(i%5==0)
                arr[i]="Buzz";
            else
                arr[i]=String.valueOf(i);
        }
        // print result
        for(int i=1;i<=n;i++)
            System.out.println("Position "+i+" = "+arr[i]);

    }
}
