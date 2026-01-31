package com.lambdaexpression;
import java.util.*;

public class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }
}

 class InvoiceDemo {
    public static void main(String[] args) {

        List<String> transactionIds = List.of("TXN1001", "TXN1002");

        List<Invoice> invoices =
                transactionIds.stream()
                              .map(Invoice::new)
                              .toList();

        invoices.forEach(i -> System.out.println(i.transactionId));
    }
}
