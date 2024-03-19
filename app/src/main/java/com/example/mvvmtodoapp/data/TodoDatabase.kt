package com.example.mvvmtodoapp.data

import androidx.room.RoomDatabase
import androidx.room.Database

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase: RoomDatabase() {

    abstract val dao: TodoDao
}