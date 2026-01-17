package robowarehouse;
import java.util.*;
public class Robowarehouse {

    // Insertion Sort based on package weight
    public static void insertionSort(Package[] arr, int n) {

        for (int i = 1; i < n; i++) {
            Package key = arr[i]; // new incoming package
            int j = i - 1;

            // Shift heavier packages to the right
            while (j >= 0 && arr[j].weight > key.weight) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert package at correct position
            arr[j + 1] = key;
        }
    }

    public static void display(Package[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        Package[] packages = new Package[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPackage " + (i + 1));
            System.out.print("Enter package ID: ");
            int id = sc.nextInt();
            System.out.print("Enter weight: ");
            int weight = sc.nextInt();

            packages[i] = new Package(id, weight);
        }

        insertionSort(packages, n);

        System.out.println("\nShelves After Sorting (By Weight):");
        display(packages, n);

        sc.close();
    }
}