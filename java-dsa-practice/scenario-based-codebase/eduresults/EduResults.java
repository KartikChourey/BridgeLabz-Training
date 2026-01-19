package eduresults;
import java.util.*;

public class EduResults {

    static void mergeSort(Student[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(Student[] arr, int left, int mid, int right) {
        Student[] temp = new Student[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i].marks >= arr[j].marks) // descending
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name and marks: ");
            students[i] = new Student(sc.next(), sc.nextInt());
        }

        mergeSort(students, 0, n - 1);

        System.out.println("\nState-wise Rank List:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + students[i].name + " - " + students[i].marks);
        }
        sc.close();
    }
}