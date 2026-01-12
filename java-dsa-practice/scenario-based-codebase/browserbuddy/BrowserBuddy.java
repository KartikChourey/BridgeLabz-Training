package browserbuddy;

public class BrowserBuddy {
      public static void main(String[] args) {
    	 Manager manager = new Manager();
		BrowserTab tab = manager.getActiveTab();
		tab.visit("google.com");
		tab.visit("youtube.com");
		tab.visit("abs.com");
		
		tab.back();
		tab.back();
		tab.forward();
		manager.closeTab();
		manager.restoretab();
	}
}
