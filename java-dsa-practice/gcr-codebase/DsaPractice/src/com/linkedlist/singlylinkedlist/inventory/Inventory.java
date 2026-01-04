package com.linkedlist.singlylinkedlist.inventory;

public class Inventory {
    ItemNode head;

    void addItem(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    void totalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.qty * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Value: " + total);
    }
}
