import java.util.Scanner;

public class Calendar{

    // returns month name using array
    public static String getMonthName(int month){
        String[] months={"January","February","March","April","May","June",
                         "July","August","September","October","November","December"};
        return months[month-1];
    }

    // checks leap year
    public static boolean isLeapYear(int year){
        return (year%4==0 && year%100!=0) || (year%400==0);
    }

    // returns number of days in a month
    public static int getDaysInMonth(int month,int year){
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2 && isLeapYear(year)) return 29;
        return days[month-1];
    }

    // returns first day of the month (0=Sun,1=Mon...)
    public static int getFirstDay(int month,int year){
        int d=1;
        if(month<3){
            month+=12;
            year--;
        }
        int k=year%100;
        int j=year/100;
        int day=(d+(13*(month+1))/5+k+(k/4)+(j/4)+(5*j))%7;
        return (day+6)%7; // convert to Sunday start
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // input month and year
        System.out.print("Enter month: ");
        int month=sc.nextInt();
        System.out.print("Enter year: ");
        int year=sc.nextInt();

        int firstDay=getFirstDay(month,year);
        int totalDays=getDaysInMonth(month,year);

        // print header
        System.out.println("\n"+getMonthName(month)+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // indentation for first day
        for(int i=0;i<firstDay;i++)
            System.out.print("    ");

        // print days
        for(int day=1;day<=totalDays;day++){
            System.out.printf("%3d ",day);
            if((day+firstDay)%7==0)
                System.out.println();
        }
  
    }
}
