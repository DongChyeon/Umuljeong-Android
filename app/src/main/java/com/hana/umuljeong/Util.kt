package com.hana.umuljeong

import java.text.SimpleDateFormat
import java.util.*

fun getCurrentTime(): String {
    val formatter = SimpleDateFormat("yyyy.MM.dd", Locale.getDefault())
    return formatter.format(Calendar.getInstance().time)
}

fun isValidString(str: String, regEx: String): Boolean {
    return str.matches(regEx.toRegex())
}

fun getFormattedTime(seconds: Int): String {
    val minute = seconds / 60
    val second = seconds % 60

    return String.format("%02d : %02d", minute, second)
}