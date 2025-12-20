import java.util.Scanner;
public class Chocolates{
	
    // division logic
    public static int[] find(int c,int kids){
        return new int[]{c/kids,c%kids};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chocolates=sc.nextInt();
        int children=sc.nextInt();
        int[] r=find(chocolates,children);
		
		
        // display distribution
        System.out.println("Each child gets = "+r[0]);
        System.out.println("Remaining = "+r[1]);
      
    }
}
