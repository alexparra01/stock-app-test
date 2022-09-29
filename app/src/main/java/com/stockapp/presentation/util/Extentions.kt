package com.stockapp.presentation.util

import android.text.format.DateFormat
import java.util.*

fun Long.convertTimeStamp(): String {
    val calendar = Calendar.getInstance(Locale.ENGLISH)
    calendar.timeInMillis = this * 1000L
    return DateFormat.format("dd MMM yyyy",calendar).toString()
}