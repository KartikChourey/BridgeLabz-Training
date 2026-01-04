package com.linkedlist.doublylinkedlist.library;

public class Library {
    BookNode head, tail;

    void addBook(BookNode book) {
        if (head == null) {
            head = tail = book;
            return;
        }
        tail.next = book;
        book.prev = tail;
        tail = book;
    }

    void display() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.author);
            temp = temp.next;
        }
    }
}
