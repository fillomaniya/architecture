package homework6.notes.presentation.queries.views;

import java.util.Collection;

import homework6.notes.core.aplication.interfaces.NotesPresenter;
import homework6.notes.core.domain.Note;

public class NotesConsolePresenter implements NotesPresenter {

    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note : notes) {
            System.out.println(note);
        }
    }

}
