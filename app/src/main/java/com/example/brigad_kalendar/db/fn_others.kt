package com.example.brigad_kalendar.db

import java.text.SimpleDateFormat
import java.util.*

fun getTime(): String {
    val time = Calendar.getInstance().time
    val formatter = SimpleDateFormat("MM-dd", Locale.getDefault())
    val fTime = formatter.format(time)
    return fTime.toString()
}