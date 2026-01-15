package examcell;
import java.util.*;
public class ExamCell {

    // Merge Sort
    public static void mergeSort(Student[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(Student[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Sort by score (descending for ranks)
        while (i < n1 && j < n2) {
            if (L[i].score >= R[j].score) {
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

    public static void display(Student[] arr) {
        int rank = 1;
        for (Student s : arr) {
            System.out.println("Rank " + rank++ + " → " + s);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            System.out.print("Enter score: ");
            int score = sc.nextInt();

            students[i] = new Student(roll, score);
        }

        mergeSort(students, 0, n - 1);

        System.out.println("\nState Level Rank List:");
        display(students);

        sc.close();
    }
}