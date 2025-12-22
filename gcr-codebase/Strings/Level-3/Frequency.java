import java.util.Scanner;

public class Frequency {

    static String[] frequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Nested loop to count frequency
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate
                }
            }
        }

        String[] result = new String[chars.length];
        int index = 0;

        // Store results
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] output = frequency(text);
        for (String s : output)
            if (s != null)
                System.out.println(s);
    }
}
