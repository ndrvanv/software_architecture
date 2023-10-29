package lesson6.presentation.queries.controllers;

import lesson6.application.interfaces.NoteEditor;

public class NotesController extends Controller{
    private final NoteEditor noteEditor;

    public NotesController(NoteEditor noteEditor){
        this.noteEditor = noteEditor;
    }

//    TODO: /notes/all
    public void routeGetAll(){
        noteEditor.printAll();
    }

}
