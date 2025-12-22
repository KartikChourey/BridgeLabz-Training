import java.util.*;

public class RockPaperScissors{
	static int userWin=0,compWin=0;

	public static void main(String args[]){
		// Scanner for number of games
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter games:");
		int n=sc.nextInt();

		// Play multiple games
		for(int i=0;i<n;i++){
			int user=sc.nextInt(); // 0-rock,1-paper,2-scissors
			int comp=computerChoice();
			int w=winner(user,comp);
			if(w==1) userWin++;
			else if(w==2) compWin++;
		}

		// Display statistics
		displayStats(n);
	}

	// Method to generate computer choice
	static int computerChoice(){
		return (int)(Math.random()*3);
	}

	// Method to decide winner
	static int winner(int u,int c){
		if(u==c) return 0;
		if((u==0&&c==2)||(u==1&&c==0)||(u==2&&c==1)) return 1;
		return 2;
	}

	// Method to display win percentage
	static void displayStats(int n){
		System.out.println("User Wins: "+userWin);
		System.out.println("Computer Wins: "+compWin);
		System.out.println("User %: "+(userWin*100/n));
		System.out.println("Computer %: "+(compWin*100/n));
	}
}
