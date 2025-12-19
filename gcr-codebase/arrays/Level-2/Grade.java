
import java.util.Scanner;

public class Grade{
   
    public static void main(String[] args){
      
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
      
        double[][] marks=new double[n][3];
       
        double[] percentage=new double[n];
      
        char[] grade=new char[n];
      
        for(int i=0;i<n;i++){
          
            System.out.print("Enter Physics marks of student "+(i+1)+": ");
            marks[i][0]=sc.nextDouble();
        
            if(marks[i][0]<0){
                System.out.println("Invalid marks, enter again");
                i--;
                continue;
            }
            System.out.print("Enter Chemistry marks of student "+(i+1)+": ");
            marks[i][1]=sc.nextDouble();
         
            if(marks[i][1]<0){
                System.out.println("Invalid marks, enter again");
                i--;
                continue;
            }
            // input maths marks
            System.out.print("Enter Maths marks of student "+(i+1)+": ");
            marks[i][2]=sc.nextDouble();
            // validate maths marks
            if(marks[i][2]<0){
                System.out.println("Invalid marks, enter again");
                i--;
                continue;
            }
        }
    
        for(int i=0;i<n;i++){
            // calculate percentage
            percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3;
            // assign grade
            if(percentage[i]>=80)
                grade[i]='A';
            else if(percentage[i]>=70)
                grade[i]='B';
            else if(percentage[i]>=60)
                grade[i]='C';
            else if(percentage[i]>=50)
                grade[i]='D';
            else if(percentage[i]>=40)
                grade[i]='E';
            else
                grade[i]='R';
        }
        // display result
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1));
            System.out.println("Physics = "+marks[i][0]);
            System.out.println("Chemistry = "+marks[i][1]);
            System.out.println("Maths = "+marks[i][2]);
            System.out.println("Percentage = "+percentage[i]);
            System.out.println("Grade = "+grade[i]);
        }
     
    }
}
