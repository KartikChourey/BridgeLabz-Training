import java.util.*;

public class VotingArray{
public static void main (String args[]){

// Creating Scanner Object
Scanner sc = new Scanner(System.in);

// Initializing student array
int student[] = new int [10];

// taking input from user
for(int i=0;i<student.length;i++){
	System.out.println("Enter Student's age : ");
student[i]= sc.nextInt();
}


// Checking whether the student can vote or not 
for(int i=0;i<student.length;i++){
if(student[i]<0) System.out.println("InValid Age");
else if (student[i]>=18) System.out.println("The student with the age "+student[i]+" can vote");
else System.out.println("The student with the age "+student[i]+" cannot vote.");
}

}
}