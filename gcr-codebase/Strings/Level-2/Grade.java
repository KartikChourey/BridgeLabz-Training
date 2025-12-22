import java.util.*;

public class Grade{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		// Taking number of students
		System.out.println("Enter number of students:");
		int n=sc.nextInt();

		// Generate random PCM scores
		int pcm[][]=generateScores(n);

		// Calculate total, average and percentage
		double result[][]=calculateResult(pcm);

		// Calculate grades based on percentage
		String grades[]=calculateGrade(result);

		// Display final scorecard
		displayScoreCard(pcm,result,grades);
	}

	// Method to generate random 2-digit PCM scores
	static int[][] generateScores(int n){
		int scores[][]=new int[n][3];
		for(int i=0;i<n;i++){
			scores[i][0]=(int)(Math.random()*100);
			scores[i][1]=(int)(Math.random()*100);
			scores[i][2]=(int)(Math.random()*100);
		}
		return scores;
	}

	// Method to calculate total, average and percentage
	static double[][] calculateResult(int pcm[][]){
		double res[][]=new double[pcm.length][3];
		for(int i=0;i<pcm.length;i++){
			int total=pcm[i][0]+pcm[i][1]+pcm[i][2];
			double avg=total/3.0;
			double per=avg;

			// Rounding to 2 digits
			avg=Math.round(avg*100.0)/100.0;
			per=Math.round(per*100.0)/100.0;

			res[i][0]=total;
			res[i][1]=avg;
			res[i][2]=per;
		}
		return res;
	}

	// Method to calculate grade based on percentage table
	static String[] calculateGrade(double result[][]){
		String grade[]=new String[result.length];
		for(int i=0;i<result.length;i++){
			double p=result[i][2];

			if(p>=80) grade[i]="A";
			else if(p>=70) grade[i]="B";
			else if(p>=60) grade[i]="C";
			else if(p>=50) grade[i]="D";
			else if(p>=40) grade[i]="E";
			else grade[i]="R";
		}
		return grade;
	}

	// Method to display scorecard in tabular format
	static void displayScoreCard(int pcm[][],double res[][],String grade[]){
		System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPer\tGrade");
		for(int i=0;i<pcm.length;i++){
			System.out.println(
				pcm[i][0]+"\t"+
				pcm[i][1]+"\t"+
				pcm[i][2]+"\t"+
				(int)res[i][0]+"\t"+
				res[i][1]+"\t"+
				res[i][2]+"\t"+
				grade[i]
			);
		}
	}
}
