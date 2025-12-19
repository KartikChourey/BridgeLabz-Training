import java.util.Scanner;
public class Factors{
    public static void main(String[] args){
        // scanner object
        Scanner sc=new Scanner(System.in);
        // ask number
        System.out.print("Enter number: ");
        // store number
        int num=sc.nextInt();
        int size=10;
        // factors array
        int[] factors=new int[size];
		
		
        // index variable
        int index=0;
        for(int i=1;i<=num;i++){
            // factor check
            if(num%i==0){
                if(index==size){
                    size*=2;
                    int[] temp=new int[size];
                    for(int j=0;j<factors.length;j++)
                        temp[j]=factors[j];
                    factors=temp;
                }
                factors[index++]=i;
            }
        }
		
		
		
        System.out.println("Factors:");
        for(int i=0;i<index;i++)
            System.out.print(factors[i]+" ");
      
    }
}
