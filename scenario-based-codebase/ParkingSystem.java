import java.util.*;
public class ParkingSystem{
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome TO Online Parking System");
		int totalspace = 50;
		int fullslots = 0;
		int choice ;
		
		
     while(fullslots<totalspace){
		 System.out.println("1. Park Your Car ");
		 System.out.println("2. Exit Your Car ");
		 System.out.println("3. Show Occupancy ");
		 System.out.println("4 Exit Menu ");
		 
		 System.out.println("Enter Your Choice ");
		 choice = sc.nextInt();
		 switch (choice){
			 case 1 :
			   if(fullslots<totalspace) {
				   fullslots++;
				   System.out.println("Your Car Parked Successfully");
			   }
			   else   System.out.println("Parking is Full");
			   break;
			   
			 case 2 :
			  if(fullslots>0)  {
				  fullslots--;
				  System.out.println("Your Car Exited Successfully");
			  } else System.out.println("Parking is Empty ");
			  break;
			  
			 case 3 :   
			 System.out.println("Out of "+ totalspace+  " / "+ fullslots +" Are Full " );
			  System.out.println( "Available SLots =" +  (totalspace-fullslots) );
			  break;
			 
			 case 4 : 
			  return;
			 
			 default : 
			 System.out.println("InValid Choice");
			 break;
			  
		 }
		 
	 }
	 System.out.println("Parking is Full ");
		 
	}
}