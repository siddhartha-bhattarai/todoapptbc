package com.example.todoapptbc;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Database(entities = {Task.class}, version = 1, exportSchema = false)


@TypeConverters(DateConverter.class)
public abstract class AppDatabase extends RoomDatabase {


    private static  AppDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);


    static AppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "todo.db")
                            .build();
                }
            }
        }

        return INSTANCE;
    }


    public abstract TodoDao TodoDao();
}
