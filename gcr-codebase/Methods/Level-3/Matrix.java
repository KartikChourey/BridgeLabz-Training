public class Matrix{

    // creates random matrix
    public static int[][] createMatrix(int r,int c){
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                m[i][j]=1+(int)(Math.random()*9);
        return m;
    }

    // matrix addition
    public static int[][] addMatrix(int[][] a,int[][] b){
        int[][] res=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                res[i][j]=a[i][j]+b[i][j];
        return res;
    }

    // matrix subtraction
    public static int[][] subtractMatrix(int[][] a,int[][] b){
        int[][] res=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                res[i][j]=a[i][j]-b[i][j];
        return res;
    }

    // matrix multiplication
    public static int[][] multiplyMatrix(int[][] a,int[][] b){
        int[][] res=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<b[0].length;j++)
                for(int k=0;k<b.length;k++)
                    res[i][j]+=a[i][k]*b[k][j];
        return res;
    }

    // display matrix
    public static void display(int[][] m){
        for(int[] row:m){
            for(int x:row)
                System.out.print(x+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] a=createMatrix(2,2);
        int[][] b=createMatrix(2,2);

        System.out.println("Matrix A");
        display(a);
        System.out.println("Matrix B");
        display(b);

        System.out.println("Addition");
        display(addMatrix(a,b));

        System.out.println("Subtraction");
        display(subtractMatrix(a,b));

        System.out.println("Multiplication");
        display(multiplyMatrix(a,b));
    }
}
