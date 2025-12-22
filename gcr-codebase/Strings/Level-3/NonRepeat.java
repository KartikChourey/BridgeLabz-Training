import java.util.Scanner;

public class NonRepeat {

    // Method to find first non-repeating character
    static char firstNonRepeat(String text) {
        int[] freq = new int[256]; // ASCII frequency array

        // Count frequency
        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        // Find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1)
                return text.charAt(i);
        }

        return '\0'; // No non-repeating character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char result = firstNonRepeat(text);
        System.out.println("First Non-Repeating Character: " + result);
    }
}
