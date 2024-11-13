package com.example.testapp

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import android.os.Bundle

class TestContentProvider: ContentProvider() {
    override fun onCreate(): Boolean = true

    override fun query(p0: Uri, p1: Array<out String>?, p2: String?, p3: Array<out String>?, p4: String?): Cursor? {
        println("query $p0 $p1 $p2 $p3 $p4")
        return null
    }

    override fun getType(p0: Uri): String? {
        println("getType $p0")
        return null
    }

    override fun insert(p0: Uri, p1: ContentValues?): Uri? {
        println("insert $p0 $p1")
        return null
    }

    override fun delete(p0: Uri, p1: String?, p2: Array<out String>?): Int {
        println("delete $p0 $p1 $p2")
        return 0
    }

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int {
        println("update $p0 $p1 $p2 $p3")
        return 0
    }

    override fun call(method: String, arg: String?, extras: Bundle?): Bundle? {
        println("call-1 $method $arg $extras")
        return super.call(method, arg, extras)
    }

    override fun call(authority: String, method: String, arg: String?, extras: Bundle?): Bundle? {
        println("call-2 $authority $method $arg $extras")
        return super.call(authority, method, arg, extras)
    }
}