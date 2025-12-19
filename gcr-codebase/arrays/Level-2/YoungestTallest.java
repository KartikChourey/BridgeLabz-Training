// import scanner
import java.util.Scanner;

public class YoungestTallest{
    public static void main(String[] args){
        // scanner object
        Scanner sc=new Scanner(System.in);
        // names array
        String[] names={"Amar","Akbar","Anthony"};
        // age array
        int[] age=new int[3];
        // height array
        double[] height=new double[3];
        // input loop
        for(int i=0;i<3;i++){
            System.out.print("Enter age of "+names[i]+": ");
            age[i]=sc.nextInt();
            System.out.print("Enter height of "+names[i]+": ");
            height[i]=sc.nextDouble();
        }

        int youngestIndex=0;
        // initial tallest
        int tallestIndex=0;
        // comparison loop
		
        for(int i=1;i<3;i++){
            if(age[i]<age[youngestIndex])
                youngestIndex=i;
            if(height[i]>height[tallestIndex])
                tallestIndex=i;
        }

        System.out.println("Youngest friend is "+names[youngestIndex]);
        System.out.println("Tallest friend is "+names[tallestIndex]);
      
    }
}
