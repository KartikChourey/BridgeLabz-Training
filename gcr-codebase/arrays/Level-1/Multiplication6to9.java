import java.util.Scanner;
public class Multiplication6to9{
   public static void main(String[] args){
       // scanner object
        Scanner sc=new Scanner(System.in);
        // ask number
        System.out.print("Enter a number: ");
        // store number
        int number=sc.nextInt();
        // array for result
        int[] result=new int[4];
		
		
        // loop 6 to 9
        for(int i=6;i<=9;i++){
            // store result
            result[i-6]=number*i;
        }
        // print result
        for(int i=6;i<=9;i++){
            // display output
            System.out.println(number+" * "+i+" = "+result[i-6]);
        }
       
    }
}
