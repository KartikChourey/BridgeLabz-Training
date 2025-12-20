public class NumberChecker {

    // Returns count of digits in a number
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    // Stores digits of a number into an array
    public static int[] storeDigits(int n) {
        int len = countDigits(n);
        int[] digits = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Checks if number is a duck number (contains zero)
    public static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0) return true;
        return false;
    }

    // Checks if number is Armstrong
    public static boolean isArmstrong(int n, int[] digits) {
        int sum = 0, power = digits.length;

        for (int d : digits)
            sum += Math.pow(d, power);

        return sum == n;
    }

    // Finds largest and second largest digit
    public static int[] largestTwo(int[] digits) {
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > max) {
                smax = max;
                max = d;
            } else if (d > smax && d != max) {
                smax = d;
            }
        }
        return new int[]{max, smax};
    }

    // Finds smallest and second smallest digit
    public static int[] smallestTwo(int[] digits) {
        int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < min) {
                smin = min;
                min = d;
            } else if (d < smin && d != min) {
                smin = d;
            }
        }
        return new int[]{min, smin};
    }
}
