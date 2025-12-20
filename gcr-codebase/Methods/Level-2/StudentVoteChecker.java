import java.util.Scanner;
public class StudentVoteChecker{
	
	
    // method to check voting eligibility
    public boolean canStudentVote(int age){
        if(age<0) return false;
        return age>=18;
    }
    public static void main(String[] args){
		
		// Scanner Object
        Scanner sc=new Scanner(System.in);
		
		// object of class
        StudentVoteChecker obj=new StudentVoteChecker();
        int[] age=new int[10];
		
        for(int i=0;i<10;i++){
            age[i]=sc.nextInt();
			
			// Display 
            if(obj.canStudentVote(age[i]))
                System.out.println("Can Vote");
            else
                System.out.println("Cannot Vote");
        }
        
    }
}
