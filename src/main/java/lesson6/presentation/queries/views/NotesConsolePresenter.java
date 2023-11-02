package lesson6.presentation.queries.views;

import lesson6.application.interfaces.NotesPresenter;
import lesson6.domain.Note;

import java.util.Collection;

public class NotesConsolePresenter implements NotesPresenter {
    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note : notes){
            System.out.println(note);
        }
    }
}
