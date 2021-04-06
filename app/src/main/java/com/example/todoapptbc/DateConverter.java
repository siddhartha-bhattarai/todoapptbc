package com.example.todoapptbc;

import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import java.util.Date;


public class DateConverter {


    @TypeConverter
    public static Date toDate(Long timeStamp){

         return timeStamp == null ? null : new Date(timeStamp);
     }



     @TypeConverter
     public  static Long toTimesStamp(Date date) {
        return date == null ? null : date.getTime();
     }


}
