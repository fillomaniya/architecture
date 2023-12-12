package homework6;

import homework6.database.NotesDatabase;
import homework6.notes.core.aplication.ConcreteNoteEditor;
import homework6.notes.infrastructure.persistance.NotesDbContext;
import homework6.notes.presentation.queries.controllers.NotesController;
import homework6.notes.presentation.queries.views.NotesConsolePresenter;

public class Main {

    public static void main(String[] args) {
        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));
        controller.routeGetAll();
    }

}
