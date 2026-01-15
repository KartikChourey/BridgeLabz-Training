package eventmanager;
import java.util.*;
public class EventManager {

    // Quick Sort
    public static void quickSort(Ticket[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition logic
    private static int partition(Ticket[] arr, int low, int high) {
        double pivot = arr[high].price;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].price <= pivot) {
                i++;
                Ticket temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Ticket temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Display tickets
    public static void display(Ticket[] arr) {
        for (Ticket t : arr) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();

        Ticket[] tickets = new Ticket[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nTicket " + (i + 1));
            System.out.print("Enter ticket ID: ");
            int id = sc.nextInt();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            tickets[i] = new Ticket(id, price);
        }

        System.out.println("\nBefore Sorting:");
        display(tickets);

        quickSort(tickets, 0, n - 1);

        System.out.println("\nAfter Sorting (By Price):");
        display(tickets);

        sc.close();
    }
}