package com.linkedlist.doublylinkedlist.editor;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        te.addState("Hello");
        te.addState("Hello World");
        te.undo();
        te.display();
    }
}
