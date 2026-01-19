package fitnesstracker;
import java.util.*;
public class FitnessTracker {

    static void bubbleSort(User[] users) {
        int n = users.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (users[j].steps < users[j + 1].steps) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of users: ");
        int n = sc.nextInt();

        User[] users = new User[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter user name and steps: ");
            users[i] = new User(sc.next(), sc.nextInt());
        }

        bubbleSort(users);

        System.out.println("\nDaily Step Ranking:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + users[i].name + " - " + users[i].steps);
        }
        sc.close();
    }
}