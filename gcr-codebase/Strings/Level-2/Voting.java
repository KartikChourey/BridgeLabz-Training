import java.util.*;

public class Voting{
	public static void main(String args[]){
		// Generate random ages for 10 students
		int ages[]=randomAges(10);

		// Check voting eligibility
		String res[][]=checkVote(ages);

		// Display result
		display(res);
	}

	// Method to generate random 2-digit ages
	static int[] randomAges(int n){
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=(int)(Math.random()*90);
		return a;
	}

	// Method to check if student can vote
	static String[][] checkVote(int a[]){
		String r[][]=new String[a.length][2];
		for(int i=0;i<a.length;i++){
			r[i][0]=String.valueOf(a[i]);
			r[i][1]=(a[i]>=18)?"true":"false";
		}
		return r;
	}

	// Method to display 2D array
	static void display(String a[][]){
		System.out.println("Age\tCanVote");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i][0]+"\t"+a[i][1]);
	}
}
