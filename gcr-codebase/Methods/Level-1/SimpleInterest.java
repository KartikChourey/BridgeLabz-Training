import java.util.Scanner;
public class SimpleInterest{
    // method to calculate simple interest
    public static double calculateSI(double p,double r,double t){
        return (p*r*t)/100;
    }
	
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // taking inputs
        System.out.print("Enter principal: ");
        double p=sc.nextDouble();
        System.out.print("Enter rate: ");
        double r=sc.nextDouble();
        System.out.print("Enter time: ");
        double t=sc.nextDouble();
		
		
        // calling method
        double si=calculateSI(p,r,t);
		
		
        // displaying result
        System.out.println("The Simple Interest is "+si+" for Principal "+p+", Rate of Interest "+r+" and Time "+t);
        sc.close();
    }
}
