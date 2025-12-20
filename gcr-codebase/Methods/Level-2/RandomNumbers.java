public class RandomNumbers{
    // method to generate 4 digit random numbers
    public static int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=1000+(int)(Math.random()*9000);
        return arr;
    }
    // method to find average, min and max
    public static double[] findAverageMinMax(int[] numbers){
        int min=numbers[0],max=numbers[0],sum=0;
        for(int x:numbers){
            sum+=x;
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        double avg=(double)sum/numbers.length;
        return new double[]{avg,min,max};
    }
    public static void main(String[] args){
        // generate random values
        int[] numbers=generate4DigitRandomArray(5);
        System.out.println("Generated Numbers:");
        for(int x:numbers) System.out.print(x+" ");
		
		
        // calculate results
        double[] result=findAverageMinMax(numbers);
        System.out.println("\nAverage = "+result[0]);
        System.out.println("Minimum = "+result[1]);
        System.out.println("Maximum = "+result[2]);
    }
}
