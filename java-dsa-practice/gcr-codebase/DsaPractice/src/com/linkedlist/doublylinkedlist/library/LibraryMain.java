package com.linkedlist.doublylinkedlist.library;

public class LibraryMain {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new BookNode(1, "Java", "James", "Tech", true));
        lib.addBook(new BookNode(2, "DSA", "Mark", "CS", true));
        lib.display();
    }
}