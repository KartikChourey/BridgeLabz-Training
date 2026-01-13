package smartcheckout;

import java.util.*;

public class SmartCheckout {

    private Queue<Customer> billingQueue = new LinkedList<>();

   
    private HashMap<String, Integer> priceMap = new HashMap<>();

  
    private HashMap<String, Integer> stockMap = new HashMap<>();

    public SmartCheckout() {
        // Initial inventory
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 40);
        priceMap.put("Eggs", 10);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 8);
        stockMap.put("Eggs", 30);
    }

    // Add customer to queue
    public void addCustomer(Customer c) {
        billingQueue.offer(c);
        System.out.println(c.name + " added to billing queue");
    }

    // Process billing
    public void processCustomer() {

        if (billingQueue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer c = billingQueue.poll();
        int total = 0;

        for (String item : c.items) {
            if (stockMap.get(item) > 0) {
                total += priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);
            } else {
                System.out.println(item + " out of stock");
            }
        }

        System.out.println("Bill for " + c.name + ": ₹" + total);
    }

    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        checkout.addCustomer(new Customer("Amit",
                Arrays.asList("Milk", "Bread")));

        checkout.addCustomer(new Customer("Riya",
                Arrays.asList("Eggs", "Milk")));

        checkout.processCustomer();
        checkout.processCustomer();
    }
}