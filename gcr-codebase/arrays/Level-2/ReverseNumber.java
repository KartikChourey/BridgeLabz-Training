
import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args){
        // scanner object
        Scanner sc=new Scanner(System.in);
        // ask number
        System.out.print("Enter number: ");
        int number=sc.nextInt();
       
        int temp=number;
    
        int count=0;
        // count digits
        while(temp!=0){
            count++;
            temp/=10;
        }
        // digits array
        int[] digits=new int[count];
      
        int index=0;
   
        while(number!=0){
            digits[index++]=number%10;
            number/=10;
        }
     
        int[] reverse=new int[count];
        // reverse logic
        for(int i=0;i<count;i++)
            reverse[i]=digits[count-1-i];
		
		
        // print reverse
        System.out.println("Reversed number:");
        for(int i=0;i<count;i++)
            System.out.print(reverse[i]);
   
    }
}
