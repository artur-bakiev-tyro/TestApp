package com.example.testapp

import android.content.Context
import android.net.Uri
import android.os.Bundle

class SampleContentResolver(context: Context) {
    private val contentResolver = context.contentResolver

    fun acquire(): Bundle? {
        println("Try to acquire")
        return contentResolver.call(Uri.parse("content://my.authority"), "acquire", null, null)
    }
}