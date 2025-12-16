import java.util.*;
public class PerimeterofRectangle{
	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length ");
		int l = sc.nextInt();
		System.out.println("Enter Breadth ");
		int b = sc.nextInt();
		
		int  perimeter= 2*(l+b);
		System.out.println(perimeter);
	}
}