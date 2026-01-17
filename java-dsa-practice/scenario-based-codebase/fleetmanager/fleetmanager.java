package fleetmanager;
import java.util.Scanner;
public class fleetmanager {

    public static void mergeSort(Vehicle[] arr, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

        
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

         
            merge(arr, left, mid, right);
        }
    }

    private static void merge(Vehicle[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Vehicle[] L = new Vehicle[n1];
        Vehicle[] R = new Vehicle[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge by mileage
        while (i < n1 && j < n2) {
            if (L[i].mileage <= R[j].mileage) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining vehicles
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void display(Vehicle[] arr) {
        for (Vehicle v : arr) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of vehicles: ");
        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nVehicle " + (i + 1));
            System.out.print("Enter Vehicle ID: ");
            String id = sc.next();
            System.out.print("Enter Mileage: ");
            int mileage = sc.nextInt();

            vehicles[i] = new Vehicle(id, mileage);
        }

        mergeSort(vehicles, 0, n - 1);

        System.out.println("\nMaster Maintenance Schedule (Sorted by Mileage):");
        display(vehicles);

        sc.close();
    }
}