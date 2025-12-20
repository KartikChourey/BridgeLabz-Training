import java.util.*;

public class SpringSeason{
    // method to check spring season
    public static boolean isSpring(int m,int d){
        return (m==3&&d>=20)||(m==4)||(m==5)||(m==6&&d<=20);
    }
    public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
        // command line input
        int month= sc.nextInt();
        int day= sc.nextInt();
		
        // check and print
        if(isSpring(month,day))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
