import java.util.*;
public class CelsiusToFahrenheit{
	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int ans = (c* 9/5)+32;
		System.out.println(ans);
	}
}