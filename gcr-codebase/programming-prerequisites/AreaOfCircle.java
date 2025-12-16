import java.util.*;
public class AreaOfCircle{
	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius ");
		int r  = sc.nextInt();
	  double area = 3.14*r*r;
		System.out.println(area);
	}
}