package artexpo;
import java.util.*;
public class ArtExpo {

    public static void insertionSort(Artist[] artists, int n) {

        for (int i = 1; i < n; i++) {
            Artist key = artists[i]; 
            int j = i - 1;

            while (j >= 0 && artists[j].registrationTime > key.registrationTime) {
                artists[j + 1] = artists[j];
                j--;
            }

            artists[j + 1] = key;
        }
    }

    public static void display(Artist[] artists, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(artists[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of artists: ");
        int n = sc.nextInt();
        sc.nextLine();

        Artist[] artists = new Artist[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nArtist " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter registration time (minutes): ");
            int time = sc.nextInt();
            sc.nextLine();

            artists[i] = new Artist(name, time);
        }

        insertionSort(artists, n);

        System.out.println("\nSorted Artist List (By Registration Time):");
        display(artists, n);

        sc.close();
    }
}