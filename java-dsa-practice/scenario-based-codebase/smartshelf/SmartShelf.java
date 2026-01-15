package smartshelf;

import java.util.Scanner;

public class SmartShelf {
	
	  static void insertionSort(Book[] books, int n) {

	        for (int i = 1; i < n; i++) {
	            Book key = books[i];
	            int j = i - 1;

	            while (j >= 0 &&
	                   books[j].title.compareToIgnoreCase(key.title) > 0) {
	                books[j + 1] = books[j];
	                j--;
	            }

	            books[j + 1] = key;
	        }
	    }
	  
	   static void displayBooks(Book[] books) {
	        System.out.println("\nSorted Book List:");
	        for (Book b : books) {
	            System.out.println(b.title);
	        }
	    }
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);

         System.out.print("Enter number of books: ");
         int n = sc.nextInt();
         sc.nextLine();
         Book[] books = new Book[n];

         for (int i = 0; i < n; i++) {
             System.out.print("Enter book title: ");
             books[i] = new Book(sc.nextLine());
         }

         insertionSort(books, n);
         displayBooks(books);
	}
}
