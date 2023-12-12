package homework6.notes.presentation.queries.controllers;

import homework6.notes.core.aplication.interfaces.NoteEditor;
import homework6.notes.core.domain.Note;

public class NotesController extends Controller {
    private final NoteEditor notesEditor;

    public NotesController(NoteEditor noteEditor) {
        this.notesEditor = noteEditor;
    }

    public void routeAddNote(Note note) {
        this.notesEditor.add(note);
    }

    public void routeRemoveNote(Note note) {
        this.notesEditor.remove(note);
    }

    public void routeGetAll() {
        this.notesEditor.printAll();
    }
}
