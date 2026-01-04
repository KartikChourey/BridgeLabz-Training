package com.linkedlist.doublylinkedlist.editor;

public class TextEditor {
    TextNode current;

    void addState(String text) {
        TextNode newNode = new TextNode(text);
        if (current != null)
            current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }

    void undo() {
        if (current.prev != null)
            current = current.prev;
    }

    void display() {
        System.out.println(current.text);
    }
}
