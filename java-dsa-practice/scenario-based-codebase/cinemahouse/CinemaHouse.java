package cinemahouse;
import java.util.Scanner;
public class CinemaHouse {

    // Bubble Sort based on show time
    public static void bubbleSort(MovieShow[] shows, int n) {

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (shows[j].showTime > shows[j + 1].showTime) {
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped)
                break;
        }
    }

    public static void display(MovieShow[] shows, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(shows[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of movie shows: ");
        int n = sc.nextInt();
        sc.nextLine();

        MovieShow[] shows = new MovieShow[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nShow " + (i + 1));
            System.out.print("Enter movie name: ");
            String name = sc.nextLine();
            System.out.print("Enter show time (HHMM): ");
            int time = sc.nextInt();
            sc.nextLine();

            shows[i] = new MovieShow(name, time);
        }

        bubbleSort(shows, n);

        System.out.println("\nSorted Movie Schedule:");
        display(shows, n);

        sc.close();
    }
}