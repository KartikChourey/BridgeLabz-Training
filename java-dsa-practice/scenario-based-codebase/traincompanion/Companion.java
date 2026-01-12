package traincompanion;



public class Companion{

    private Node head;
    private Node tail;

    // Add compartment at end
    public void addCompartment(String name) {

       Node newCompartment = new Node(name);

        if (head == null) {
            head = tail = newCompartment;
        } else {
            tail.next = newCompartment;
            newCompartment.prev = tail;
            tail = newCompartment;
        }

        System.out.println(name + " added.");
    }

    // Remove a compartment by name
    public void removeCompartment(String name) {

        Node temp = head;

        while (temp != null) {

            if (temp.name.equalsIgnoreCase(name)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } 
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } 
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println(name + " removed.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Compartment not found.");
    }

    // Traverse forward
    public void walkForward() {

        System.out.print("Forward Walk: ");
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Traverse backward
    public void walkBackward() {

        System.out.print("Backward Walk: ");
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.name + " → ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    // Display adjacent compartments
    public void showAdjacent(String name) {

       Node temp = head;

        while (temp != null) {

            if (temp.name.equalsIgnoreCase(name)) {

                System.out.println("Current: " + temp.name);
                System.out.println("Previous: " + 
                    (temp.prev != null ? temp.prev.name : "None"));
                System.out.println("Next: " + 
                    (temp.next != null ? temp.next.name : "None"));
                return;
            }
            temp = temp.next;
        }

        System.out.println("Compartment not found.");
    }
}

