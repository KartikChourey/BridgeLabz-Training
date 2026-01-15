package hospitalqueue;
import java.util.Scanner;
public class HospitalQueue {

    // Bubble Sort based on criticality (descending order)
    static void bubbleSort(Patient[] patients, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (patients[j].criticality < patients[j + 1].criticality) {

                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    // Display patient list
    static void displayPatients(Patient[] patients) {
        System.out.println("\nPatient Priority List:");
        for (Patient p : patients) {
            System.out.println(p.name + " → Criticality: " + p.criticality);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        Patient[] patients = new Patient[n];

        // Taking user input
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter criticality (1-10): ");
            int criticality = sc.nextInt();
            sc.nextLine();

            patients[i] = new Patient(name, criticality);
        }

        bubbleSort(patients, n);

        displayPatients(patients);
    }
}
