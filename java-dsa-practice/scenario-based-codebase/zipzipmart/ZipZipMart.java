package zipzipmart;
import java.util.*;
public class ZipZipMart {
    public static void mergeSort(Transaction[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
        
    }
    private static void merge(Transaction[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Transaction[] L = new Transaction[n1];
        Transaction[] R = new Transaction[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            // Compare by date
            int dateCompare = L[i].date.compareTo(R[j].date);

            if (dateCompare < 0 ||
               (dateCompare == 0 && L[i].amount <= R[j].amount)) {

                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // Display transactions
    public static void display(Transaction[] arr) {
        for (Transaction t : arr) {
            System.out.println(t);
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        Transaction[] transactions = new Transaction[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nTransaction " + (i + 1));
            System.out.print("Enter date (YYYY-MM-DD): ");
            String date = sc.next();

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            transactions[i] = new Transaction(date, amount);
        }

        System.out.println("\nBefore Sorting:");
        display(transactions);

        mergeSort(transactions, 0, n - 1);

        System.out.println("\nAfter Sorting (By Date & Amount):");
        display(transactions);

        sc.close();
    }
}
