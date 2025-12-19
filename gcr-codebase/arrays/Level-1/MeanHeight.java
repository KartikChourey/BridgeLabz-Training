import java.util.Scanner;

public class MeanHeight{
    public static void main(String[] args){
        // scanner object
        Scanner sc=new Scanner(System.in);
        // height array
        double[] heights=new double[11];
        // sum variable
        double sum=0;
        // input loop
        for(int i=0;i<heights.length;i++){
            // ask height
            System.out.print("Enter height of player "+(i+1)+": ");
            // store height
            heights[i]=sc.nextDouble();
            // add to sum
            sum+=heights[i];
        }
        // calculate mean
        double mean=sum/heights.length;
       
        System.out.println("Mean height = "+mean);
       
    }
}
