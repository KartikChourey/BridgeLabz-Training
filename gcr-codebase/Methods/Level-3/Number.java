public class Number {

    // Reverses digits array
    public static int[] reverseArray(int[] digits) {
        int[] rev = new int[digits.length];

        for (int i = 0; i < digits.length; i++)
            rev[i] = digits[digits.length - 1 - i];

        return rev;
    }

    // Compares two arrays
    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;

        return true;
    }

    // Checks palindrome using digit reversal
    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseArray(digits));
    }
}
