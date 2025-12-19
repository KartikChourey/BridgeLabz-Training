import java.util.Scanner;

public class LargestDigits{
    public static void main(String[] args){
        // scanner object
        Scanner sc=new Scanner(System.in);
        // ask number
        System.out.print("Enter number: ");
        int number=sc.nextInt();
      
        int maxDigit=10;
      
        int[] digits=new int[maxDigit];
      
        int index=0;
        // extract digits
        while(number!=0){
            if(index==maxDigit)
                break;
            digits[index++]=number%10;
            number/=10;
        }
        // largest value
        int largest=0;
        // second largest
        int secondLargest=0;
        // loop to find values
        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            }
            else if(digits[i]>secondLargest&&digits[i]!=largest){
                secondLargest=digits[i];
            }
        }
		
        // print results
        System.out.println("Largest = "+largest);
        System.out.println("Second Largest = "+secondLargest);
     
    }
}
