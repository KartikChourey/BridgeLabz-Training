import java.util.Scanner;
public class Trigonometry{
	
    // method to calculate sin cos tan
    public static double[] calculateTrigonometricFunctions(double angle){
        double rad=Math.toRadians(angle);
        return new double[]{Math.sin(rad),Math.cos(rad),Math.tan(rad)};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double angle=sc.nextDouble();
        double[] r=calculateTrigonometricFunctions(angle);
		
		
        // display results
        System.out.println("Sin = "+r[0]);
        System.out.println("Cos = "+r[1]);
        System.out.println("Tan = "+r[2]);
     
    }
}
