import java.util.Scanner;

public class Wind{
    // method to calculate wind chill
    public static double calculateWindChill(double t,double v){
        return 35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
    }
	
	
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double t=sc.nextDouble();
        double v=sc.nextDouble();
		
        // display wind chill
        System.out.println("Wind Chill = "+calculateWindChill(t,v));
       
    }
}
