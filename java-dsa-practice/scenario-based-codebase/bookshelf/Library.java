package bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

// Manages genre-wise book catalog
public class Library {

    // genre → list of books
    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

    // Used to avoid duplicate book entries
    private HashSet<Book> uniqueBooks = new HashSet<>();

    // Add book to library
    public void addBook(Book book) {

        // Avoid duplication
        if (!uniqueBooks.add(book)) {
            System.out.println("Duplicate book ignored: " + book);
            return;
        }

        // Create genre list if not present
        catalog.putIfAbsent(book.getGenre(), new LinkedList<>());

        // Insert book into LinkedList
        catalog.get(book.getGenre()).add(book);
        System.out.println("Book added: " + book);
    }

    // Borrow book (remove from catalog)
    public void borrowBook(Book book) {

        LinkedList<Book> books = catalog.get(book.getGenre());

        if (books != null && books.remove(book)) {
            uniqueBooks.remove(book);
            System.out.println("Book borrowed: " + book);
        } else {
            System.out.println("Book not available.");
        }
    }

    // Return book to library
    public void returnBook(Book book) {
        addBook(book);
        System.out.println("Book returned: " + book);
    }

    // Display complete catalog
    public void displayCatalog() {
        System.out.println("\n📚 Library Catalog");

        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println(" - " + book);
            }
        }
    }
}
