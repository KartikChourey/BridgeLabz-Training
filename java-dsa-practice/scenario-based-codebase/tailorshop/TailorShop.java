package tailorshop;

public class TailorShop {

    static void insertionSort(Order[] orders) {
        for (int i = 1; i < orders.length; i++) {
            Order key = orders[i];
            int j = i - 1;

            while (j >= 0 && orders[j].deliveryDay > key.deliveryDay) {
                orders[j + 1] = orders[j];
                j--;
            }
            orders[j + 1] = key;
        }
    }

    static void display(Order[] orders) {
        for (Order o : orders) {
            System.out.println("Order ID: " + o.orderId +
                    ", Delivery Day: " + o.deliveryDay);
        }
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, 5),
            new Order(102, 2),
            new Order(103, 4),
            new Order(104, 1)
        };

        insertionSort(orders);
        display(orders);
    }
}
