package com.example.todoapptbc;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
interface TodoDao {



    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Task task);


    @Query("DELETE FROM tasks")
    void deleteAll();


   @Delete
    void deleteTodo(Task task);


    @Update
    void updateTodo(Task task);


    @Query("SELECT * FROM tasks ORDER BY priority DESC")
    List<Task> getAllTasks();
}
