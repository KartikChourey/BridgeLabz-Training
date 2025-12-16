import java.util.*;
public class VolumeOfCylinder{
	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius ");
		int r = sc.nextInt();
		System.out.println("Enter Height ");
		int h = sc.nextInt();
		double volume = 2*3.14*r*r*h;
		System.out.println(volume);
	}
}