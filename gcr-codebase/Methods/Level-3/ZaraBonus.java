public class ZaraBonus {

    // generates salary and years of service
    public static double[][] generateEmployeeData(){
        double[][] data=new double[10][2];
        for(int i=0;i<10;i++){
            data[i][0]=10000+(Math.random()*90000); // 5 digit salary
            data[i][1]=1+(int)(Math.random()*10);  // years of service
        }
        return data;
    }

    // calculates new salary and bonus
    public static double[][] calculateBonus(double[][] data){
        double[][] result=new double[10][2];
        for(int i=0;i<10;i++){
            double salary=data[i][0];
            double years=data[i][1];
            double bonusRate=(years>5)?0.05:0.02;
            double bonus=salary*bonusRate;
            result[i][0]=salary+bonus; // new salary
            result[i][1]=bonus;
        }
        return result;
    }

    // prints totals in tabular format
    public static void printTotals(double[][] oldData,double[][] newData){
        double oldSum=0,newSum=0,bonusSum=0;
        for(int i=0;i<10;i++){
            oldSum+=oldData[i][0];
            newSum+=newData[i][0];
            bonusSum+=newData[i][1];
        }
        System.out.println("Total Old Salary : "+oldSum);
        System.out.println("Total New Salary : "+newSum);
        System.out.println("Total Bonus Paid : "+bonusSum);
    }

    public static void main(String[] args){
        double[][] employeeData=generateEmployeeData();
        double[][] bonusData=calculateBonus(employeeData);
        printTotals(employeeData,bonusData);
    }
}
