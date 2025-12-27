// leetcode #7 
// Reverse a Integer 

public class Reverse {
    public int reverse(int x) {
        int reversed = 0;
        boolean isNegative = x < 0;
        x = Math.abs(x);

        while (x != 0) {
            int digit = x % 10;
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        if (isNegative) {
            reversed = -reversed;
        }

        return reversed;
    }
}