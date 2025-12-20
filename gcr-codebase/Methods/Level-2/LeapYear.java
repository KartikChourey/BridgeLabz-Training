import java.util.Scanner;

public class LeapYear{
    // method to check leap year
    public static boolean isLeapYear(int y){
        if(y<1582) return false;
        return (y%4==0&&y%100!=0)||(y%400==0);
    }
	
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
		
		// Display Output
        if(isLeapYear(year))
            System.out.println("Year is a Leap Year");
        else
            System.out.println("Year is not a Leap Year");
      
    }
}
