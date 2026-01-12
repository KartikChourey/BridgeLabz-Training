package browserbuddy;

public class BrowserTab {
   private Node current;
   
   public void visit(String url) {
	   Node newnode = new Node(url);
	   if(current!=null) {
		   current.next=null;
		   newnode.prev=current;
	   }
	   current = newnode;
	   System.out.println("Visited Page " + url);
   }
   
   public void back() {
	   if(current!=null && current.prev!=null) {
		   current=current.prev;
		   System.out.println("Previous page was "+ current.url);
	   }
	   else System.out.println("NO Previous Page");
   }
   
   public void forward() {
	   if(current!=null && current.next!=null) {
		   current=current.next;
		   System.out.println("Next Page Url is "+ current.url);
	   } else System.out.println("NO Forward Page");
   }
   public String getcurrentpage() {
	   if(current!=null) return current.url;
	   else return "NO pages yet";
   }
}
