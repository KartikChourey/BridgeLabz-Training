
import java.util.Scanner;
public class Copy{
    public static void main(String[] args){
        // scanner object
        Scanner sc=new Scanner(System.in);
        // ask rows
        System.out.print("Rows: ");
        int r=sc.nextInt();
        // ask columns
        System.out.print("Columns: ");
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        // input matrix
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=sc.nextInt();
        // 1D array
        int[] arr=new int[r*c];

        int index=0;
        
		
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                arr[index++]=mat[i][j];
			
        // print array
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
     
    }
}
