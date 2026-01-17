package SmartLibrary;
import java.util.*;
public class SmartLibrary {

    public static void insertionSort(Book[] books) {

        for (int i = 1; i < books.length; i++) {

            Book key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    public static void display(Book[] books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of borrowed books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title " + (i + 1) + ": ");
            books[i] = new Book(sc.nextLine());
        }

        insertionSort(books);

        System.out.println("\nBorrowed Books (Alphabetically Sorted):");
        display(books);

        sc.close();
    }
}