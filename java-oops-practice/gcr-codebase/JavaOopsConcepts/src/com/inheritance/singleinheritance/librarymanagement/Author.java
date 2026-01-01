package com.inheritance.singleinheritance.librarymanagement;

// Subclass
class Author extends Book {

    String authorName;
    String bio;

    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Published Year: " + publicationYear);
        System.out.println("Author Name: " + authorName);
        System.out.println("Author Bio: " + bio);
    }
}