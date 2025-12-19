
import java.util.Scanner;
public class DynamicLargest{
    public static void main(String[] args){
        // scanner object
        Scanner sc=new Scanner(System.in);
        // ask number
        System.out.print("Enter number: ");
        int number=sc.nextInt();
        // max digit size
        int maxDigit=10;
        // digits array
        int[] digits=new int[maxDigit];
        // index variable
        int index=0;

        while(number!=0){
            if(index==maxDigit){
                maxDigit+=10;
                int[] temp=new int[maxDigit];
                for(int i=0;i<digits.length;i++)
                    temp[i]=digits[i];
                digits=temp;
            }
            digits[index++]=number%10;
            number/=10;
        }
        // largest
        int largest=0;
        // second largest
        int secondLargest=0;
        // find values
        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            }
            else if(digits[i]>secondLargest&&digits[i]!=largest){
                secondLargest=digits[i];
            }
        }
        // print result
        System.out.println("Largest = "+largest);
        System.out.println("Second Largest = "+secondLargest);
      
    }
}
