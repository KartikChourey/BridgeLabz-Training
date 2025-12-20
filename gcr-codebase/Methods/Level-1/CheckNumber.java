import java.util.Scanner;
public class CheckNumber{
    // method to check number type
    public static int checkNumber(int n){
        if(n>0) return 1;
        if(n<0) return -1;
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
		
        // print result
        System.out.println(checkNumber(n));
        
    }
}
