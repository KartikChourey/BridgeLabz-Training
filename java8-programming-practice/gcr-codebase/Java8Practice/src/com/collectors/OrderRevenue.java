package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
}

public class OrderRevenue {
    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order("Kartik", 1200),
                new Order("Kartik", 800),
                new Order("Rahul", 1500)
        );

        Map<String, Double> totalRevenue =
                orders.stream()
                      .collect(Collectors.groupingBy(
                              o -> o.customer,
                              Collectors.summingDouble(o -> o.amount)
                      ));

        System.out.println(totalRevenue);
    }
}
