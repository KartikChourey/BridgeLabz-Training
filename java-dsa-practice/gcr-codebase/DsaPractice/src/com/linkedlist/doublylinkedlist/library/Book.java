package com.linkedlist.doublylinkedlist.library;

class BookNode {
    int id;
    String title, author, genre;
    boolean available;
    BookNode prev, next;

    BookNode(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}
