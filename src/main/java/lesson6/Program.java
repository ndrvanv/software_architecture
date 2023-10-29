package lesson6;

import lesson6.application.ConcreteNoteEditor;
import lesson6.application.interfaces.NoteDatabaseContext;
import lesson6.application.interfaces.NoteEditor;
import lesson6.database.NoteDatabase;
import lesson6.presentation.Database;
import lesson6.presentation.DatabaseContext;
import lesson6.presentation.queries.controllers.NotesController;
import lesson6.presentation.queries.views.NotesConsolePresenter;


public class Program {
    /**
     * CQRS
     * @param args
     */

    public static void main(String[] args) {
        Database database = new NoteDatabase();
        NoteDatabaseContext context = new DatabaseContext(database);
        NotesConsolePresenter notesConsolePresenter = new NotesConsolePresenter();
        NoteEditor noteEditor = new ConcreteNoteEditor(notesConsolePresenter, context);
        NotesController notesController = new NotesController(noteEditor);

        notesController.routeGetAll();
    }
}
