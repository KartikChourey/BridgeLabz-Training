package ambulanceroute;

class Node {

 String unitName;
 boolean available;
 Node next;

 public Node(String unitName, boolean available) {
     this.unitName = unitName;
     this.available = available;
 }
}
