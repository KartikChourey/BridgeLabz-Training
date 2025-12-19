
import java.util.Scanner;

public class Grade2d{
  
    public static void main(String[] args){
        // scanner object
        Scanner sc=new Scanner(System.in);
    
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        // 2D array to store physics, chemistry and maths marks
        double[][] marks=new double[n][3];
        // array to store percentage
        double[] percentage=new double[n];
        // array to store grade
        char[] grade=new char[n];
        // loop to take marks input
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
            // validate chemistry marks
            if(marks[i][1]<0){
                System.out.println("Invalid marks, enter again");
                i--;
                continue;
            }
        
            System.out.print("Enter Maths marks of student "+(i+1)+": ");
            marks[i][2]=sc.nextDouble();
            // validate maths marks
            if(marks[i][2]<0){
                System.out.println("Invalid marks, enter again");
                i--;
            }
        }

        for(int i=0;i<n;i++){
            percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3;
            // check grade conditions
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
