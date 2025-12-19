
import java.util.Scanner;
public class Bonus{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
      
        double[] salary=new double[10];

        double[] service=new double[10];
       
        double[] bonus=new double[10];
        double[] newSalary=new double[10];
        double totalBonus=0;
        // total old salary
        double totalOldSalary=0;
        // total new salary
        double totalNewSalary=0;
		
        for(int i=0;i<10;i++){
            // ask salary
            System.out.print("Enter salary of employee "+(i+1)+": ");
            salary[i]=sc.nextDouble();
            // ask service
            System.out.print("Enter years of service: ");
            service[i]=sc.nextDouble();
            if(salary[i]<=0||service[i]<0){
                System.out.println("Invalid input, enter again");
                i--;
                continue;
            }
        }
        for(int i=0;i<10;i++){
            // old salary sum
            totalOldSalary+=salary[i];
            // bonus condition
            if(service[i]>5)
                bonus[i]=salary[i]*0.05;
            else
                bonus[i]=salary[i]*0.02;
            // new salary
            newSalary[i]=salary[i]+bonus[i];
            // total bonus
            totalBonus+=bonus[i];
            // total new salary
            totalNewSalary+=newSalary[i];
        }
		
        System.out.println("Total Bonus = "+totalBonus);
        System.out.println("Total Old Salary = "+totalOldSalary);
        System.out.println("Total New Salary = "+totalNewSalary);
     
    }
}
