package com.streamapi;

import java.time.LocalDateTime;
import java.util.*;

public class Transaction {
    public static void main(String[] args) {

        List<String> transactionIds = List.of("TXN101", "TXN102");

        transactionIds.forEach(id ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}
