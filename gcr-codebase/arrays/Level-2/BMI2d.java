
import java.util.Scanner;

public class BMI2d{

    public static void main(String[] args){
       
        Scanner sc=new Scanner(System.in);
     
        System.out.print("Enter number of persons: ");
        int number=sc.nextInt();
        // 2D array for weight height bmi
        double[][] personData=new double[number][3];
 
        String[] weightStatus=new String[number];
        // input loop
        for(int i=0;i<number;i++){
          
            System.out.print("Enter weight of person "+(i+1)+": ");
            personData[i][0]=sc.nextDouble();

            if(personData[i][0]<=0){
                System.out.println("Invalid weight, enter again");
                i--;
                continue;
            }
        
            System.out.print("Enter height of person "+(i+1)+": ");
            personData[i][1]=sc.nextDouble();
            // validate height
            if(personData[i][1]<=0){
                System.out.println("Invalid height, enter again");
                i--;
                continue;
            }
        }
    
        for(int i=0;i<number;i++){
       
            personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);
            // check bmi status
            if(personData[i][2]<=18.4)
                weightStatus[i]="Underweight";
            else if(personData[i][2]>=18.5&&personData[i][2]<=24.9)
                weightStatus[i]="Normal";
            else if(personData[i][2]>=25.0&&personData[i][2]<=39.9)
                weightStatus[i]="Overweight";
            else
                weightStatus[i]="Obese";
        }
        // display result
        for(int i=0;i<number;i++){
            System.out.println("Person "+(i+1));
            System.out.println("Weight = "+personData[i][0]);
            System.out.println("Height = "+personData[i][1]);
            System.out.println("BMI = "+personData[i][2]);
            System.out.println("Status = "+weightStatus[i]);
        }
     
    }
}
