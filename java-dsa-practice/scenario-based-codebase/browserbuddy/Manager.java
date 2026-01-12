package browserbuddy;
import  java.util.*;


public class Manager {
	 private Stack<BrowserTab> closed = new Stack<>();
	 private BrowserTab active = new BrowserTab();
	 
	 public BrowserTab getActiveTab() {
		 return active;
	 }
	 
	 public void closeTab() {
		 
		 closed.push(active);
		 active= new BrowserTab();
		 System.out.println("Closed the tab");
	 }
	 public void  restoretab() {
		if(!closed.isEmpty()) {
			 active= closed.pop();
			 System.out.println("Tab Restored : " + active.getcurrentpage());
		} else System.out.println("No Tabs to Restore");
	 }
	 

}
