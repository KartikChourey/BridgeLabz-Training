
import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        // scanner object
        Scanner sc=new Scanner(System.in);
        // ask number
        System.out.print("Enter a natural number: ");
        // store number
        int n=sc.nextInt();
        // check natural number
        if(n<=0){
            System.out.println("Invalid input");
            return;
        }
        int[] odd=new int[n/2+1];
        int[] even=new int[n/2+1];
        // index variables
        int oi=0,ei=0;
        // loop from 1 to n
        for(int i=1;i<=n;i++){
            if(i%2==0)
                even[ei++]=i;
            else
                odd[oi++]=i;
        }
        System.out.println("Odd numbers:");
        for(int i=0;i<oi;i++)
            System.out.print(odd[i]+" ");
        // print even
        System.out.println("\nEven numbers:");
        for(int i=0;i<ei;i++)
            System.out.print(even[i]+" ");
   
    }
}
