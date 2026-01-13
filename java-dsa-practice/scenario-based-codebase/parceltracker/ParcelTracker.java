package parceltracker;
import java.util.*;
public class ParcelTracker {

    private Node head;


    public void addStage(String stage) {
       Node node = new Node(stage);

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }


    public void trackParcel() {

        if (head == null) {
            System.out.println("Parcel tracking failed (missing data)");
            return;
        }

        Node temp = head;
        System.out.print("Parcel Route: ");

        while (temp != null) {
            System.out.print(temp.stage + " → ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();

        System.out.print("Enter number of stages: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter stage name: ");
            tracker.addStage(sc.nextLine());
        }

        tracker.trackParcel();
    }
}