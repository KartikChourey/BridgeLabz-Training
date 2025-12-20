import java.util.Scanner;
public class Number{
	
    // method to check positive number
    public static boolean isPositive(int n){
        return n>0;
    }
    // method to check even number
    public static boolean isEven(int n){
        return n%2==0;
    }
    // method to compare two numbers
    public static int compare(int a,int b){
        if(a>b) return 1;
        if(a<b) return -1;
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            if(isPositive(arr[i])){
                if(isEven(arr[i]))
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            }else
                System.out.println("Negative");
        }
		
		
        // compare first and last element
        int r=compare(arr[0],arr[4]);
        if(r==0)
            System.out.println("First and Last are Equal");
        else if(r>0)
            System.out.println("First is Greater");
        else
            System.out.println("First is Smaller");
    
    }
}
