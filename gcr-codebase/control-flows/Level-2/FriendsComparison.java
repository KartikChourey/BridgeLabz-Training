import java.util.Scanner;

public class FriendsComparison {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take age of Amar
        int amarAge = sc.nextInt();

        // Take age of Akbar
        int akbarAge = sc.nextInt();

        // Take age of Anthony
        int anthonyAge = sc.nextInt();

        // Take height of Amar
        int amarHeight = sc.nextInt();

        // Take height of Akbar
        int akbarHeight = sc.nextInt();

        // Take height of Anthony
        int anthonyHeight = sc.nextInt();

        // Check youngest friend
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is the youngest");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }

        // Check tallest friend
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is the tallest");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }
    }
}
