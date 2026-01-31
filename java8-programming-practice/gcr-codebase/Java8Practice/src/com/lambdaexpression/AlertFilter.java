package com.lambdaexpression;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;

    Alert(String type) {
        this.type = type;
    }
}

public class AlertFilter {
    public static void main(String[] args) {

        List<Alert> alerts = List.of(
                new Alert("Emergency"),
                new Alert("Appointment"),
                new Alert("Billing")
        );

        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equals("Emergency");

        alerts.stream()
              .filter(emergencyOnly)
              .forEach(a -> System.out.println(a.type));
    }
}
