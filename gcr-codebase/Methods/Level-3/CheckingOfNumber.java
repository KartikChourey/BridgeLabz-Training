public class CheckingOfNumber{

    // Calculates sum of digits
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Calculates sum of squares of digits
    public static int sumSquareDigits(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, 2);
        return sum;
    }

    // Checks if number is Harshad
    public static boolean isHarshad(int n, int[] digits) {
        return n % sumDigits(digits) == 0;
    }

    // Finds frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        // Initialize digits
        for (int i = 0; i < 10; i++)
            freq[i][0] = i;

        // Count frequency
        for (int d : digits)
            freq[d][1]++;

        return freq;
    }
}
