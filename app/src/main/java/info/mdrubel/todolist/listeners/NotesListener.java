package info.mdrubel.todolist.listeners;

import info.mdrubel.todolist.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
