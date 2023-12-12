package homework6.notes.core.aplication.interfaces;

import homework6.notes.core.domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {
    void printAll();
}
