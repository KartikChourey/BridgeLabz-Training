package bookshelf;

//Represents a single book in the library
public class Book {

 private String title;
 private String author;
 private String genre;

 public Book(String title, String author, String genre) {
     this.title = title;
     this.author = author;
     this.genre = genre;
 }

 public String getGenre() {
     return genre;
 }

 // Needed to avoid duplicates using HashSet
 @Override
 public boolean equals(Object obj) {
     if (this == obj) return true;
     if (!(obj instanceof Book)) return false;

     Book book = (Book) obj;
     return title.equals(book.title)
             && author.equals(book.author)
             && genre.equals(book.genre);
 }

 @Override
 public int hashCode() {
     return (title + author + genre).hashCode();
 }

 @Override
 public String toString() {
     return title + " by " + author;
 }
}
