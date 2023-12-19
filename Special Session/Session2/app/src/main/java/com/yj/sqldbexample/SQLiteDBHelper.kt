package com.yj.sqldbexample

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SQLiteDBHelper(context: Context)
    : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase?){
        val createSQL = "CREATE TABLE wordTable (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "synonym TEXT)"
        db?.execSQL(createSQL)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS wordTable")
        onCreate(db)
    }

    fun insertWord(word: Word) {
        val wd: SQLiteDatabase = writableDatabase
        wd.execSQL(
            "INSERT INTO wordTable (name, synonym) "
                    + " VALUES ('"
                    + word.name + "', '"
                    + word.synonym + "')"
        )
        // val row = ContentValues()
        // row.put("name", word.name)
        // row.put("synonym", word.synonym)
        // wd.insert("wordTable", null, row)
    }

    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "english-dict.db"
    }
}
