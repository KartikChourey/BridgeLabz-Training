package foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    private List<FoodItem> items = new ArrayList<>();
    private double total;

    // Combo meal constructor
    public Order(List<FoodItem> comboItems) {
        this.items.addAll(comboItems);
    }

    @Override
    public void placeOrder() {
        total = 0;

        for (FoodItem item : items) {
            total += item.getPrice(); // operator usage
        }

        // Discount logic based on order value
        if (total > 500) {
            total -= 50;
        }

        System.out.println("Order placed. Total bill: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled successfully.");
    }
}
