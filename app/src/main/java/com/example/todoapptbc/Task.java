package com.example.todoapptbc;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;


@Entity(tableName = "tasks")

// compiler hint to create table in database

public class Task {
    // pojo class  - properties only held their

    @PrimaryKey
    @NonNull
    private int id;

    @NonNull
    private String title;

    @ColumnInfo(name = "created_at")
    private Date created_at;

    private String description;
    private int priority;


    public Task(String title, Date created_at, String description, int priority) {
        this.title = title;
        this.created_at = created_at;
        this.description = description;
        this.priority = priority;
    }


    @Ignore
    public Task(int id, String title, Date created_at, String description, int priority) {
        this.id = id;
        this.title = title;
        this.created_at = created_at;
        this.description = description;
        this.priority = priority;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }


    // status update_at
}
