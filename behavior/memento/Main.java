package behavior.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorCaretaker caretaker = new TextEditorCaretaker();

        editor.setText("Version 1");
        caretaker.save(editor);
        System.out.println("Text: " + editor.getText());

        editor.setText("Version 2");
        caretaker.save(editor);
        System.out.println("Text: " + editor.getText());

        editor.setText("Version 3");
        System.out.println("Text: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("Undo: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("Undo: " + editor.getText());

        caretaker.undo(editor);
    }
}
