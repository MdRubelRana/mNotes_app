package info.mdrubel.todolist.dao;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import info.mdrubel.todolist.entities.Note;

@Dao
public interface NoteDao {
    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Note> getAllNotes();

//    @Insert(onConflict = onConflictStrategy.REPLACE)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(Note note);


    @Delete
    void deleteNote(Note note);
}
