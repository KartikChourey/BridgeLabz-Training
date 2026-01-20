package movietime;

import java.util.*;

class MovieTime {

    static void insertionSort(int[] times) {
        for (int i = 1; i < times.length; i++) {
            int key = times[i];
            int j = i - 1;

            while (j >= 0 && times[j] > key) {
                times[j + 1] = times[j];
                j--;
            }
            times[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of shows: ");
        int n = sc.nextInt();

        int[] showTimes = new int[n];

        System.out.println("Enter show times (24-hour format, e.g. 1430):");
        for (int i = 0; i < n; i++) {
            showTimes[i] = sc.nextInt();
        }

        insertionSort(showTimes);

        System.out.println("\nSorted Show Times:");
        for (int time : showTimes) {
            System.out.print(time + " ");
        }
        sc.close();
    }
}
