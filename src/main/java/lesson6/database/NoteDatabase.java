package lesson6.database;

import lesson6.domain.Note;
import lesson6.presentation.Database;
import lesson6.presentation.DatabaseContext;
import lesson6.presentation.DbContext;

public class NoteDatabase implements Database{
    private DbContext dbContext;
    private NotesRecord notesRecord;
    private NotesTable notesTable = new NotesTable();

    public NotesTable getNotesTable() {
        return notesTable;
    }


}
