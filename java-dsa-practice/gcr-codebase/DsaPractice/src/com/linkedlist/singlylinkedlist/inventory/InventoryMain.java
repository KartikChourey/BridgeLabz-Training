package com.linkedlist.singlylinkedlist.inventory;

public class InventoryMain {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addItem(101, "Pen", 10, 5);
        inv.addItem(102, "Book", 3, 100);
        inv.totalValue();
    }
}
