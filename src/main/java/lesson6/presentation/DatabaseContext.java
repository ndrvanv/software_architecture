package lesson6.presentation;

import lesson6.application.interfaces.NoteDatabaseContext;
import lesson6.database.NoteDatabase;
import lesson6.database.NotesRecord;
import lesson6.domain.Note;
import lesson6.presentation.entityConfiguration.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseContext extends DbContext implements NoteDatabaseContext {

    public Collection<Note>getAll(){
        Collection<Note> notes = new ArrayList<>();
        for (NotesRecord record :((NoteDatabase)database).getNotesTable().getRecords()){
            notes.add(new Note(
                    record.getId(),
                    record.getTitle(),
                    record.getDetails()));
        }
        return notes;
    }
    public DatabaseContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }
}
