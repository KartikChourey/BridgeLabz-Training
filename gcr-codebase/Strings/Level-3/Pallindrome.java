import java.util.Scanner;

public class Pallindrome {

    static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Palindrome: " + isPalindrome(text));
    }
}
