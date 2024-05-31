package com.example.notes;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String description;
    private String dayOfWeek;
    private String priority;

    public Note(int id, String description, String dayOfWeek, String priority) {
        this.id = id;
        this.description = description;
        this.dayOfWeek = dayOfWeek;
        this.priority = priority;
    }

    @Ignore
    public Note(String description, String dayOfWeek, String priority) {
        this.description = description;
        this.dayOfWeek = dayOfWeek;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public String getPriority() {
        return priority;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}

