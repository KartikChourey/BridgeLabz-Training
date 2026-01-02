package com.polymorphismandencapsulation.librarysystem;

// Reservation interface
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Abstract library item
abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println(title + " by " + author);
    }
}