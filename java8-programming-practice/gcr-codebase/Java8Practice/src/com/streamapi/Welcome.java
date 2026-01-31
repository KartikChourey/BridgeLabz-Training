package com.streamapi;

import java.util.*;

public class Welcome {
    public static void main(String[] args) {

        List<String> attendees = List.of("Kartik", "Rahul", "Neha");

        attendees.forEach(name ->
                System.out.println("Welcome " + name + "!")
        );
    }
}
