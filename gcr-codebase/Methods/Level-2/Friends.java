import java.util.Scanner;
public class Friends{
	
    // method to find youngest age
    public static int findYoungest(int[] age){
        int min=age[0];
        for(int x:age)
            if(x<min) min=x;
        return min;
    }
    // method to find tallest height
    public static double findTallest(double[] h){
        double max=h[0];
        for(double x:h)
            if(x>max) max=x;
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		
        // arrays to store age and height
        int[] age=new int[3];
        double[] height=new double[3];
        // input age and height of 3 friends
        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
            height[i]=sc.nextDouble();
        }
		
		
        // display results
        System.out.println("Youngest Age = "+findYoungest(age));
        System.out.println("Tallest Height = "+findTallest(height));
       
    }
}
