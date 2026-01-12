package callcenter;

import java.util.*;

public class Manager {

   
    private Queue<Call> normalQueue = new LinkedList<>();

   
    private PriorityQueue<Call> vipQueue;


    private HashMap<String, Integer> callCountMap = new HashMap<>();

    public void CallCenter() {

       
        vipQueue = new PriorityQueue<>(
                (c1, c2) -> Boolean.compare(c2.isVIP, c1.isVIP)
        );
    }

    // Incoming call
    public void receiveCall(Call customer) {

        // Update call count
        callCountMap.put(
                customer.customerId,
                callCountMap.getOrDefault(customer.customerId, 0) + 1
        );

        // Add to appropriate queue
        if (customer.isVIP) {
            vipQueue.offer(customer);
            System.out.println("VIP Call received from: " + customer.name);
        } else {
            normalQueue.offer(customer);
            System.out.println("Normal Call received from: " + customer.name);
        }
    }

    // Serve next call
    public void serveCall() {

        Call customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
        } else {
            System.out.println("No calls in queue.");
            return;
        }

        System.out.println("Serving customer: " + customer.name);
    }

    // Display call count
    public void displayCallCount() {
        System.out.println("\nCustomer Call Frequency:");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
