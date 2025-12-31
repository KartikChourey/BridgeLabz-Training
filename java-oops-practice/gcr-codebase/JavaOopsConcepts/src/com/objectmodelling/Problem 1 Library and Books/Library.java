import java.util.ArrayList;

public class Library {

    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    // Aggregation: library is using book objects
    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("\nBooks in " + name + ":");
        for (Book b : books) {
            b.showBook();
        }
    }
}
