package lesson6.application;

import lesson6.application.interfaces.NoteDatabaseContext;
import lesson6.application.interfaces.NoteEditor;
import lesson6.application.interfaces.NotesPresenter;
import lesson6.domain.Note;
import org.w3c.dom.Node;

import java.util.Collection;
import java.util.Optional;

public class ConcreteNoteEditor implements NoteEditor {

    private final NoteDatabaseContext dbContext;
    private final NotesPresenter presenter;

    public ConcreteNoteEditor(NotesPresenter presenter,
            NoteDatabaseContext dbContext){
        this.dbContext = dbContext;
        this.presenter = presenter;
    }
    @Override
    public boolean add(Note item) {

        dbContext.getAll().add(item);
        return dbContext.saveChanges();
    }

    @Override
    public boolean edit(Note item) {
        return false;
    }

    @Override
    public boolean remove(Note item) {

        dbContext.getAll().remove(item);
        return dbContext.saveChanges();
    }

    @Override
    public Optional<Note> getById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Collection<Note> getAll() {

        return dbContext.getAll();
    }

    @Override
    public void printAll() {
        presenter.printAll(getAll());
    }
}
