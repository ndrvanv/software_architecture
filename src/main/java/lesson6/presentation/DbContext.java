package lesson6.presentation;

import lesson6.domain.Note;

import javax.xml.crypto.Data;
import java.util.Collection;

public abstract class DbContext {

    protected Database database;
    private Collection<Note> notes;

    public DbContext(Database database) {
        this.database = database;
    }

    protected abstract void onModelCreating(ModelBuilder builder);

    public boolean saveChanges(){
//        TODO: Сохранение изменений базе данных
        return true;
    }
    public void remove(Note note){
        notes.remove(note);
        saveChanges();
        System.out.println("Данные удалены");
    }
    public void add(Note note){
        notes.add(note);
        saveChanges();
        System.out.println("Данные добавлены");
    }
}

