package com.inheritance.singleinheritance.librarymanagement;

// Main class
public class LibraryTest {

    public static void main(String[] args) {

        Author book = new Author(
                "Wings of Fire",
                1999,
                "Dr. A.P.J Abdul Kalam",
                "Indian aerospace scientist and former President"
        );

        book.displayInfo();
    }
}