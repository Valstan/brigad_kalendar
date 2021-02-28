package com.example.brigad_kalendar.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase

class MyDbManager(context: Context) {

    val MyDbHelper = com.example.brigad_kalendar.db.MyDbHelper(context)
    var db: SQLiteDatabase? = null

    fun openDB() {
        db = MyDbHelper.writableDatabase
    }

    fun closeDB(){
        MyDbHelper.close()
    }

    fun insertDB(time: String, date: String, bri: String, mi: String, task: String, holy: String) {

        val values = ContentValues().apply {
            put(MyDbNameClass.COLUMN_NAME_TIME, time)
            put(MyDbNameClass.COLUMN_NAME_DATE, date)
            put(MyDbNameClass.COLUMN_NAME_BRI, bri)
            put(MyDbNameClass.COLUMN_NAME_MI, mi)
            put(MyDbNameClass.COLUMN_NAME_TASK, task)
            put(MyDbNameClass.COLUMN_NAME_HOLY, holy)
        }
        db?.insert(MyDbNameClass.TABLE_NAME, null, values)
    }

    fun readDbData() : ArrayList<String> {

        val dataList = ArrayList<String>()
        val cursor = db?.query(
                MyDbNameClass.TABLE_NAME, null, null, null,
                null, null, null,
        )
        with(cursor){
            while (this?.moveToNext()!!){
                val dataText = cursor?.getString(cursor.getColumnIndex(MyDbNameClass.COLUMN_NAME_DATE))
                dataList.add(dataText.toString())
            }
        }
        cursor?.close()
        return dataList

    }

}