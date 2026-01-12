package ambulanceroute;

//Manages circular navigation among hospital units
public class Ambulance {

 private Node head = null;

 // Add hospital unit to circular list
 public void addUnit(String name, boolean available) {

     Node newNode = new Node(name, available);

     if (head == null) {
         head = newNode;
         newNode.next = head; // circular link
         return;
     }

     Node temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }

     temp.next = newNode;
     newNode.next = head;
 }

 // Find nearest available unit by rotating circularly
 public void redirectPatient() {

     if (head == null) {
         System.out.println("No hospital units available.");
         return;
     }

     Node temp = head;

     do {
         if (temp.available) {
             System.out.println("Patient redirected to: " + temp.unitName);
             return;
         }
         temp = temp.next;
     } while (temp != head);

     System.out.println("All units are currently busy.");
 }

 // Remove unit if under maintenance
 public void removeUnit(String unitName) {

     if (head == null) return;

     Node curr = head;
     Node prev = null;

     do {
         if (curr.unitName.equals(unitName)) {

             // Case: single node
             if (curr == head && curr.next == head) {
                 head = null;
                 return;
             }

             // Case: removing head
             if (curr == head) {
                 Node last = head;
                 while (last.next != head) {
                     last = last.next;
                 }
                 head = head.next;
                 last.next = head;
             } else {
                 prev.next = curr.next;
             }

             System.out.println(unitName + " removed for maintenance.");
             return;
         }

         prev = curr;
         curr = curr.next;

     } while (curr != head);

     System.out.println("Unit not found.");
 }

 // Display circular path
 public void displayUnits() {

     if (head == null) {
         System.out.println("No units in the system.");
         return;
     }

     Node temp = head;
     System.out.print("Hospital Route: ");

     do {
         System.out.print(temp.unitName + " → ");
         temp = temp.next;
     } while (temp != head);

     System.out.println("(Back to Emergency)");
 }
}
