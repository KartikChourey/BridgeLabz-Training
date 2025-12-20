import java.util.Scanner;


public class BMI{
    // method to calculate BMI and store in 3rd column
    public static void calculateBMI(double[][] data){
        for(int i=0;i<10;i++){
            double heightMeter=data[i][1]/100; 
            data[i][2]=data[i][0]/(heightMeter*heightMeter); // BMI formula
        }
    }
    // method to find BMI status
    public static String[] findBMIStatus(double[][] data){
        String[] status=new String[10];
        for(int i=0;i<10;i++){
            if(data[i][2]<=18.4)
                status[i]="Underweight";
            else if(data[i][2]>=18.5&&data[i][2]<=24.9)
                status[i]="Normal";
            else if(data[i][2]>=25.0&&data[i][2]<=39.9)
                status[i]="Overweight";
            else
                status[i]="Obese";
        }
        return status;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // 2D array: weight, height, bmi
        double[][] personData=new double[10][3];
        // input weight and height
        for(int i=0;i<10;i++){
            System.out.print("Enter weight of person "+(i+1)+": ");
            personData[i][0]=sc.nextDouble();
            System.out.print("Enter height (cm) of person "+(i+1)+": ");
            personData[i][1]=sc.nextDouble();
        }
        // calculate bmi values
        calculateBMI(personData);
        // get bmi status
        String[] status=findBMIStatus(personData);
		
		
        // display result
        for(int i=0;i<10;i++){
            System.out.println("Person "+(i+1));
            System.out.println("Weight = "+personData[i][0]);
            System.out.println("Height = "+personData[i][1]);
            System.out.println("BMI = "+personData[i][2]);
            System.out.println("Status = "+status[i]);
        }
        sc.close();
    }
}
