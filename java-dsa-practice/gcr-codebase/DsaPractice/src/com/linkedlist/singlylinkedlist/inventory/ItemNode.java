package com.linkedlist.singlylinkedlist.inventory;

public class ItemNode {
    int id, qty;
    String name;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
}