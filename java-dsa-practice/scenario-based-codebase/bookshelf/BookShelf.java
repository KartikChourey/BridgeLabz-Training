package bookshelf;

public class BookShelf{

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("The Alchemist", "Paulo Coelho", "Fiction");
        Book b2 = new Book("Clean Code", "Robert C. Martin", "Programming");
        Book b3 = new Book("Effective Java", "Joshua Bloch", "Programming");
        Book b4 = new Book("The Alchemist", "Paulo Coelho", "Fiction"); // duplicate

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4); 

        library.displayCatalog();

        library.borrowBook(b2);
        library.displayCatalog();

        library.returnBook(b2);
        library.displayCatalog();
    }
}
