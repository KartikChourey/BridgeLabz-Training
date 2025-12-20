import java.util.Scanner;

public class Marks {

    // generates random PCM marks for students
    public static int[][] generatePCMMarks(int students){
        int[][] marks=new int[students][3];
        for(int i=0;i<students;i++){
            marks[i][0]=10+(int)(Math.random()*90); // physics
            marks[i][1]=10+(int)(Math.random()*90); // chemistry
            marks[i][2]=10+(int)(Math.random()*90); // maths
        }
        return marks;
    }

    // calculates total, average and percentage
    public static double[][] calculateResults(int[][] marks){
        double[][] result=new double[marks.length][3];
        for(int i=0;i<marks.length;i++){
            int total=marks[i][0]+marks[i][1]+marks[i][2];
            double avg=total/3.0;
            double percent=(total/300.0)*100;
            result[i][0]=total;
            result[i][1]=Math.round(avg*100.0)/100.0;
            result[i][2]=Math.round(percent*100.0)/100.0;
        }
        return result;
    }

    // displays student scorecard
    public static void displayScoreCard(int[][] marks,double[][] result){
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent");
        for(int i=0;i<marks.length;i++){
            System.out.println(
                marks[i][0]+"\t"+
                marks[i][1]+"\t"+
                marks[i][2]+"\t"+
                result[i][0]+"\t"+
                result[i][1]+"\t"+
                result[i][2]
            );
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // input number of students
        int students=sc.nextInt();
        int[][] marks=generatePCMMarks(students);
        double[][] result=calculateResults(marks);
		
		// Show result of students
        displayScoreCard(marks,result);
   
    }
}
