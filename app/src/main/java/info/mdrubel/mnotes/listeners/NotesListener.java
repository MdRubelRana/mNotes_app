package info.mdrubel.mnotes.listeners;

import info.mdrubel.mnotes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
