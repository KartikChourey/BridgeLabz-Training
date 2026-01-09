package foodloop;

import java.util.ArrayList;
import java.util.List;

public class FoodLoop{

    public static void main(String[] args) {

        // Creating food items
        FoodItem paneer = new VegItem("Paneer Butter Masala", 220);
        FoodItem vegBiryani = new VegItem("Veg Biryani", 180);
        FoodItem chickenRoll = new NonVegItem("Chicken Roll", 150);

        // Creating a combo meal
        List<FoodItem> comboMeal = new ArrayList<>();
        comboMeal.add(paneer);
        comboMeal.add(vegBiryani);
        comboMeal.add(chickenRoll);

        // Placing the order
        Order order = new Order(comboMeal);
        order.placeOrder();

        // Uncomment to test cancellation
        // order.cancelOrder();
    }
}
