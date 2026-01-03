package com.linkedlist.doublylinkedlist.moviemanagement;

public class MovieMain {
    public static void main(String[] args) {
        MovieList list = new MovieList();
        list.addMovie("Inception", "Nolan", 2010, 9.0);
        list.addMovie("Interstellar", "Nolan", 2014, 8.8);
        list.displayForward();
        list.updateRating("Inception", 9.5);
        list.displayReverse();
    }
}
