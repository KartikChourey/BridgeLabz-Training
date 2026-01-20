package gamerzone;

import java.util.*;

class GamerZone {

    static int partition(int[] scores, int low, int high) {
        int pivot = scores[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (scores[j] > pivot) { 
                i++;
                int temp = scores[i];
                scores[i] = scores[j];
                scores[j] = temp;
            }
        }

        int temp = scores[i + 1];
        scores[i + 1] = scores[high];
        scores[high] = temp;

        return i + 1;
    }

    static void quickSort(int[] scores, int low, int high) {
        if (low < high) {
            int pi = partition(scores, low, high);
            quickSort(scores, low, pi - 1);
            quickSort(scores, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter player scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        quickSort(scores, 0, n - 1);

        System.out.println("\nLeaderboard (Highest to Lowest):");
        for (int s : scores) {
            System.out.print(s + " ");
        }
        sc.close();
    }
}
