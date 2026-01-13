package texteditor;

public class App {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.insert("Hello");
        editor.insert(" World");
        editor.delete(6);

        editor.undo();
        editor.undo();

        editor.redo();
    }
}
