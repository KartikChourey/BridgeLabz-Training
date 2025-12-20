public class MatrixOperations{

    // creates random matrix
    public static double[][] createMatrix(int r,int c){
        double[][] m=new double[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                m[i][j]=1+(int)(Math.random()*9);
        return m;
    }

    // transpose of matrix
    public static double[][] transpose(double[][] m){
        double[][] t=new double[m[0].length][m.length];
        for(int i=0;i<m.length;i++)
            for(int j=0;j<m[0].length;j++)
                t[j][i]=m[i][j];
        return t;
    }

    // determinant of 2x2
    public static double det2x2(double[][] m){
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }

    // determinant of 3x3
    public static double det3x3(double[][] m){
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    // inverse of 2x2
    public static double[][] inverse2x2(double[][] m){
        double det=det2x2(m);
        double[][] inv=new double[2][2];
        inv[0][0]=m[1][1]/det;
        inv[0][1]=-m[0][1]/det;
        inv[1][0]=-m[1][0]/det;
        inv[1][1]=m[0][0]/det;
        return inv;
    }

    // display matrix
    public static void display(double[][] m){
        for(double[] row:m){
            for(double x:row)
                System.out.print(x+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){
        double[][] m2=createMatrix(2,2);
        System.out.println("2x2 Matrix");
        display(m2);
        System.out.println("Determinant = "+det2x2(m2));
        System.out.println("Inverse");
        display(inverse2x2(m2));

        double[][] m3=createMatrix(3,3);
        System.out.println("3x3 Matrix");
        display(m3);
        System.out.println("Determinant = "+det3x3(m3));

        System.out.println("Transpose");
        display(transpose(m3));
    }
}
