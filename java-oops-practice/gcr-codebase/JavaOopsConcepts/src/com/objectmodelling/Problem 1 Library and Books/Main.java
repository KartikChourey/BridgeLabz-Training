public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("Wings of Fire", "A.P.J Abdul Kalam");
        Book b2 = new Book("Atomic Habits", "James Clear");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib2.addBook(b1);   // same book in another library
        lib2.addBook(b2);

        lib1.showBooks();
        lib2.showBooks();
    }
}
