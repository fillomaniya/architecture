package homework6.notes.core.aplication.interfaces;

import java.util.Collection;

import homework6.notes.core.domain.Note;

public interface NotesDatabaseContext {
    Collection<Note> getAll();

    boolean saveChanges();
}
