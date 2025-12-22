public class NullPointerDemo {

    // Method 1: Generates NullPointerException
    static void generateException() {
        String text = null;   
        System.out.println(text.length()); 
    }

    // Method 2: Handles NullPointerException using try-catch
    static void handleException() {
        String text = null;   

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully");
        }
    }

    
    public static void main(String[] args) {

        System.out.println("Calling method to generate exception:");
        generateException();   // This will crash the program

        System.out.println("Calling method to handle exception:");
        handleException();
    }
}
