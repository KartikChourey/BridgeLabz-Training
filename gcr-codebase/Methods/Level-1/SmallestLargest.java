import java.util.Scanner;
public class SmallestLargest{
	
	
    // method to find smallest and largest
    public static int[] findSmallestAndLargest(int a,int b,int c){
        int small=Math.min(a,Math.min(b,c));
        int large=Math.max(a,Math.max(b,c));
        return new int[]{small,large};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // input numbers
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[] res=findSmallestAndLargest(a,b,c);
		
		
        // display result
        System.out.println("Smallest = "+res[0]);
        System.out.println("Largest = "+res[1]);
        sc.close();
    }
}
