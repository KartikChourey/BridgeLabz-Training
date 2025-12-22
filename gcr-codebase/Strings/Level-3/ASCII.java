import java.util.Scanner;

public class ASCII {

    static int[][] getFrequency(String text) {
        int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        // Count distinct characters
        int count = 0;
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0) count++;

        // Store character and frequency
        int[][] result = new int[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[][] freq = getFrequency(text);
        System.out.println("Character Frequency:");
        for (int[] row : freq)
            System.out.println((char) row[0] + " : " + row[1]);
    }
}
