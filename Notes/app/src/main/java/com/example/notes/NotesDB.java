package com.example.notes;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class NotesDB extends RoomDatabase {
    private static NotesDB database;
    private static final String DB_NAME = "notes2.db";
    private static final Object LOCK = new Object();

    public static NotesDB getInstance(Context context) {
        synchronized (LOCK) {
            if (database == null) {
                database = Room.databaseBuilder(context, NotesDB.class, DB_NAME).allowMainThreadQueries().build();
            }
        }
        return database;
    }

    public abstract NotesDao notesDao();
}
