package com.example.brigad_kalendar.db

import android.provider.BaseColumns

object MyDbNameClass : BaseColumns {

    const val TABLE_NAME = "my_table"
    const val COLUMN_NAME_TIME = "time"
    const val COLUMN_NAME_DATE = "date"
    const val COLUMN_NAME_BRI = "brigadir"
    const val COLUMN_NAME_MI = "masterinst"
    const val COLUMN_NAME_TASK = "task"
    const val COLUMN_NAME_HOLY = "holyday"

    const val DATABASE_VERSION = 1
    const val DATABASE_NAME = "Brigadir.db"

    const val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS $TABLE_NAME (" +
            "${BaseColumns._ID} INTEGER PRIMARY KEY," +
            "$COLUMN_NAME_TIME TEXT," +
            "$COLUMN_NAME_DATE TEXT," +
            "$COLUMN_NAME_BRI TEXT," +
            "$COLUMN_NAME_MI TEXT," +
            "$COLUMN_NAME_TASK TEXT," +
            "$COLUMN_NAME_HOLY TEXT)"

    const val DELETE_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
}