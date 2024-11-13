package com.example.testapp

import android.content.Context
import android.net.Uri

class SampleContentResolver(context: Context) {
    private val contentResolver = context.contentResolver

    fun acquire() {
        println("Try to acquire")
        contentResolver.call(Uri.parse("content://my.authority"), "acquire", null, null)
    }
}